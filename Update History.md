### develop

程序功能修改
1. 取消外链不能引用限制
1. 取消引用内容查询限制引用
1. 增加原词库词条忽略功能
1. 后台登录增加sha512加密
1. 增加内容复制功能
1. 增加页面片段数据复制功能
1. 邮件发送增加抄送，秘密抄送，附件，发件人姓名等选项,收件人支持多个
1. 增加访问统计功能
1. 增加模板、静态文件、任务脚本git仓库同步功能(by https://github.com/qicz)
1. 增加更多投稿表单入口
1. 增加内容产品列表,增加产品订单、付款、退款、充值等功能
1. 增加模板导出导入功能,增加任务计划脚本导出导入功能

BUG与缺陷修复
1. 修复保存时勾选审核 静态化页面获取的内容状态不正确bug
1. 修复tag热度修改无效问题
1. 删除引用得内容时,更新对应的分类页面
1. 弹窗safari兼容性修复

模板相关修改

1. 修改所有表单请求.do后缀

### V4.0.202011.c

安全更新(https://github.com/sanluan/PublicCMS/issues/51)

### V4.0.202011.b

程序功能修改
1. 增加文件上传页面网站文件选择

BUG与缺陷修复
1. 站点地图模板示例保存后为空文件bug修复
1. 百度编辑器首次初始化过窄问题修复
1. 模板帮助可接受参数错误修复
1. ck编辑器加载异常修复
1. 内容移动大小写错误修改
1. 站点保存bug修复
1. 修改没有所有分类权限时展示逻辑
1. elasticsearch搜索复杂词汇高亮无效修改


### V4.0.202011.a

程序功能修改
1. 增加apache服务配置模板
1. 菜单调整,增加红色风格
1. 增加标题短语搜索模式
1. 搜索高亮增加elasticsearch兼容
1. 增加达梦数据库hibernate方言适配
1. 增加任务计划中断功能

### V4.0.202004.b

程序功能修改

1. 增加自定义分词库维护功能
1. 增加搜索结果高亮
1. 数据列表刷新优化
1. 百度编辑器清除格式增加style属性清理
1. 百度编辑器表情图片本地化
1. 增加用户邮箱验证模板示例
1. 后台UI适配IE8
1. 调整搜索非模糊模式距离级别
1. 增加后台UI回退功能

BUG与缺陷修复
1. 百度编辑器图片不能居中bug修复
1. 百度编辑器内容翻页重新编辑失效修复
1. 百度编辑器失效功能：音乐、webapp、截图工具删除
1. 百度编辑器无效的视频地址解析逻辑清理
1. 内容驳回逻辑错误修改
1. 邮件验证bug修复
1. 第三方登录模板示例与功能修复
1. 获取文件尺寸后 流未关闭修复
1. 数据库配置文件被创建为目录bug修复
1. 动态添加标签等JS特效导致的XSS修复(https://github.com/sanluan/PublicCMS/issues/37)
1. 内容驳回逻辑错误修改

模板相关修改

1. 启用搜索结果高亮时应该取消搜索结果字段安全转义，增加?no_esc方法

### V4.0.202004.a

框架升级

1. 所有JAVA框架升级到最新版本
1. JDK11、JDK13兼容性改进
1. 升级CKEditor编辑器到4.14.0
1. 升级Codemirror到5.52.0

程序功能修改

1. 增加投票、投票模板示例
1. 增加图片文件高度宽度记录
1. 增加动态模板可接受参数类型控制
1. 增加批量上传附件
1. 增加内容评分
1. 管理后台对手机屏幕适配
1. 后台语言增加繁体中文
1. 优化后台UI菜单溢出增加滚动条
1. 优化内容、分类链接地址存储
1. 安装页面兼容性修改
1. 百度编辑器word转存功能复制按钮改完html5方式
1. 删除分类编码回收
1. 删除内容静态文件删除
1. nginx配置模板增加https相关配置，增加tomcat https相关配置
1. 增加多数据源动态方言切换
1. 增加内容审核驳回
1. 增加apptoken刷新功能,增加设备绑定用户名验证
1. 增加hibernate实体生成代码

BUG与缺陷修复

1. 索引优化(https://github.com/sanluan/PublicCMS/issues/33)
1. 数据脚本可能执行危险SQL修改(https://github.com/sanluan/PublicCMS/issues/29)
1. 前台投稿造成的XSS攻击修复(https://github.com/sanluan/PublicCMS/issues/27)
1. 通过x-forwarded-for头信息伪造访客ip漏洞修复(https://github.com/sanluan/PublicCMS/issues/26)
1. 分类类型扩展字段描述信息XSS攻击修复(https://github.com/sanluan/PublicCMS/issues/25)
1. 跳转地址安全问题修复
1. HTTP响应截断修复
1. 运行被打断的任务计划，启动新节点恢复就绪状态

鸣谢
1. 感谢对PublicCMS渗透测试，并第一时间提交漏洞详情的各位

### V4.0.190312

框架升级

1. 除hibernate(最新版本对容器版本tomcat要求最低为9.0,暂不升级)外所有框架升级到最新
1. 数据库连接池更换为HikariCP

程序功能修改

1. 增加扩展字段值可搜索
1. 增加内容正文是否可搜索设置
1. 增加通用分词器,提升搜索结果准确性
1. 增加内容发布可以选择多个分类
1. 增加内容,页面片段自动取消发布
1. 增加站点地图示例模板
1. 增加评论功能,评论模板示例,评论数更新等
1. 增加内容审核接口,内容发布接口
1. html,富文本提交改为base64加密提交
1. redis缓存效率提升
1. 增加数据库时区设置
1. 数据库密码增加sha512(sha512(password)+salf)存储方式
1. 增加弱密码检测,提示修改
1. 内容附件增加文件类型
1. 增加内容列表,页面片段数据导出excel
1. 分类编码改为唯一字段,增加冲突验证,分类指令增加编码查询
1. 增加网站文件冲突检测
1. 内容等删除改为不刷新整页方式
1. 数据字典改为手动指定id
1. 修改第三方登录改为设备绑定方式
1. 增加扩展字段最大长度限制
1. UEditor word转存功能改为html5上传
1. 增加自定义中文分词功能

BUG与缺陷修复

1. 增加部门页面不能展示所有分类
1. 模块管理数据取消html存储(https://github.com/sanluan/PublicCMS/issues/22)

### V4.0.181024

框架升级

程序功能修改

1. 缓存增加j2cache实现
1. 增加日文语言文件
1. 取消redis缓存固定容量
1. 取内容时从缓存取得最新点击数
1. 增加缓存清理的同步保护

BUG与缺陷修复

1. 特定环境下页面与菜单国际化不一致BUG修复
1. ie onchange兼容性修复
1. 勾选后取消转载保存时提示字段为空bug修复
1. 不安全重定向问题修复(https://github.com/sanluan/PublicCMS/issues/17)
1. 用户名密码错误提示脆弱性修复(https://github.com/sanluan/PublicCMS/issues/18)

### V4.0.180825

框架升级

jdk最低要求升级到1.8
springboot升级为2.0.4

程序功能修改

1. 后台UI升级(新UI由同创蓝宇公司义务设计制作)
1. 增加kindeditor编辑器
1. 增加子站点功能
1. 增加动态页面参数加密验证url规则
1. 优先显示文件别名
1. 增加elasticsearch配置引导
1. 增加异步树实现
1. 删除jsonp方式接口,增加跨域配置选项
1. 将模板元数据与页面数据分开存储
1. 搜索增加避免查询数据库的参数
1. 增加邮件ssl选项
1. 模板上传，网站文件上传改为多个文件上传
1. 增加模板复制功能
1. 文件解压增加编码选择
1. 内存缓存增加超时处理
1. 用户增加是否拥有全部权限功能
1. app token,email token,user token改为有效日期方式
1. 扩展字段类型增加视频类型
1. 用户名昵称验证规则改为特殊字符过滤
1. 第三方登录功能完善
1. springboot方式启动增加真实scheme传递

BUG与缺陷修复

1. 对象比较用!=问题
1. 删除测试数据中没用的分类
1. LinkedProperties线程安全处理
1. 临时目录被操作系统删除问题
1. search指令categoryId参数无效问题
1. 减少特定场景数据库访问
1. 缓存模板增加内存锁
1. 部门成员管理用户已有角色默认没勾选缺陷
1. 演示账号安全问题
1. 测试数据脚本错误
1. 调大数据库连接池默认配置
1. 邮件发送错误修复
1. 内容选择页面标题查询无效BUG

### V4.0.180707

框架升级

程序功能修改

1. 增加一个演示站点,带中英文切换功能
1. 增加后台菜单与页面国际化
1. 增加搜索结果排序
1. 后台UI修改
1. 删除投票，抽奖功能
1. 删除getDateNumber扩展函数
1. 增加登录页面语言切换
1. 美化模板示例代码与模板帮助代码,增加多语言页面示例
1. 代码生成工具对站点ID做默认处理
1. 将集群节点监控,系统监控等放到站点管理中
1. 后台菜单主键改为手动指定
1. 站点管理中添加域名时增加通配域名,域名模板根目录配置
1. 增加分类高级选项隐藏功能
1. 页面管理中增加页面片段管理入口
1. 工作台增加用户统计数据展示
1. SQL脚本提升兼容性
1. 增加网站文件排序功能
1. 页面片段默认0条有效数据
1. 分类指令,页面片段数据指令增加返回扩展属性选项
1. 增加浏览器返回拦截

BUG与缺陷修复

1. CSRF(https://github.com/sanluan/PublicCMS/issues/11)
1. Directory Traversal(https://github.com/sanluan/PublicCMS/issues/12)
1. Unsafe Unzip(https://github.com/sanluan/PublicCMS/issues/13)
1. XML解析功能XXE漏洞
1. 推荐位管理人员选择bug
1. redis缓存前缀丢失bug
1. 定制接口提示未授权bug
1. 百度编辑器插入视频后无法保存bug
1. 指令新增文章延迟显示问题
1. 内容增加页面系统字段是否必填无效bug
1. 站点编辑页面回车提交表单优化
1. IPV6兼容性优化
1. 推荐位数据条数失控bug
1. 页面片段权限控制bug
1. redis连接池重复创建bug
1. 数据字典增加站点属性
1. 页面片段投稿显示不正常
1. 添加子分类不支持分类类型选择缺陷

模板相关修改

1. 缩略图路径不包含site.sitePath

### V4.0.20180210

框架升级

程序功能修改

1. 框架版本更新
1. UI集成codemirror,并增加Ctrl键代码提示功能
1. 新增CK编辑器
1. 静态资源新增编辑功能
1. 新增用户数据监控
1. 模型可配置内容字段
1. 新增数据库密码加密存储,优先于不加密数据库密码
1. 新增后台执行sql功能
1. 新增任务计划脚本直接执行功能
1. 新增产品授权相关功能
1. 代码生成器代码更新
1. 抽象升级器
1. 动态页面路径增加rest风格支持
1. 上传文件大小大小改为MB
1. 完善全文搜索,删除过时的Filter
1. siteId改为short类型
1. 取消大部分import static写法
1. 默认从正文中获取内容描述

BUG与缺陷修复

1. 内容查看页面展示所有附件bug
1. redis组件集群缓存失效问题
1. 数据库脚本bug
1. 部门页面增加用户bug
1. 分类选择、模块选择页面bug
1. 弹窗页面翻页、设置每页数据大小问题
1. 完善安装跳转,解决浏览器缓存问题
1. 增加扩展字段保留关键字提示,首字母必须位字母校验
1. 已存在扩展字段修改保存后消失bug

模板相关修改

1. 取消专用模板片段,改为所有模板都可被引用
1. 分页方法getPage增加动态页面分页支持、REST风格支持

### 2017.0708

框架升级:

1. Spring 4.3.9.RELEASE
1. Spring Boot 1.5.4.RELEASE
1. Hibernate 5.1.7.Final
1. Hibernate Search 5.6.2.Final

BUG修复:

1. 指令获取数组，参数为空字符串时报错问题
1. 分类查询可能产生空指针问题
1. 模块非菜单隐藏问题
1. 分类设置前台隐藏导致后台也隐藏问题
1. 后台用户管理禁用了还能登录
1. 选择用户、内容后不能清空
1. 代码生成工具
1. maven配置工程后，提示库URI冲突问题
1. 缓存不命中问题
1. 内容推荐问题

新增功能:

1. 页面片段/推荐位权限管理
1. 增加多数据源实例代码
1. 内容回收站
1. 分类类型修改
1. 内容查看，推荐位数据查看
1. 增加内容置顶
1. 部门负责人部门人员管理功能
1. 数据字典管理
1. 扩展字段新增数据字典类型

其他提升:

1. 将页面片段从页面中独立出来
1. 工程结构调整
1. 增加商业版本认证和标识
1. 安装引导页面改进
1. 数据目录没有读写权限时，使用默认目录路径

### 2017.0520

框架升级:

1. Freemarker 2.3.26-incubating
1. Jackson 2.8.8
1. Spring 4.3.8.RELEASE
1. Spring Boot 1.5.3.RELEASE
1. Quartz 2.3.0
1. lucene 5.5.4
1. Hibernate 5.1.6.Final
1. Hibernate Search 5.6.1.Final
1. Mybatis 3.4.4
1. C3p0 0.9.5.2

BUG修复:

1. CMS部署路径有空格时配置错误
1. 导入数据库脚本乱码
1. 内容列表没有子内容模型新建按钮
1. 网站文件列表中查看文件路径错误
1. 高版本Mysql打印警告信息修复
1. 推荐位匿名投稿错误
1. 删除分类后父分类childIds不为空错误
1. 模板帮助getDateNumber错误
1. 分类类型删除提示有分类已使用错误
1. Chrome浏览器上传文件按钮反应延迟
1. 500错误页面报错信息不支持Throwable类型
1. 我的登陆日志不能过滤成功登陆类型

新增功能:

1. 前台推荐位投稿管理
1. 内容投稿
1. 内容投稿模板帮助
1. 启动命令指定数据目录位置

其他提升:

1. 删除cms_content_tag表及相关代码
1. 界面修改、字体行距等调大
1. 将数据库配置文件位置改为数据目录下
1. 将包名改为org.publiccms,将com.sanluan包独立到publiccms-common工程
1. 统计代码清理
1. 取消cms.autoInstall配置文件项
1. 将数据库配置文件改到数据目录中

### V2017.0318

BUG修复:

1. 内容推荐bug
1. 用户扩展字段类型bug
1. 用户添加bug
1. 部分敏感数据接口增加授权限制
1. 扩展字段为空时 显示全部扩展字段bug
1. 推荐位前台提交表单匿名提交空指针错误
1. 分类管理点击修改时提示需要选择信息bug
1. 管理后台新增用户、修改用户提示密码不一致bug
1. 推荐位内容翻页bug
1. 删除任务计划时错删模板文件bug

框架升级:

1. Spring Framework升级到4.3.7
1. Hibernate Search升级到5.5.6
1. Hibernate升级到5.1.3
1. Jackson升级到2.8.6
1. mysql-connector-java升级到5.1.40
1. 源码与gralde,maven配置分离
1. 新增gradle、maven插件：maven-eclipse，maven-idea，gradle-idea

新增功能:

1. 新增免重启的数据库配置、初始化、升级引导程序
1. 新增静态文件管理
1. 新增配置管理
1. 新增站点默认设置
1. 新增部署错误提示
1. 新增工程内置默认动态站点
1. 新增多站点静态文件支持
1. 新增域名格式提示
1. 新增通配域名设置
1. 新增分类是否包含子分类内容设置
1. 新增模块是否作为菜单展示设置
1. 新增分词器设置、默认中文分词器
1. 新增关键词处理函数
1. 新增UserAgeent获取指令，UserAgent解析函数
1. 新增模板demo
1. 新增模板制作帮助页面
1. 新增推荐位异步渲染支持
1. 新增多条内容、分类、推荐位扩展字段获取函数
1. 新增接口授权功能

其他提升:

1. 新增Spring Boot启动方式支持
1. 持久层增加Mybatis
1. 新增Hibernate Redis缓存组件
1. 重构内存缓存、增加redis缓存支持
1. 取消大部分匿名类写法
1. 增加内容扩展字段类型
1. 将方法内可复用变量提升为类静态变量
1. 配置中心登陆注册设置合并
1. 邮件发送改为线程池执行发送任务
1. 域名取消端口区分
1. 模板默认所有输出进行HTML转义
1. 关联关系表取消自增主键改为联合主键
1. 界面修改，LOGO修改
1. 模型由数据库存储改为文件存储
1. 简化站点配置，站点取消资源站点属性
1. 配置文件结构调整
1. 优化推荐位输出
1. 优化jsonp支持，安全性提升
1. 接口测试页面美化
1. 指令自定义名称支持
1. 优化配置文件结构及路径

模板升级所需修改：

1. 需要以HTML输出的字段需要加 ?no_esc
1. 取消所有?html内置函数调用
1. 将数据目录中resource目录下所有文件移动到web目录下，将模板中所有site.resourcePath改为site.sitePath

数据库升级所需修改：

1. 将配置文件中cms.autoInstall设置为true,启动项目后访问首页，进入启动引导程序，然后选择升级数据库

## V2016.0828

框架升级:

1. Spring Framework升级到4.3.2
1. Hibernate Search升级到5.5.4
1. Hibernate升级到5.1.1
1. FreeMarker升级到2.3.25-incubating
1. Jackson升级到2.8.1

BUG修复:

1. 分类扩展字段展示错误修复
1. 内容推送到页面时标题乱码修复
1. 域名管理错别字修改
1. Nginx建议配置页面错误修复
1. 多数据源支持增加复位操作
1. 任务计划脚本修改路径错误修复
1. 域名绑定子目录时元数据路径错误修复
1. 模板编辑推荐位页面不能选择使用推荐位错误修复
1. 用户名密码等去空格处理
1. FTP服务LIST命令报文修复
1. 前台站点数字超千位输出错误

新增功能:

1. 新增配置中心
1. 将文件上传日志拆分为独立的表
1. 增加集群管理，任务计划集群环境处理
1. 后台增加JSP视图解决方案
1. 增加管理站点后台Public CMS新版本提示
1. 搜索词统计
1. 分类增加外链类型
1. 模块图标拆分为单独字段，图标直接选择使用
1. 增加日志配置文件

其他提升:

1. 后台当前站点信息提示
1. 后台工作台取消框架版本信息显示
1. 常量引用改完get方法方式
1. 接口改完restfull风格
1. 取消普通接口鉴权
1. 接口测试页面合并为一个，增加需要鉴权等提示
1. 取消文件列表缓存
1. getPageDataAttribute改为getPlaceAttribute
1. 将内容、用户、标签等数据ID改为long存储
1. 后台模板安全性提升
1. UI修改
1. 动态模板改完默认不允许访问
1. 动态模板可使用任何后缀

## V2016.0510

1. 动态站点新增分类保存500错误bug修复
1. 分类类型不能删除bug修复
1. 新增分类推荐，页面推荐
1. RenderHandler新增char类型处理

## V2016.0423

1. 前台站点增加登陆注册功能，友情链接提交功能
1. 网站模板取消使用SSI与不使用SSI的差异化
1. 后台删除模板时元数据未被删除bug修复
1. 后台任务计划生成静态化失败bug修复

## V2016

1. 新增动态模板在线编辑功能
1. 新增内容推荐
1. 新增内容附件列表
1. 新增内容移动功能
1. 新增内容刷新功能
1. 新增分类移动功能
1. 新增分类生成多页功能
1. 新增分类标签类型管理
1. 新增分类SEO优化设置
1. 新增页面元数据扩展功能
1. 新增支持FreeMarker与HTML语法混合的模板编辑器
1. 新增动态页面管理功能
1. 新增推荐位数据扩展功能
1. 新增动态模板可接受参数配置功能
1. 新增用户登录授权管理功能
1. 新增部门数据权限功能：页面权限，分类权限
1. 新增角色只读权功能，修复权限授权bug
1. 新FTP服务、FTP用户在线管理功能
1. 新增动态域名绑定管理功能
1. 新增站点管理功能
1. 新增分类，模块等排序功能
1. 新增应用授权功能
1. 新增定制接口及测试页面
1. 新增客户端管理

优化修改:

1. 任务计划脚本改为文件
1. 推荐位数据改为数据库存储
1. UI列表样式修改，性能优化
1. UI美观度提升，图标优化
1. 模板与工程彻底分离
1. 登陆超时改为弹出登陆对话框
1. 指令简化
