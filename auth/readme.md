###设计模式之美实战之鉴权设计
流程：
- client 
  - 加密appid,时间戳,密码,baseurl生成token
  - 拼接token+appid+时间戳+baseurl 得到fullUrl请求服务端
- server
    - 解析出baseurl,appid,时间戳 
    - 检查超时
    - 获取appid对应密码，通过同样的加密算法生成token比较是否一致

####职责
- 1.使用baseurl,appid,密码,时间戳 生成token
- 2.拼接token+appid+时间戳+baseurl 得到fullUrl
- 3.解析fullUrl得到baseurl,appid,时间戳 
- 4.检查token超时
- 5.获取appid对应密码
- 6.生成token比较是否一致

####划分职责 -> 类
- 1,4,6 直接相关token -> AuthToken
- 2,3 直接相关fullUrl -> ApiRequest(FullUrl)
- 5 通过appid获取密码 -> Storage

    

