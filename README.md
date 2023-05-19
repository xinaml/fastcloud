模块说明:
commoms------------公共模块
    commoms-bean---公共实体类模块
    mysql_connect--mysql连接模块
    commoms-provider 服务提供者公共模块

service_modules------------订单服务模块
    order-api-----------------订单接口模块
    order-bean----------------订单实体类模块
    order-dao-----------------订单数据库操作模块
    order-provider------------订单服务提供者模块(注册到注册中心)
    payment-api-----------------支付接口模块
    payment-bean----------------支付实体类模块
    payment-dao-----------------支付数据库操作模块
    payment-provider------------支付服务提供者模块(注册到注册中心)

app------------向外提供服务
    test-api------------nacos1.4 测试模块
    xcx-web------------小程序服务提供模块