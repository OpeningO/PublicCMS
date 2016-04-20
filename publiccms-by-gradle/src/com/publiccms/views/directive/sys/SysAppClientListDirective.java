package com.publiccms.views.directive.sys;

// Generated 2016-3-1 17:24:12 by com.sanluan.common.source.SourceMaker

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.publiccms.common.base.AbstractTemplateDirective;
import com.publiccms.logic.service.sys.SysAppClientService;
import com.sanluan.common.handler.PageHandler;
import com.sanluan.common.handler.RenderHandler;

@Component
public class SysAppClientListDirective extends AbstractTemplateDirective {

    @Override
    public void execute(RenderHandler handler) throws IOException, Exception {
        Boolean disabled = handler.getBoolean("disabled", false);
        if (!handler.getBoolean("admin", false)) {
            disabled = false;
        }
        PageHandler page = service.getPage(getSite(handler).getId(), handler.getString("channel"), handler.getInteger("userId"),
                handler.getBoolean("allowPush"), handler.getDate("startLastLoginDate"), handler.getDate("endLastLoginDate"),
                handler.getDate("startCreateDate"), handler.getDate("endCreateDate"), disabled, handler.getString("orderField"),
                handler.getString("orderType"), handler.getInteger("pageIndex", 1), handler.getInteger("count", 30));
        handler.put("page", page).render();
    }

    @Autowired
    private SysAppClientService service;

}