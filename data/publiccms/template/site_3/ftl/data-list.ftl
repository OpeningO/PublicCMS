	<li>
		<h3><span>${a.publishDate?date}</span><a href="<#if a.onlyUrl>${site.dynamicPath}content/redirect?id=${a.id}<#else>${a.url!}</#if>">${a.title}</a></h3>
		<a href="<#if a.onlyUrl>${site.dynamicPath}content/redirect?id=${a.id}<#else>${a.url!}</#if>">
<#if a.cover?has_content><img src="<@_thumb path=a.cover width=144 height=192/>" alt="${a.title}"/></#if>
<#if a.hasImages>
      <@_contentFileList contentId=a.id image=true count=2>
		<#list page.list as i>
			<img src="<@_thumb path=i.filePath width=144 height=192/>" alt="${a.title}"/>
		</#list>
		</@_contentFileList>
</#if>
		</a>
		<p<#if a.hasImages> class="clearfix-before"</#if>><@t.cut a.description!'' 100 '...'/><a href="<#if a.onlyUrl>${site.dynamicPath}content/redirect?id=${a.id}<#else>${a.url!}</#if>"> 详细 &gt;&gt;</a></p>
		<div class="clearfix-before"></div>
	</li>