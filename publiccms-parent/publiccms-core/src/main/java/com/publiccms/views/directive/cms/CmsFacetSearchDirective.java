package com.publiccms.views.directive.cms;

// Generated 2015-5-10 17:54:56 by com.publiccms.common.source.SourceGenerator

import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.publiccms.common.base.AbstractTemplateDirective;
import com.publiccms.common.base.HighLighterQuery;
import com.publiccms.common.handler.FacetPageHandler;
import com.publiccms.common.handler.RenderHandler;
import com.publiccms.common.tools.CommonUtils;
import com.publiccms.entities.cms.CmsContent;
import com.publiccms.entities.sys.SysSite;
import com.publiccms.logic.component.site.StatisticsComponent;
import com.publiccms.logic.component.template.TemplateComponent;
import com.publiccms.logic.service.cms.CmsContentService;
import com.publiccms.views.pojo.entities.CmsContentStatistics;

/**
 *
 * CmsFacetSearchDirective
 * 
 */
@Component
public class CmsFacetSearchDirective extends AbstractTemplateDirective {

    @Override
    public void execute(RenderHandler handler) throws IOException, Exception {
        String word = handler.getString("word");
        Long[] tagIds = handler.getLongArray("tagId");
        String[] dictionaryValues = handler.getStringArray("dictionaryValues");
        if (CommonUtils.notEmpty(word) || CommonUtils.notEmpty(tagIds) || CommonUtils.notEmpty(dictionaryValues)) {
            SysSite site = getSite(handler);
            if (CommonUtils.notEmpty(word)) {
                statisticsComponent.search(site.getId(), word);
            }
            if (CommonUtils.notEmpty(tagIds)) {
                for (Long tagId : tagIds) {
                    statisticsComponent.searchTag(tagId);
                }
            }
            FacetPageHandler page;
            Integer pageIndex = handler.getInteger("pageIndex", 1);
            Integer count = handler.getInteger("pageSize", handler.getInteger("count", 30));
            Date currentDate = CommonUtils.getMinuteDate();
            HighLighterQuery highLighterQuery = new HighLighterQuery(handler.getBoolean("highlight", false));
            if (highLighterQuery.isHighlight()) {
                highLighterQuery.setPreTag(handler.getString("preTag"));
                highLighterQuery.setPostTag(handler.getString("postTag"));
            }
            try {
                page = service.facetQuery(site.getId(), handler.getBoolean("projection", false),
                        handler.getBoolean("phrase", false), highLighterQuery, word, handler.getStringArray("field"), tagIds,
                        handler.getIntegerArray("categoryId"), handler.getStringArray("modelId"), dictionaryValues,
                        handler.getDate("startPublishDate"), handler.getDate("endPublishDate", currentDate), currentDate,
                        handler.getString("orderField"), pageIndex, count);
                @SuppressWarnings("unchecked")
                List<CmsContent> list = (List<CmsContent>) page.getList();
                if (null != list) {
                    list.forEach(e -> {
                        CmsContentStatistics statistics = statisticsComponent.getContentStatistics(e.getId());
                        if (null != statistics) {
                            e.setClicks(e.getClicks() + statistics.getClicks());
                            e.setScores(e.getScores() + statistics.getScores());
                        }
                        templateComponent.initContentUrl(site, e);
                        templateComponent.initContentCover(site, e);
                    });
                }
            } catch (Exception e) {
                page = new FacetPageHandler(pageIndex, count);
            }
            handler.put("page", page).render();
        }
    }

    @Autowired
    private StatisticsComponent statisticsComponent;
    @Autowired
    private TemplateComponent templateComponent;
    @Autowired
    private CmsContentService service;

}