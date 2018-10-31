package com.luying.pojo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * t_ct_touch 2018-10-31
 */
public class TCtTouch {
    //接续id
    private Long touchId;

    //创建用户id
    private Long crtUserId;

    //创建时间
    private Date crtTime;

    //创建应用系统id
    private String crtAppSysId;

    //修改用户id
    private Long modfUserId;

    //修改时间
    private Date modfTime;

    //修改应用系统id
    private String modfAppSysId;

    //样本id
    private Long sampId;

    //任务id
    private Long taskId;

    //任务资格id
    private Long taskQualifyId;

    //坐席id
    private Long seatId;

    //cti坐席工号
    private String ctiAgentId;

    //坐席所属公司id
    private Long spOrgId;

    //发包方组织id
    private Long erOrgId;

    //接续方式代码:0-任务呼叫，1-预约回拨，2-申请回拨，3-质检回拨
    private String touchModeCd;

    //接续开始时间
    private Date touchBgnTime;

    //接续结束时间
    private Date touchFinishTime;

    //呼叫座席标记内容(SerialID)
    private String callSeatMarkCntt;

    //呼叫标记内容(CallID)
    private String callMarkCntt;

    //坐席分机号，取振铃事件的opAgenID
    private String opAgentId;

    //坐席分机号，去振铃事件的AgentDn
    private String agentDn;

    //取振铃事件的ServiceDirect
    private String serviceDirect;

    //CTI主叫号码
    private String callingNum;

    //CTI被叫号码
    private String calledNum;

    //被叫客户真实号码,取振铃事件的UserDn
    private String calledCustNum;

    //被叫客户真实姓名
    private String calledCustName;

    //CTI原主叫号码
    private String origCallingNum;

    //CTI原被叫号码
    private String origCalledNum;

    //排队时长秒数(queueTime)
    private BigDecimal lnupTmlenSecCnt;

    //振铃时长秒数(计算)
    private BigDecimal ringTmlenSecCnt;

    //通话时长秒数(计算）
    private BigDecimal cnvstTmlenSecCnt;

    //挂机类型代码(暂时不用)
    private String onhookTypeCd;

    //呼叫轨迹内容(暂时不用）
    private String callTraceCntt;

    //ivr键值
    private String ivrKeyValue;

    //录音创建时间
    private Date rcdCrtTime;

    //录音文件名称
    private String rcdFileNm;

    //录音文件保存路径
    private String rcdFileSavePath;

    //录音文件服务器url路径
    private String rcdFileSvrUrlPath;

    //录音开始时间
    private Date rcdBgnTime;

    //录音结束时间
    private Date rcdFinishTime;

    //录音时长秒数
    private BigDecimal rcdTmlenSecCnt;

    //录音msserver
    private String msServer;

    //接通状态：0-已接通 1-未接通
    private String connectState;

    //主叫号码表id
    private Long erOrgCallingNumId;

    //分机标识
    private String telephoneNumber;

    //主叫号码显示
    private String taskCallingNum;

    //挂机方 1：座席挂断 2:对方挂断
    private Byte disconnectType;

    //振铃时间，取振铃的ringTime
    private Date ringTime;

    //区号，取振铃事件的AreaCode
    private String areaCode;

    //0000+01+6位企业标识+11+16位流水号（yyyyMMddHHmmss+2位自增数）
    private String autoTaskId;

    //用户振铃时长
    private Short userAlertTime;

    //坐席振铃时长
    private Short agentAlertTime;

    //质检抽取标记：0-未抽取，1-已抽取
    private String qualityExtractState;

    //版本号，乐观锁用于质检抽取
    private Integer version;

    //发包方组织机构名称
    private String erOrgName;

    //发包方组织构编码
    private String erOrgCode;

    //接包方组织机构名称
    private String spOrgName;

    //接包方组织机构编码
    private String spOrgCode;

    //坐席姓名
    private String seatRealName;

    //坐席编号
    private String seatCode;

    //任务名称
    private String taskName;

    //任务编号
    private String taskCode;

    /**
     * 接续id
     * @return touch_id 接续id
     */
    public Long getTouchId() {
        return touchId;
    }

    /**
     * 接续id
     * @param touchId 接续id
     */
    public void setTouchId(Long touchId) {
        this.touchId = touchId;
    }

    /**
     * 创建用户id
     * @return crt_user_id 创建用户id
     */
    public Long getCrtUserId() {
        return crtUserId;
    }

    /**
     * 创建用户id
     * @param crtUserId 创建用户id
     */
    public void setCrtUserId(Long crtUserId) {
        this.crtUserId = crtUserId;
    }

    /**
     * 创建时间
     * @return crt_time 创建时间
     */
    public Date getCrtTime() {
        return crtTime;
    }

    /**
     * 创建时间
     * @param crtTime 创建时间
     */
    public void setCrtTime(Date crtTime) {
        this.crtTime = crtTime;
    }

    /**
     * 创建应用系统id
     * @return crt_app_sys_id 创建应用系统id
     */
    public String getCrtAppSysId() {
        return crtAppSysId;
    }

    /**
     * 创建应用系统id
     * @param crtAppSysId 创建应用系统id
     */
    public void setCrtAppSysId(String crtAppSysId) {
        this.crtAppSysId = crtAppSysId == null ? null : crtAppSysId.trim();
    }

    /**
     * 修改用户id
     * @return modf_user_id 修改用户id
     */
    public Long getModfUserId() {
        return modfUserId;
    }

    /**
     * 修改用户id
     * @param modfUserId 修改用户id
     */
    public void setModfUserId(Long modfUserId) {
        this.modfUserId = modfUserId;
    }

    /**
     * 修改时间
     * @return modf_time 修改时间
     */
    public Date getModfTime() {
        return modfTime;
    }

    /**
     * 修改时间
     * @param modfTime 修改时间
     */
    public void setModfTime(Date modfTime) {
        this.modfTime = modfTime;
    }

    /**
     * 修改应用系统id
     * @return modf_app_sys_id 修改应用系统id
     */
    public String getModfAppSysId() {
        return modfAppSysId;
    }

    /**
     * 修改应用系统id
     * @param modfAppSysId 修改应用系统id
     */
    public void setModfAppSysId(String modfAppSysId) {
        this.modfAppSysId = modfAppSysId == null ? null : modfAppSysId.trim();
    }

    /**
     * 样本id
     * @return samp_id 样本id
     */
    public Long getSampId() {
        return sampId;
    }

    /**
     * 样本id
     * @param sampId 样本id
     */
    public void setSampId(Long sampId) {
        this.sampId = sampId;
    }

    /**
     * 任务id
     * @return task_id 任务id
     */
    public Long getTaskId() {
        return taskId;
    }

    /**
     * 任务id
     * @param taskId 任务id
     */
    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    /**
     * 任务资格id
     * @return task_qualify_id 任务资格id
     */
    public Long getTaskQualifyId() {
        return taskQualifyId;
    }

    /**
     * 任务资格id
     * @param taskQualifyId 任务资格id
     */
    public void setTaskQualifyId(Long taskQualifyId) {
        this.taskQualifyId = taskQualifyId;
    }

    /**
     * 坐席id
     * @return seat_id 坐席id
     */
    public Long getSeatId() {
        return seatId;
    }

    /**
     * 坐席id
     * @param seatId 坐席id
     */
    public void setSeatId(Long seatId) {
        this.seatId = seatId;
    }

    /**
     * cti坐席工号
     * @return cti_agent_id cti坐席工号
     */
    public String getCtiAgentId() {
        return ctiAgentId;
    }

    /**
     * cti坐席工号
     * @param ctiAgentId cti坐席工号
     */
    public void setCtiAgentId(String ctiAgentId) {
        this.ctiAgentId = ctiAgentId == null ? null : ctiAgentId.trim();
    }

    /**
     * 坐席所属公司id
     * @return sp_org_id 坐席所属公司id
     */
    public Long getSpOrgId() {
        return spOrgId;
    }

    /**
     * 坐席所属公司id
     * @param spOrgId 坐席所属公司id
     */
    public void setSpOrgId(Long spOrgId) {
        this.spOrgId = spOrgId;
    }

    /**
     * 发包方组织id
     * @return er_org_id 发包方组织id
     */
    public Long getErOrgId() {
        return erOrgId;
    }

    /**
     * 发包方组织id
     * @param erOrgId 发包方组织id
     */
    public void setErOrgId(Long erOrgId) {
        this.erOrgId = erOrgId;
    }

    /**
     * 接续方式代码:0-任务呼叫，1-预约回拨，2-申请回拨，3-质检回拨
     * @return touch_mode_cd 接续方式代码:0-任务呼叫，1-预约回拨，2-申请回拨，3-质检回拨
     */
    public String getTouchModeCd() {
        return touchModeCd;
    }

    /**
     * 接续方式代码:0-任务呼叫，1-预约回拨，2-申请回拨，3-质检回拨
     * @param touchModeCd 接续方式代码:0-任务呼叫，1-预约回拨，2-申请回拨，3-质检回拨
     */
    public void setTouchModeCd(String touchModeCd) {
        this.touchModeCd = touchModeCd == null ? null : touchModeCd.trim();
    }

    /**
     * 接续开始时间
     * @return touch_bgn_time 接续开始时间
     */
    public Date getTouchBgnTime() {
        return touchBgnTime;
    }

    /**
     * 接续开始时间
     * @param touchBgnTime 接续开始时间
     */
    public void setTouchBgnTime(Date touchBgnTime) {
        this.touchBgnTime = touchBgnTime;
    }

    /**
     * 接续结束时间
     * @return touch_finish_time 接续结束时间
     */
    public Date getTouchFinishTime() {
        return touchFinishTime;
    }

    /**
     * 接续结束时间
     * @param touchFinishTime 接续结束时间
     */
    public void setTouchFinishTime(Date touchFinishTime) {
        this.touchFinishTime = touchFinishTime;
    }

    /**
     * 呼叫座席标记内容(SerialID)
     * @return call_seat_mark_cntt 呼叫座席标记内容(SerialID)
     */
    public String getCallSeatMarkCntt() {
        return callSeatMarkCntt;
    }

    /**
     * 呼叫座席标记内容(SerialID)
     * @param callSeatMarkCntt 呼叫座席标记内容(SerialID)
     */
    public void setCallSeatMarkCntt(String callSeatMarkCntt) {
        this.callSeatMarkCntt = callSeatMarkCntt == null ? null : callSeatMarkCntt.trim();
    }

    /**
     * 呼叫标记内容(CallID)
     * @return call_mark_cntt 呼叫标记内容(CallID)
     */
    public String getCallMarkCntt() {
        return callMarkCntt;
    }

    /**
     * 呼叫标记内容(CallID)
     * @param callMarkCntt 呼叫标记内容(CallID)
     */
    public void setCallMarkCntt(String callMarkCntt) {
        this.callMarkCntt = callMarkCntt == null ? null : callMarkCntt.trim();
    }

    /**
     * 坐席分机号，取振铃事件的opAgenID
     * @return op_agent_id 坐席分机号，取振铃事件的opAgenID
     */
    public String getOpAgentId() {
        return opAgentId;
    }

    /**
     * 坐席分机号，取振铃事件的opAgenID
     * @param opAgentId 坐席分机号，取振铃事件的opAgenID
     */
    public void setOpAgentId(String opAgentId) {
        this.opAgentId = opAgentId == null ? null : opAgentId.trim();
    }

    /**
     * 坐席分机号，去振铃事件的AgentDn
     * @return agent_dn 坐席分机号，去振铃事件的AgentDn
     */
    public String getAgentDn() {
        return agentDn;
    }

    /**
     * 坐席分机号，去振铃事件的AgentDn
     * @param agentDn 坐席分机号，去振铃事件的AgentDn
     */
    public void setAgentDn(String agentDn) {
        this.agentDn = agentDn == null ? null : agentDn.trim();
    }

    /**
     * 取振铃事件的ServiceDirect
     * @return service_direct 取振铃事件的ServiceDirect
     */
    public String getServiceDirect() {
        return serviceDirect;
    }

    /**
     * 取振铃事件的ServiceDirect
     * @param serviceDirect 取振铃事件的ServiceDirect
     */
    public void setServiceDirect(String serviceDirect) {
        this.serviceDirect = serviceDirect == null ? null : serviceDirect.trim();
    }

    /**
     * CTI主叫号码
     * @return calling_num CTI主叫号码
     */
    public String getCallingNum() {
        return callingNum;
    }

    /**
     * CTI主叫号码
     * @param callingNum CTI主叫号码
     */
    public void setCallingNum(String callingNum) {
        this.callingNum = callingNum == null ? null : callingNum.trim();
    }

    /**
     * CTI被叫号码
     * @return called_num CTI被叫号码
     */
    public String getCalledNum() {
        return calledNum;
    }

    /**
     * CTI被叫号码
     * @param calledNum CTI被叫号码
     */
    public void setCalledNum(String calledNum) {
        this.calledNum = calledNum == null ? null : calledNum.trim();
    }

    /**
     * 被叫客户真实号码,取振铃事件的UserDn
     * @return called_cust_num 被叫客户真实号码,取振铃事件的UserDn
     */
    public String getCalledCustNum() {
        return calledCustNum;
    }

    /**
     * 被叫客户真实号码,取振铃事件的UserDn
     * @param calledCustNum 被叫客户真实号码,取振铃事件的UserDn
     */
    public void setCalledCustNum(String calledCustNum) {
        this.calledCustNum = calledCustNum == null ? null : calledCustNum.trim();
    }

    /**
     * 被叫客户真实姓名
     * @return called_cust_name 被叫客户真实姓名
     */
    public String getCalledCustName() {
        return calledCustName;
    }

    /**
     * 被叫客户真实姓名
     * @param calledCustName 被叫客户真实姓名
     */
    public void setCalledCustName(String calledCustName) {
        this.calledCustName = calledCustName == null ? null : calledCustName.trim();
    }

    /**
     * CTI原主叫号码
     * @return orig_calling_num CTI原主叫号码
     */
    public String getOrigCallingNum() {
        return origCallingNum;
    }

    /**
     * CTI原主叫号码
     * @param origCallingNum CTI原主叫号码
     */
    public void setOrigCallingNum(String origCallingNum) {
        this.origCallingNum = origCallingNum == null ? null : origCallingNum.trim();
    }

    /**
     * CTI原被叫号码
     * @return orig_called_num CTI原被叫号码
     */
    public String getOrigCalledNum() {
        return origCalledNum;
    }

    /**
     * CTI原被叫号码
     * @param origCalledNum CTI原被叫号码
     */
    public void setOrigCalledNum(String origCalledNum) {
        this.origCalledNum = origCalledNum == null ? null : origCalledNum.trim();
    }

    /**
     * 排队时长秒数(queueTime)
     * @return lnup_tmlen_sec_cnt 排队时长秒数(queueTime)
     */
    public BigDecimal getLnupTmlenSecCnt() {
        return lnupTmlenSecCnt;
    }

    /**
     * 排队时长秒数(queueTime)
     * @param lnupTmlenSecCnt 排队时长秒数(queueTime)
     */
    public void setLnupTmlenSecCnt(BigDecimal lnupTmlenSecCnt) {
        this.lnupTmlenSecCnt = lnupTmlenSecCnt;
    }

    /**
     * 振铃时长秒数(计算)
     * @return ring_tmlen_sec_cnt 振铃时长秒数(计算)
     */
    public BigDecimal getRingTmlenSecCnt() {
        return ringTmlenSecCnt;
    }

    /**
     * 振铃时长秒数(计算)
     * @param ringTmlenSecCnt 振铃时长秒数(计算)
     */
    public void setRingTmlenSecCnt(BigDecimal ringTmlenSecCnt) {
        this.ringTmlenSecCnt = ringTmlenSecCnt;
    }

    /**
     * 通话时长秒数(计算）
     * @return cnvst_tmlen_sec_cnt 通话时长秒数(计算）
     */
    public BigDecimal getCnvstTmlenSecCnt() {
        return cnvstTmlenSecCnt;
    }

    /**
     * 通话时长秒数(计算）
     * @param cnvstTmlenSecCnt 通话时长秒数(计算）
     */
    public void setCnvstTmlenSecCnt(BigDecimal cnvstTmlenSecCnt) {
        this.cnvstTmlenSecCnt = cnvstTmlenSecCnt;
    }

    /**
     * 挂机类型代码(暂时不用)
     * @return onhook_type_cd 挂机类型代码(暂时不用)
     */
    public String getOnhookTypeCd() {
        return onhookTypeCd;
    }

    /**
     * 挂机类型代码(暂时不用)
     * @param onhookTypeCd 挂机类型代码(暂时不用)
     */
    public void setOnhookTypeCd(String onhookTypeCd) {
        this.onhookTypeCd = onhookTypeCd == null ? null : onhookTypeCd.trim();
    }

    /**
     * 呼叫轨迹内容(暂时不用）
     * @return call_trace_cntt 呼叫轨迹内容(暂时不用）
     */
    public String getCallTraceCntt() {
        return callTraceCntt;
    }

    /**
     * 呼叫轨迹内容(暂时不用）
     * @param callTraceCntt 呼叫轨迹内容(暂时不用）
     */
    public void setCallTraceCntt(String callTraceCntt) {
        this.callTraceCntt = callTraceCntt == null ? null : callTraceCntt.trim();
    }

    /**
     * ivr键值
     * @return ivr_key_value ivr键值
     */
    public String getIvrKeyValue() {
        return ivrKeyValue;
    }

    /**
     * ivr键值
     * @param ivrKeyValue ivr键值
     */
    public void setIvrKeyValue(String ivrKeyValue) {
        this.ivrKeyValue = ivrKeyValue == null ? null : ivrKeyValue.trim();
    }

    /**
     * 录音创建时间
     * @return rcd_crt_time 录音创建时间
     */
    public Date getRcdCrtTime() {
        return rcdCrtTime;
    }

    /**
     * 录音创建时间
     * @param rcdCrtTime 录音创建时间
     */
    public void setRcdCrtTime(Date rcdCrtTime) {
        this.rcdCrtTime = rcdCrtTime;
    }

    /**
     * 录音文件名称
     * @return rcd_file_nm 录音文件名称
     */
    public String getRcdFileNm() {
        return rcdFileNm;
    }

    /**
     * 录音文件名称
     * @param rcdFileNm 录音文件名称
     */
    public void setRcdFileNm(String rcdFileNm) {
        this.rcdFileNm = rcdFileNm == null ? null : rcdFileNm.trim();
    }

    /**
     * 录音文件保存路径
     * @return rcd_file_save_path 录音文件保存路径
     */
    public String getRcdFileSavePath() {
        return rcdFileSavePath;
    }

    /**
     * 录音文件保存路径
     * @param rcdFileSavePath 录音文件保存路径
     */
    public void setRcdFileSavePath(String rcdFileSavePath) {
        this.rcdFileSavePath = rcdFileSavePath == null ? null : rcdFileSavePath.trim();
    }

    /**
     * 录音文件服务器url路径
     * @return rcd_file_svr_url_path 录音文件服务器url路径
     */
    public String getRcdFileSvrUrlPath() {
        return rcdFileSvrUrlPath;
    }

    /**
     * 录音文件服务器url路径
     * @param rcdFileSvrUrlPath 录音文件服务器url路径
     */
    public void setRcdFileSvrUrlPath(String rcdFileSvrUrlPath) {
        this.rcdFileSvrUrlPath = rcdFileSvrUrlPath == null ? null : rcdFileSvrUrlPath.trim();
    }

    /**
     * 录音开始时间
     * @return rcd_bgn_time 录音开始时间
     */
    public Date getRcdBgnTime() {
        return rcdBgnTime;
    }

    /**
     * 录音开始时间
     * @param rcdBgnTime 录音开始时间
     */
    public void setRcdBgnTime(Date rcdBgnTime) {
        this.rcdBgnTime = rcdBgnTime;
    }

    /**
     * 录音结束时间
     * @return rcd_finish_time 录音结束时间
     */
    public Date getRcdFinishTime() {
        return rcdFinishTime;
    }

    /**
     * 录音结束时间
     * @param rcdFinishTime 录音结束时间
     */
    public void setRcdFinishTime(Date rcdFinishTime) {
        this.rcdFinishTime = rcdFinishTime;
    }

    /**
     * 录音时长秒数
     * @return rcd_tmlen_sec_cnt 录音时长秒数
     */
    public BigDecimal getRcdTmlenSecCnt() {
        return rcdTmlenSecCnt;
    }

    /**
     * 录音时长秒数
     * @param rcdTmlenSecCnt 录音时长秒数
     */
    public void setRcdTmlenSecCnt(BigDecimal rcdTmlenSecCnt) {
        this.rcdTmlenSecCnt = rcdTmlenSecCnt;
    }

    /**
     * 录音msserver
     * @return ms_server 录音msserver
     */
    public String getMsServer() {
        return msServer;
    }

    /**
     * 录音msserver
     * @param msServer 录音msserver
     */
    public void setMsServer(String msServer) {
        this.msServer = msServer == null ? null : msServer.trim();
    }

    /**
     * 接通状态：0-已接通 1-未接通
     * @return connect_state 接通状态：0-已接通 1-未接通
     */
    public String getConnectState() {
        return connectState;
    }

    /**
     * 接通状态：0-已接通 1-未接通
     * @param connectState 接通状态：0-已接通 1-未接通
     */
    public void setConnectState(String connectState) {
        this.connectState = connectState == null ? null : connectState.trim();
    }

    /**
     * 主叫号码表id
     * @return er_org_calling_num_id 主叫号码表id
     */
    public Long getErOrgCallingNumId() {
        return erOrgCallingNumId;
    }

    /**
     * 主叫号码表id
     * @param erOrgCallingNumId 主叫号码表id
     */
    public void setErOrgCallingNumId(Long erOrgCallingNumId) {
        this.erOrgCallingNumId = erOrgCallingNumId;
    }

    /**
     * 分机标识
     * @return telephone_number 分机标识
     */
    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * 分机标识
     * @param telephoneNumber 分机标识
     */
    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber == null ? null : telephoneNumber.trim();
    }

    /**
     * 主叫号码显示
     * @return task_calling_num 主叫号码显示
     */
    public String getTaskCallingNum() {
        return taskCallingNum;
    }

    /**
     * 主叫号码显示
     * @param taskCallingNum 主叫号码显示
     */
    public void setTaskCallingNum(String taskCallingNum) {
        this.taskCallingNum = taskCallingNum == null ? null : taskCallingNum.trim();
    }

    /**
     * 挂机方 1：座席挂断 2:对方挂断
     * @return disconnect_type 挂机方 1：座席挂断 2:对方挂断
     */
    public Byte getDisconnectType() {
        return disconnectType;
    }

    /**
     * 挂机方 1：座席挂断 2:对方挂断
     * @param disconnectType 挂机方 1：座席挂断 2:对方挂断
     */
    public void setDisconnectType(Byte disconnectType) {
        this.disconnectType = disconnectType;
    }

    /**
     * 振铃时间，取振铃的ringTime
     * @return ring_time 振铃时间，取振铃的ringTime
     */
    public Date getRingTime() {
        return ringTime;
    }

    /**
     * 振铃时间，取振铃的ringTime
     * @param ringTime 振铃时间，取振铃的ringTime
     */
    public void setRingTime(Date ringTime) {
        this.ringTime = ringTime;
    }

    /**
     * 区号，取振铃事件的AreaCode
     * @return area_code 区号，取振铃事件的AreaCode
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * 区号，取振铃事件的AreaCode
     * @param areaCode 区号，取振铃事件的AreaCode
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    /**
     * 0000+01+6位企业标识+11+16位流水号（yyyyMMddHHmmss+2位自增数）
     * @return auto_task_id 0000+01+6位企业标识+11+16位流水号（yyyyMMddHHmmss+2位自增数）
     */
    public String getAutoTaskId() {
        return autoTaskId;
    }

    /**
     * 0000+01+6位企业标识+11+16位流水号（yyyyMMddHHmmss+2位自增数）
     * @param autoTaskId 0000+01+6位企业标识+11+16位流水号（yyyyMMddHHmmss+2位自增数）
     */
    public void setAutoTaskId(String autoTaskId) {
        this.autoTaskId = autoTaskId == null ? null : autoTaskId.trim();
    }

    /**
     * 用户振铃时长
     * @return user_alert_time 用户振铃时长
     */
    public Short getUserAlertTime() {
        return userAlertTime;
    }

    /**
     * 用户振铃时长
     * @param userAlertTime 用户振铃时长
     */
    public void setUserAlertTime(Short userAlertTime) {
        this.userAlertTime = userAlertTime;
    }

    /**
     * 坐席振铃时长
     * @return agent_alert_time 坐席振铃时长
     */
    public Short getAgentAlertTime() {
        return agentAlertTime;
    }

    /**
     * 坐席振铃时长
     * @param agentAlertTime 坐席振铃时长
     */
    public void setAgentAlertTime(Short agentAlertTime) {
        this.agentAlertTime = agentAlertTime;
    }

    /**
     * 质检抽取标记：0-未抽取，1-已抽取
     * @return quality_extract_state 质检抽取标记：0-未抽取，1-已抽取
     */
    public String getQualityExtractState() {
        return qualityExtractState;
    }

    /**
     * 质检抽取标记：0-未抽取，1-已抽取
     * @param qualityExtractState 质检抽取标记：0-未抽取，1-已抽取
     */
    public void setQualityExtractState(String qualityExtractState) {
        this.qualityExtractState = qualityExtractState == null ? null : qualityExtractState.trim();
    }

    /**
     * 版本号，乐观锁用于质检抽取
     * @return version 版本号，乐观锁用于质检抽取
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 版本号，乐观锁用于质检抽取
     * @param version 版本号，乐观锁用于质检抽取
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * 发包方组织机构名称
     * @return er_org_name 发包方组织机构名称
     */
    public String getErOrgName() {
        return erOrgName;
    }

    /**
     * 发包方组织机构名称
     * @param erOrgName 发包方组织机构名称
     */
    public void setErOrgName(String erOrgName) {
        this.erOrgName = erOrgName == null ? null : erOrgName.trim();
    }

    /**
     * 发包方组织构编码
     * @return er_org_code 发包方组织构编码
     */
    public String getErOrgCode() {
        return erOrgCode;
    }

    /**
     * 发包方组织构编码
     * @param erOrgCode 发包方组织构编码
     */
    public void setErOrgCode(String erOrgCode) {
        this.erOrgCode = erOrgCode == null ? null : erOrgCode.trim();
    }

    /**
     * 接包方组织机构名称
     * @return sp_org_name 接包方组织机构名称
     */
    public String getSpOrgName() {
        return spOrgName;
    }

    /**
     * 接包方组织机构名称
     * @param spOrgName 接包方组织机构名称
     */
    public void setSpOrgName(String spOrgName) {
        this.spOrgName = spOrgName == null ? null : spOrgName.trim();
    }

    /**
     * 接包方组织机构编码
     * @return sp_org_code 接包方组织机构编码
     */
    public String getSpOrgCode() {
        return spOrgCode;
    }

    /**
     * 接包方组织机构编码
     * @param spOrgCode 接包方组织机构编码
     */
    public void setSpOrgCode(String spOrgCode) {
        this.spOrgCode = spOrgCode == null ? null : spOrgCode.trim();
    }

    /**
     * 坐席姓名
     * @return seat_real_name 坐席姓名
     */
    public String getSeatRealName() {
        return seatRealName;
    }

    /**
     * 坐席姓名
     * @param seatRealName 坐席姓名
     */
    public void setSeatRealName(String seatRealName) {
        this.seatRealName = seatRealName == null ? null : seatRealName.trim();
    }

    /**
     * 坐席编号
     * @return seat_code 坐席编号
     */
    public String getSeatCode() {
        return seatCode;
    }

    /**
     * 坐席编号
     * @param seatCode 坐席编号
     */
    public void setSeatCode(String seatCode) {
        this.seatCode = seatCode == null ? null : seatCode.trim();
    }

    /**
     * 任务名称
     * @return task_name 任务名称
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * 任务名称
     * @param taskName 任务名称
     */
    public void setTaskName(String taskName) {
        this.taskName = taskName == null ? null : taskName.trim();
    }

    /**
     * 任务编号
     * @return task_code 任务编号
     */
    public String getTaskCode() {
        return taskCode;
    }

    /**
     * 任务编号
     * @param taskCode 任务编号
     */
    public void setTaskCode(String taskCode) {
        this.taskCode = taskCode == null ? null : taskCode.trim();
    }
}