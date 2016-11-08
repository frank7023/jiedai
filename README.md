# jiedai - 借贷平台
> * jiedai-util 工具包;
> * jiedai-model 实体层; 依赖 jiedai-util
> * jiedai-erp 管理系统; 依赖 jiedai-model
> * jiedai-service rest/wap的接口业务处理; 依赖 jiedai-model
> * jiedai-rest APP版-接口; 依赖 jiedai-service
> * jiedai-wap wap版-接口; 依赖 jiedai-service
> * jiedai-pc PC版; 依赖 jiedai-model
> * jiedai-pay 支付管理; 依赖 jiedai-model
> * jiedai-task 定时任务; 依赖 jiedai-model
> * jiedai-redis 缓存管理; 依赖 jiedai-model
> * jiedai-chart 报表管理; 依赖 jiedai-model
> * jiedai-notify 通知管理; 依赖 jiedai-model
> * jiedai-message 消息管理; 
> * jiedai-activity 活动管理; 


# 定义 - 数据库表
产品-project
    project_info                      产品项目信息
    
会员-member
    member_info                       会员基础信息表
    member_location                   会员位置信息表
    member_device                     会员设备关联表
    member_blacklist                  会员黑名单表
    member_bankcard_info              会员-个人/企业:银行卡-基本信息
    member_bankcard_record            会员-个人/企业:银行卡-变更记录
    member_bankcard_ensure            会员-个人/企业:银行卡-确认信息 [第三方交互的数据]

个人-personal
    personal_info                     个人借贷:基本信息
    personal_record                   个人借贷:信息变更记录
    personal_account_info             个人借贷:账户-基本信息
    personal_account_record           个人借贷:账户-变更记录
    personal_loan_apply               个人借贷:借款申请
    personal_authorize_record         个人借贷:授信记录
    personal_audit_record             个人借贷:审核记录
    personal_loan_orders              个人借贷:借款订单
    personal_repayment_plan           个人借贷:还款计划
    personal_loan_record              个人借贷:打款记录
    personal_contract                 个人借贷:借款合同
    personal_signature                个人借贷:合同签章
    personal_repayment_record         个人借贷:还款记录
    personal_breach_record            个人借贷:违约记录
    
    personal_credit_type            会员征信类型
    personal_credit_record          会员征信信息
    personal_credit_record_history  会员征信历史记录
    
企业-company
    company_info                      企业借贷:基本信息
    company_record                    企业借贷:信息变更记录
    company_account_info              企业借贷:账户-基本信息
    company_account_record            企业借贷:账户-变更记录
    company_loan_apply                企业借贷:借款申请
    company_authorize_record          企业借贷:授信记录
    company_audit_record              企业借贷:审核记录
    company_loan_orders               企业借贷:借款订单
    company_repayment_plan            企业借贷:还款计划
    company_loan_record               企业借贷:打款记录
    company_contract                  企业借贷:借款合同
    company_signature                 企业借贷:合同签章
    company_repayment_record          企业借贷:还款记录
    company_breach_record             企业借贷:违约记录    
    
    company_credit_type           企业征信类型表（查询列表,查询明细,新增,修改,删除）
    company_credit_record         企业征信信息记录（查询列表,查询明细）
    company_credit_record_history 企业征信信息历史记录（查询列表,查询明细）
    
系统-system
    data_dict                         数据字典/动态枚举
    bank                              银行管理
    device                            设备信息
    channel                           渠道信息
    area                              位置信息
    
    picture                       图片
    account                       暂时未分配[待定]
    