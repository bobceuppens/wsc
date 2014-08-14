package com.sforce.soap.partner.wsc130;

import com.sforce.ws.ConnectionException;
import com.sforce.ws.ConnectorConfig;
import com.sforce.ws.bind.XMLizable;
import com.sforce.ws.bind.TypeMapper;

import java.util.HashMap;

import javax.xml.namespace.QName;

/**
 * Generated by ConnectionCodeGenerator.java. Please do not edit.
 */
public class PartnerConnection {

  private TypeMapper __typeMapper = new TypeMapper();
  private ConnectorConfig __config;
  private HashMap<QName, XMLizable> __extraHeaders = new HashMap<QName, XMLizable>();

  public ConnectorConfig getConfig() {
    return __config;
  }

  private com.sforce.soap.partner.wsc130.LocaleOptions_element __LocaleOptions;

  public void setLocaleOptions(java.lang.String language) {
    __LocaleOptions = new com.sforce.soap.partner.wsc130.LocaleOptions_element();
    __LocaleOptions.setLanguage(language);
  }

  public void clearLocaleOptions() {
    __LocaleOptions = null;
  }

  public com.sforce.soap.partner.wsc130.LocaleOptions_element getLocaleOptions() {
    return  __LocaleOptions;
  }

  public void __setLocaleOptions(com.sforce.soap.partner.wsc130.LocaleOptions_element __header) {
    __LocaleOptions = __header ;
  }

  private com.sforce.soap.partner.wsc130.EmailHeader_element __EmailHeader;

  public void setEmailHeader(boolean triggerAutoResponseEmail,boolean triggerOtherEmail,boolean triggerUserEmail) {
    __EmailHeader = new com.sforce.soap.partner.wsc130.EmailHeader_element();
    __EmailHeader.setTriggerAutoResponseEmail(triggerAutoResponseEmail);
    __EmailHeader.setTriggerOtherEmail(triggerOtherEmail);
    __EmailHeader.setTriggerUserEmail(triggerUserEmail);
  }

  public void clearEmailHeader() {
    __EmailHeader = null;
  }

  public com.sforce.soap.partner.wsc130.EmailHeader_element getEmailHeader() {
    return  __EmailHeader;
  }

  public void __setEmailHeader(com.sforce.soap.partner.wsc130.EmailHeader_element __header) {
    __EmailHeader = __header ;
  }

  private com.sforce.soap.partner.wsc130.DebuggingInfo_element __DebuggingInfo;

  public void setDebuggingInfo(java.lang.String debugLog) {
    __DebuggingInfo = new com.sforce.soap.partner.wsc130.DebuggingInfo_element();
    __DebuggingInfo.setDebugLog(debugLog);
  }

  public void clearDebuggingInfo() {
    __DebuggingInfo = null;
  }

  public com.sforce.soap.partner.wsc130.DebuggingInfo_element getDebuggingInfo() {
    return  __DebuggingInfo;
  }

  public void __setDebuggingInfo(com.sforce.soap.partner.wsc130.DebuggingInfo_element __header) {
    __DebuggingInfo = __header ;
  }

  private com.sforce.soap.partner.wsc130.MruHeader_element __MruHeader;

  public void setMruHeader(boolean updateMru) {
    __MruHeader = new com.sforce.soap.partner.wsc130.MruHeader_element();
    __MruHeader.setUpdateMru(updateMru);
  }

  public void clearMruHeader() {
    __MruHeader = null;
  }

  public com.sforce.soap.partner.wsc130.MruHeader_element getMruHeader() {
    return  __MruHeader;
  }

  public void __setMruHeader(com.sforce.soap.partner.wsc130.MruHeader_element __header) {
    __MruHeader = __header ;
  }

  private com.sforce.soap.partner.wsc130.CallOptions_element __CallOptions;

  public void setCallOptions(java.lang.String client,java.lang.String defaultNamespace) {
    __CallOptions = new com.sforce.soap.partner.wsc130.CallOptions_element();
    __CallOptions.setClient(client);
    __CallOptions.setDefaultNamespace(defaultNamespace);
  }

  public void clearCallOptions() {
    __CallOptions = null;
  }

  public com.sforce.soap.partner.wsc130.CallOptions_element getCallOptions() {
    return  __CallOptions;
  }

  public void __setCallOptions(com.sforce.soap.partner.wsc130.CallOptions_element __header) {
    __CallOptions = __header ;
  }

  private com.sforce.soap.partner.wsc130.SessionHeader_element __SessionHeader;

  public void setSessionHeader(java.lang.String sessionId) {
    __SessionHeader = new com.sforce.soap.partner.wsc130.SessionHeader_element();
    __SessionHeader.setSessionId(sessionId);
  }

  public void clearSessionHeader() {
    __SessionHeader = null;
  }

  public com.sforce.soap.partner.wsc130.SessionHeader_element getSessionHeader() {
    return  __SessionHeader;
  }

  public void __setSessionHeader(com.sforce.soap.partner.wsc130.SessionHeader_element __header) {
    __SessionHeader = __header ;
  }

  private com.sforce.soap.partner.wsc130.DebuggingHeader_element __DebuggingHeader;

  public void setDebuggingHeader(com.sforce.soap.partner.wsc130.DebugLevel debugLevel) {
    __DebuggingHeader = new com.sforce.soap.partner.wsc130.DebuggingHeader_element();
    __DebuggingHeader.setDebugLevel(debugLevel);
  }

  public void clearDebuggingHeader() {
    __DebuggingHeader = null;
  }

  public com.sforce.soap.partner.wsc130.DebuggingHeader_element getDebuggingHeader() {
    return  __DebuggingHeader;
  }

  public void __setDebuggingHeader(com.sforce.soap.partner.wsc130.DebuggingHeader_element __header) {
    __DebuggingHeader = __header ;
  }

  private com.sforce.soap.partner.wsc130.LoginScopeHeader_element __LoginScopeHeader;

  public void setLoginScopeHeader(java.lang.String organizationId,java.lang.String portalId) {
    __LoginScopeHeader = new com.sforce.soap.partner.wsc130.LoginScopeHeader_element();
    __LoginScopeHeader.setOrganizationId(organizationId);
    __LoginScopeHeader.setPortalId(portalId);
  }

  public void clearLoginScopeHeader() {
    __LoginScopeHeader = null;
  }

  public com.sforce.soap.partner.wsc130.LoginScopeHeader_element getLoginScopeHeader() {
    return  __LoginScopeHeader;
  }

  public void __setLoginScopeHeader(com.sforce.soap.partner.wsc130.LoginScopeHeader_element __header) {
    __LoginScopeHeader = __header ;
  }

  private com.sforce.soap.partner.wsc130.UserTerritoryDeleteHeader_element __UserTerritoryDeleteHeader;

  public void setUserTerritoryDeleteHeader(java.lang.String transferToUserId) {
    __UserTerritoryDeleteHeader = new com.sforce.soap.partner.wsc130.UserTerritoryDeleteHeader_element();
    __UserTerritoryDeleteHeader.setTransferToUserId(transferToUserId);
  }

  public void clearUserTerritoryDeleteHeader() {
    __UserTerritoryDeleteHeader = null;
  }

  public com.sforce.soap.partner.wsc130.UserTerritoryDeleteHeader_element getUserTerritoryDeleteHeader() {
    return  __UserTerritoryDeleteHeader;
  }

  public void __setUserTerritoryDeleteHeader(com.sforce.soap.partner.wsc130.UserTerritoryDeleteHeader_element __header) {
    __UserTerritoryDeleteHeader = __header ;
  }

  private com.sforce.soap.partner.wsc130.QueryOptions_element __QueryOptions;

  public void setQueryOptions(int batchSize) {
    __QueryOptions = new com.sforce.soap.partner.wsc130.QueryOptions_element();
    __QueryOptions.setBatchSize(batchSize);
  }

  public void clearQueryOptions() {
    __QueryOptions = null;
  }

  public com.sforce.soap.partner.wsc130.QueryOptions_element getQueryOptions() {
    return  __QueryOptions;
  }

  public void __setQueryOptions(com.sforce.soap.partner.wsc130.QueryOptions_element __header) {
    __QueryOptions = __header ;
  }

  private com.sforce.soap.partner.wsc130.AssignmentRuleHeader_element __AssignmentRuleHeader;

  public void setAssignmentRuleHeader(java.lang.String assignmentRuleId,java.lang.Boolean useDefaultRule) {
    __AssignmentRuleHeader = new com.sforce.soap.partner.wsc130.AssignmentRuleHeader_element();
    __AssignmentRuleHeader.setAssignmentRuleId(assignmentRuleId);
    __AssignmentRuleHeader.setUseDefaultRule(useDefaultRule);
  }

  public void clearAssignmentRuleHeader() {
    __AssignmentRuleHeader = null;
  }

  public com.sforce.soap.partner.wsc130.AssignmentRuleHeader_element getAssignmentRuleHeader() {
    return  __AssignmentRuleHeader;
  }

  public void __setAssignmentRuleHeader(com.sforce.soap.partner.wsc130.AssignmentRuleHeader_element __header) {
    __AssignmentRuleHeader = __header ;
  }



  public PartnerConnection(ConnectorConfig config) throws ConnectionException {
    this.__config = config;
    this.__typeMapper.setPackagePrefix("wsc130");
    this.__typeMapper.setConfig(config);

    config.verifyPartnerEndpoint();
    if (!config.isManualLogin()) {
      if (config.getSessionId()==null) {
        config.setServiceEndpoint(config.getAuthEndpoint());
        com.sforce.soap.partner.wsc130.LoginResult result = login(config.getUsername(), config.getPassword());
        config.setSessionId(result.getSessionId());
        config.setServiceEndpoint(result.getServerUrl());
      } else {
        if (config.getServiceEndpoint() == null) {
          throw new com.sforce.ws.ConnectionException("Please set ServiceEndpoint");
        }
      }
    }

      __SessionHeader = new SessionHeader_element();
      __SessionHeader.setSessionId(config.getSessionId());
  }

  private com.sforce.ws.transport.SoapConnection newConnection() {
      com.sforce.ws.transport.SoapConnection __c   = new com.sforce.ws.transport.SoapConnection(
           __config.getServiceEndpoint(), "urn:sobject.partner.soap.sforce.com", __typeMapper, __config);

      __c.setConnection(this);
      __c.setKnownHeaders(knownHeaders);
      return __c;
   }

  public com.sforce.soap.partner.sobject.wsc130.SObject[] retrieve(java.lang.String fieldList,java.lang.String sObjectType,java.lang.String[] ids)
       throws com.sforce.ws.ConnectionException {
    com.sforce.ws.transport.SoapConnection __connection = newConnection();
    com.sforce.soap.partner.wsc130.Retrieve_element __request = new com.sforce.soap.partner.wsc130.Retrieve_element();
    com.sforce.soap.partner.wsc130.RetrieveResponse_element __response = new com.sforce.soap.partner.wsc130.RetrieveResponse_element();

    __request.setFieldList(fieldList);
    __request.setSObjectType(sObjectType);
    __request.setIds(ids);

    if (__SessionHeader != null) __connection.addHeader(SessionHeader_qname, __SessionHeader);
    if (__CallOptions != null) __connection.addHeader(CallOptions_qname, __CallOptions);
    if (__QueryOptions != null) __connection.addHeader(QueryOptions_qname, __QueryOptions);
    if (__MruHeader != null) __connection.addHeader(MruHeader_qname, __MruHeader);

    addHeaders(__connection);

    __response = (com.sforce.soap.partner.wsc130.RetrieveResponse_element) __connection.send("",
       retrieve_qname, __request, retrieveResponse_qname,
       com.sforce.soap.partner.wsc130.RetrieveResponse_element.class);

    return __response.getResult();
  }

  private void addHeaders(com.sforce.ws.transport.SoapConnection __connection) {
    for(java.util.Map.Entry<QName, XMLizable> entry : __extraHeaders.entrySet()) {
      __connection.addHeader(entry.getKey(), entry.getValue());
    }
  }

  public void addExtraHeader(QName __headerName, XMLizable __value) {
    __extraHeaders.put(__headerName, __value);
  }

  public void removeExtraHeader(QName __headerName) {
    __extraHeaders.remove(__headerName);
  }

  public XMLizable getExtraHeader(QName __headerName) {
    return __extraHeaders.get(__headerName);
  }

  public void clearExtraHeaders() {
    __extraHeaders = new HashMap<QName, XMLizable>();
  }

    private static final javax.xml.namespace.QName convertLead_qname = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "convertLead");
    private static final javax.xml.namespace.QName convertLeadResponse_qname = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "convertLeadResponse");
    private static final javax.xml.namespace.QName sendEmail_qname = new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "sendEmail");


  private static HashMap<QName, java.lang.Class> knownHeaders = new HashMap<QName, java.lang.Class>();

  static {
      knownHeaders.put(LocaleOptions_qname,com.sforce.soap.partner.wsc130.LocaleOptions_element.class);
      knownHeaders.put(EmailHeader_qname,com.sforce.soap.partner.wsc130.EmailHeader_element.class);
  }
}
