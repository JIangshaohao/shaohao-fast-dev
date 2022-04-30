# shaohao-fast-dev-master

> 欢迎使用shaohao-fast-dev-master。相信此框架模板将会让你感受到代码带给你的多巴胺！

## 框架模板介绍
- 在本人的IT学习过程中，每次做项目都要四处寻找好看且合适的模板，真的是非常苦恼！
- 在之前做的项目中，从HTML-->JSP-->Vue，网上虽然有很多好看且免费的模板。但是却没有一款属于自己的...
- 就像茫茫人海，相遇本就不易。于是我便开始主动，我知道，自己不努力，是不会拥有的！
- 但是随着自己技术的逐渐增强，我意识到，我这牛逼的肾该干些什么了...咳咳...自己的一身本领应该要为自己做些什么了！（我是菜鸟）
- 于是，我开发了这么一套前后端分离的框架模板。
- 前端地址：https://gitee.com/jshForever/shaohao-fast-dev-vue-master

**项目说明** 
- 支持MySQL、Oracle、SQL Server、PostgreSQL等主流数据库
- 前端地址：https://gitee.com/jshForever/shaohao-fast-dev-vue-master
- 代码生成器：https://gitee.com/jshForever/shaohao-fast-dev-generator

<br>
 

**具有如下特点** 
- 友好的代码结构及注释，便于阅读及二次开发
- 实现前后端分离，通过token进行数据交互，前端再也不用关注后端技术
- 灵活的权限控制，可控制到页面或按钮，满足绝大部分的权限需求
- 页面交互使用Vue2.x，极大的提高了开发效率
- 完善的代码生成机制，可在线生成entity、xml、dao、service、vue、sql代码，减少70%以上的开发任务
- 引入quartz定时任务，可动态完成任务的添加、修改、删除、暂停、恢复及日志查看等功能
- 引入API模板，根据token作为登录令牌，极大的方便了APP接口开发
- 引入Hibernate Validator校验框架，轻松实现后端校验
- 引入云存储服务，已支持：七牛云、阿里云、腾讯云等
- 引入swagger文档支持，方便编写API接口文档
<br> 
##总而言之，你想怎么搞就怎么搞。你想的都有，满足你哦~

**项目结构** 
```
shaohao-fast-dev-master
├─db  项目SQL语句
│
├─common 公共模块
│  ├─aspect 系统日志
│  ├─exception 异常处理
│  ├─validator 后台校验
│  └─xss XSS过滤
│ 
├─config 配置信息
│ 
├─modules 功能模块
│  ├─app API接口模块(APP调用)
│  ├─job 定时任务模块
│  ├─oss 文件服务模块
│  └─sys 权限模块
│ 
├─ShaohaoApplication 项目启动类
│  
├──resources 
│  ├─mapper SQL对应的XML文件
│  └─static 静态资源

```
<br> 
<br> 


**技术选型：** 
- 核心框架：Spring Boot 2.1
- 安全框架：Apache Shiro 1.4
- 视图框架：Spring MVC 5.0
- 持久层框架：MyBatis 3.3
- 定时器：Quartz 2.3
- 数据库连接池：Druid 1.0
- 日志管理：SLF4J 1.7、Log4j
- 页面交互：Vue2.x 
<br> 


 **后端部署**
- 通过git下载源码
- idea、eclipse需安装lombok插件，不然会提示找不到entity的get set方法
- 创建数据库shaohao_fast_dev，数据库编码为UTF-8
- 执行db/mysql.sql文件，初始化数据
- 修改application-dev.yml，更新MySQL账号和密码
- Eclipse、IDEA运行ShaohaoApplication.java，则可启动项目
- Swagger文档路径：http://localhost:418/shaohao-fast-dev-master/swagger/index.html
- Swagger注解路径：http://localhost:418/shaohao-fast-dev-master/swagger-ui.html

<br> 

 **前端部署**
 - 本项目是前后端分离的，还需要部署前端，才能运行起来
 - 前端下载地址：https://gitee.com/jshForever/shaohao-fast-dev-vue-master
 - 前端部署完毕，就可以访问项目了，账号：admin，密码：admin
 
 <br>
