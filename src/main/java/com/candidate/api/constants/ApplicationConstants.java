
package com.candidate.api.constants;

import java.util.ArrayList;
import java.util.List;

public interface ApplicationConstants {

    char CHAR_A = 'A';
    char CHAR_I = 'I';
    String FORM_TYPE_REFER = "REFER";
    String FORM_TYPE_APPLY = "APPLY";
    String FORM_TYPE_CTP = "CTP";
    String STR_Y = "Y";
    String STR_N = "N";
    String STR_EMPTY = "";
    String STR_A = "A";
    String STR_C = "C";
    String STR_I = "I";
    String STR_ZERO = "0";
    String STR_PERCENT_SYMBOL = "%";
    String STR_CONTEST = "CONTEST";
    String STR_CAMPAIGN = "CAMPAIGN";
    String STR_FIRSTSOURCE = "FIRSTSOURCE";
    String STR_HOTJOB = "H";
    String STR_CONTESTJOB = "C";
    String STR_REGULARJOB = "R";
    String STR_SYSTEMJOB = "S";
    String STR_FORWARD_SLASH = "/";
    String STR_PLUS = "+";
    String STR_ZERO_FORWARD_SLASH_ZERO = "0/0";
    String STR_EQUAL_TO = "=";
    String STR_SPACE = " ";
    String STR_NEW_LINE = "\n";
    String STR_NEWJOB = "NEW";
    String STR_LINKEDJOB = "LINKED";
    String STR_SINGLE = "SINGLE";
    String STR_COMMA = ",";
    String STR_DOUBLE_QUOTES = "\"";
    String STR_COMMA_AND_SPACE = ", ";
    String STR_EDIT = "EDIT";
    String STR_LINKJOB = "LINK";
    String STR_EMPLOYEE = "EMPLOYEE";
    String STR_EMP = "Employee";
    String STR_RECRUITER = "RECRUITER";
    String QUESTION_MARK = "?";
    String AMPERSON = "&";
    String STR_REDIRECT = "redirect:";
    String UNDER_SCORE = "_";
    String STR_DEFAULT = "DEFAULT";
    String STR_CUSTOM_SPLITTER = "%%%";

    String STR_EXPERIENCE = "Experience : ";
    String STR_SKILLS = "Skills : ";
    String UNHOLD = "UNHOLD";

    String STR_YEARS = " Years";
    String STR_MULTIPLE = "Multiple";
    String STR_YEAR = "Year";
    String STR_MONTH = "Month";

    String SKILL_TEXT_OVERALL = "Overall";

    String ALL_CANDIDATES = "All Candidates";
    String RS_CAND_REFERRED = "RS_CAND_REFERRED";
    String RS_CAND_SUGGESTED = "RS_CAND_SUGGESTED";
    String RS_CAND_RESPONDED = "RS_CAND_RESPONDED";
    String RS_CAND_INPROCESS = "RS_CAND_INPROCESS";
    String RS_CAND_REJECTED = "RS_CAND_REJECTED";
    String RS_CAND_JOBOFFERED = "RS_CAND_JOBOFFERED";
    String RS_CAND_HIRED = "RS_CAND_HIRED";
    String RS_CAND_ONHOLD = "RS_CAND_ONHOLD";
    String RS_CAND_ROUND_TWO = "RS_CAND_ROUND_TWO";

    String REFERRAL_TYPE_RESUME = "RESUME";
    String REFERRAL_TYPE_FACEBOOK = "FACEBOOK";
    String REFERRAL_TYPE_WHATSAPP = "WHATSAPP";
    String REFERRAL_TYPE_LINKEDIN = "LINKEDIN";
    String REFERRAL_TYPE_TWITTER = "TWITTER";
    String REFERRAL_TYPE_GOOGLE_PLUS = "GOOGLE_PLUS";
    String REFERRAL_TYPE_EMAIL = "EMAIL";
    String REFERRAL_TYPE_LINK = "ERLINK";
    String REFERRAL_TYPE_SMS = "SMS";

    String REFERRAL_MODE_REFER = "REFER";
    String REFERRAL_MODE_SHARE = "SHARE";

    String RFRL_TYPE_DESC_DIRECT = "Direct";
    String RFRL_TYPE_DESC_OTHER = "Other";
    String RFRL_TYPE_DESC_FACEBOOK = "Facebook";
    String RFRL_TYPE_DESC_LINKEDIN = "LinkedIn";
    String RFRL_TYPE_DESC_TWITTER = "Twitter";
    String RFRL_TYPE_DESC_GOOGLEPLUS = "Google+";
    String RFRL_TYPE_DESC_EMAIL = "Email";

    String SESSION_ATTR_LINKEDIN_PEOPLE_SEARCH_DATA = "LIPPLSRCH";
    String SESSION_ATTR_FACET_MATCHES_LINKEDIN = "FACETMTCHLI";
    String SESSION_ATTR_JOB_MATCHES_FACEBOOK = "JOBMTCHFB";
    String SESSION_ATTR_USER_PROFILE = "USERPROFILE";
    String SESSION_ATTR_REFERRAL_TOKEN = "REFERRALTOKEN";
    String SESSION_ATTR_JOB_SEQ_PROFILE_MATCH = "JOBSEQPROFMTCH";
    String SESSION_ATTR_COMPANY_INFO = "COMPANYINFO";
    String SESSION_ATTR_REDIRECT = "REDIRECT";
    String SESSION_ATTR_PAGE = "PAGE";
    String SESSION_ATTR_JOBSEQ = "JOBSEQ";
    String SESSION_ATTR_EMAIL_ADDR = "EMAIL_ADDR";
    String SESSION_ATTR_JOB_TITLE = "JOBTITLE";
    String SESSION_ATTR_JOB_TITLE_LABEL = "jobLabel";
    String SESSION_ATTR_RH_INFO = "RH_SESSION_INFO";
    String SESSION_ATTR_FEATURE_VISIB = "featureVisible";
    String SESSION_ATTR_CONFIG_PARAM = "configParams";
    String SESSION_ATTR_EXCEPTION_COUNT = "max_exception";
    String SESSION_ATTR_USER_PERMISSIONS = "userPermissions";
    String SESSION_EXPIRED = "expired";
    String SESSION_ALIVE = "alive";
    String SESSION_LAST_LOGIN_DTTM = "lastLoginDttm";
    String SESSION_ALLOW_IFRAME = "allowIframe";
    String SESSION_SCHEDULE_MESSAGE = "scheduleMsg";
    String SESSION_ATTR_EMAIL_UNSUBSCRIBE_TYPE = "UNSUBSCRIBE_TYPE";

    Character ACTIVE = 'A';
    Character INACTIVE = 'I';
    Character CHAR_Y = 'Y';
    Character CHAR_N = 'N';

    String JOB_REFERRAL_TYPE_INDIVIDUAL = "I";

    String REFRL_STATUS_REFERRED = "Contacted";
    String REFRL_STATUS_SUGGESTED = "Suggested";
    String REFRL_STATUS_HIRED = "Hired";
    String REFRL_STATUS_ONHOLD = "On Hold";
    String REFRL_STATUS_INPROCESS = "In Process";
    String REFRL_STATUS_RESPONDED = "Applied";
    String REFRL_STATUS_JOBOFFERED = "Offered";
    String REFRL_STATUS_REJECTED = "Rejected";
    String STATUS_MOVE = "MOVE";

    String REWARD_TYPE_AMT_RS = "AMT_RS";
    String REWARD_TYPE_POINTS = "POINTS";
    String REWARD_TYPE_GIFT = "GIFT";
    String REWARD_TYPE_BADGE = "BADGES";
    String REWARD_TYPE_MEDAL = "MEDAL";
    String REWARD_TYPE_COINS = "COINS";

    String PROVIDER_ID_LINKEDIN = "linkedin";
    String PROVIDER_ID_FACEBOOK = "facebook";
    String PROVIDER_ID_TWITTER = "twitter";
    String PROVIDER_ID_LINKEDIN_IMPORT = "linkedinimport";

    String GOAL_NOT_COMPLETE = "NC";
    String GOAL_COMPLETE = "C";

    String VIEW_CHANGEPASSWORD = "changepassword";
    String VIEW_EMPLOYEEDASHBOARD = "employeedashboard";
    String VIEW_MYREFERRALS = "myreferrals";
    String VIEW_JOB_DESCRIPTION = "jobdescription";
    String VIEW_MYREWARDS = "myrewards";
    String VIEW_LINKEDIN_PROFILES = "linkedinprofiles";
    String VIEW_FACEBOOK_PROFILES = "facebookprofiles";
    String VIEW_JOBDASHBOARD = "jobdashboard";
    String VIEW_CAMPAIGN_DASHBOARD = "campaigndashboard";
    String VIEW_CAMPAIGN_DETAILS = "campaigndetails";
    String VIEW_CAMPAIGN_CREATE = "createcampaign";
    String VIEW_CAMPAIGN_ADDJOBS = "campaignaddjobs";
    String VIEW_CAMPAIGN_LINKJOBS = "linkcampaignjobpopup";
    String VIEW_CAMPAIGN_PUBLISH = "campaignpublish";
    String VIEW_CAMPAIGN_PUBLISH_PREVIEW = "campaignpublishpreview";
    String VIEW_CONTEST_DASHBOARD = "eventdashboard";
    String VIEW_CONTEST_DETAILS = "eventdetails";
    String VIEW_CONTEST_CREATE = "createevent";
    String VIEW_CONTEST_ADDJOBS = "eventaddjobs";
    String VIEW_LINKJOBS = "linkjobspopup";
    String LINKJOBS_JOBTABLE = "jobtablelist";
    String VIEW_CONTEST_PUBLISH = "eventpublish";
    String VIEW_CONTEST_PUBLISH_PREVIEW = "eventpublishpreview";
    String VIEW_CONTEST_REWARDPOPUP = "addcontestrewardpopup";
    String VIEW_CONTEST_WINNER = "contestwinners";
    String VIEW_EMP_CONTEST_DETAIL = "empeventdetail";
    String VIEW_EMP_CONTEST_REWARDS = "empcontestrewards";
    String VIEW_CONTEST_LEADERBOARD = "contestleaderboard";
    String ATRRIBUTE_MODEL = "model";
    String ATRRIBUTE_LISIGNEDIN = "lisignedin";
    String ATRRIBUTE_TWTRSIGNEDIN = "twtrsignedin";
    String ATRRIBUTE_LIAPIACCESS = "liapiaccess";
    String ATRRIBUTE_LICONTACTSIMPORTED = "licontactsimported";
    String ATRRIBUTE_SOCIALREFVO = "socialRefVO";
    String ATRRIBUTE_UPLOADREFVO = "uploadRefVO";
    String ATRRIBUTE_EMAILREFVO = "emailRefVO";
    String ATRRIBUTE_FBSIGNEDIN = "fbsignedin";
    String ATRRIBUTE_JOBPAGE = "jobPage";
    String ATRRIBUTE_LINKEDIN_PROFILE_BATCH_INDEX = "lastLiProfileIndex";
    String ATRRIBUTE_LAST_FACEBOOK_PROFILE_INDEX = "lastFbProfileIndex";
    String ATRRIBUTE_JOB_REFERRAL_TYPE = "jobReferralTypeCd";
    String ATRRIBUTE_RELATIONSHIPS = "relationships";
    String ATRRIBUTE_FULLNAME = "FULLNAME";
    String ATRRIBUTE_FIRSTNAME = "FIRSTNAME";
    String ATRRIBUTE_LASTNAME = "LASTNAME";
    String ATRRIBUTE_EMAIL = "EMAIL";
    String ATRRIBUTE_FULLNAMEEMAIL = "FULLNAMEEMAIL";
    String ATRRIBUTE_NEXT = "next";
    String ATRRIBUTE_SYNC_POINTS_PRE_SYNC = "preSyncPoints";
    String ATRRIBUTE_SYNC_LEVEL_PRE_SYNC = "preSyncLevel";
    String ATRRIBUTE_SYNC_POINTS_POST_SYNC = "postSyncPoints";
    String ATRRIBUTE_SYNC_LEVEL_POST_SYNC = "postSyncLevel";
    String VIEW_ADMIN_CONSOLE = "adminconsole";

    String CONST_LINKEDIN = "linkedin";
    String CONST_FACEBOOK = "facebook";
    String CONST_TWITTER = "twitter";

    String CONTEST_JOB = "CONTEST_JOB";
    String CAMPAIGN_JOB = "CAMPAIGN_JOB";
    String JOB_LOCATION = "JOB_LOCATION";
    String USER_LOCATION = "USER_LOCATION";
    String MIN_JOB_AND_USER = "MIN_JOB_AND_USER";
    String MAX_JOB_AND_USER = "MAX_JOB_AND_USER";

    Integer INT_ZERO = 0;
    Float FLOAT_ZERO = 0.0f;
    Integer LINKEDIN_MAX_RESULTS_PER_FETCH = 12;
    Integer FACEBOOK_MAX_RESULTS_PER_FETCH = 12;

    String REFERRAL_DEFAULT_MESSAGE = "Hi, I have an excellent job opportunity for you.";
    String APPLY_MESSAGE = ". Click on the below URL to apply for this job. ";
    String REFERRAL_MESSAGE_SUBJECT = "Job opening at ";
    String CONTEST_INVITE = "Hello! You have been included in a Contest.";
    String INVITE_FOR_JOB = "Hello! You have been included in a job.";
    String INVITE_FOR_INTERVIEW = "Interview Request.";
    String INVITE_FOR_INTERVIEW_ROUNDS = "Interview Request.";
    String JOBS_IN_CAMPAIGN = "Jobs in campaign.";

    String STR_ACTIVE = "Active";
    String STR_ACTIVATE = "Activate";
    String STR_DEACTIVATE = "Deactivate";
    String STR_INACTIVE = "Inactive";
    String STR_ONHOLD = "Onhold";
    String STR_DRAFT = "Draft";
    String STR_CLOSED = "Closed";

    String STR_ACTIVE_CD = "ACTIVE";
    String STR_INACTIVE_CD = "INACTIVE";
    String STR_ONHOLD_CD = "ONHOLD";
    String STR_DRAFT_CD = "DRAFT";
    String STR_CLOSED_CD = "CLOSED";
    String STR_DELETED_CD = "DELETED";

    String WEBSERVICE_SUCCESS_CD = "100";
    String WEBSERVICE_AUTH_ERR_CD = "101";
    String WEBSERVICE_SERVER_ERR_CD = "102";
    String WEBSERVICE_FAILURES_CD = "103";

    String WEBSERVICE_SUCCESS_MSG = "Successfully imported all jobs";
    String WEBSERVICE_AUTH_ERR_MSG = "Authentication error";
    String WEBSERVICE_SERVER_ERR_MSG = "Technical Error";
    String WEBSERVICE_FAILURES_MSG = "One or more jobs failed during import.";

    String WEBSERVICE_JOB_TECH_ERR_CD = "200";
    String WEBSERVICE_JOB_INVALID_CD = "201";
    String WEBSERVICE_JOB_NOT_FOUND_CD = "202";
    String WEBSERVICE_JOB_CLOSED_CD = "203";

    String INTERVIEW_RESULT_ACCEPT = "ACCEPT";
    String INTERVIEW_RESULT_REJECT = "REJECT";
    String INTERVIEW_RESULT_ONHOLD = "ONHOLD";
    String INTERVIEW_RESULT_OFFERED = "OFFERED";
    String INTERVIEW_RESULT_HIRED = "HIRED";


    String INTERVIEW_ROUND_ROUND1 = "Round 1";
    String INTERVIEW_ROUND_ROUND2 = "Round 2";
    String INTERVIEW_ROUND_ROUND3 = "Round 3";
    String INTERVIEW_ROUND_HRROUND = "HR Round";
    String INTERVIEW_ROUND_ONHOLD = "On Hold";
    String INTERVIEW_ROUND_FINALROUND = "Final Round";


    Integer FIRST_BATCH_INDEX = 1;

    Integer REFRL_STATUS_MSTR_SEQ_RS_CAND_REFERRED = 1;
    Integer REFRL_STATUS_MSTR_SEQ_RS_CAND_RESPONDED = 2;
    Integer REFRL_STATUS_MSTR_SEQ_RS_CAND_INPROCESS = 3;
    Integer REFRL_STATUS_MSTR_SEQ_RS_CAND_REJECTED = 4;
    Integer REFRL_STATUS_MSTR_SEQ_RS_CAND_JOBOFFERED = 5;
    Integer REFRL_STATUS_MSTR_SEQ_RS_CAND_HIRED = 6;
    Integer REFRL_STATUS_MSTR_SEQ_RS_CAND_ONHOLD = 7;

    String ACTIVITY_CD_FB_REF = "EMP_FB_REFR";
    String ACTIVITY_CD_LI_REF = "EMP_LKDN_REFR";
    String ACTIVITY_CD_UPL_RESUME = "EMP_RESUME_REFR";
    String ACTIVITY_CD_EMAIL_REF = "EMP_EMAIL_REFR";
    String ACTIVITY_CD_FB_SHARE = "EMP_FB_WALL";
    String ACTIVITY_CD_LI_SHARE = "EMP_LKDN_WALL";
    String ACTIVITY_CD_FB_SYNC = "EMP_FB_SYNC";
    String ACTIVITY_CD_LI_SYNC = "EMP_LKDN_SYNC";
    String ACTIVITY_CD_LI_IMPORT = "EMP_LKDN_IMPORT";
    String ACTIVITY_CD_TWITTER_CONNECT = "EMP_TWTR_CONNECT";
    String ACTIVITY_CD_FB_WALL = "EMP_FB_WALL";
    String ACTIVITY_CD_LI_WALL = "EMP_LKDN_WALL";
    String ACTIVITY_CD_TWITTER_WALL = "EMP_TWTR_WALL";
    String ACTIVITY_CD_FIRST_LOGIN = "EMP_FIRST_LOGIN";
    String ACTIVITY_CD_EMP_REFR_REPOND = "EMP_REFR_REPOND";
    String ACTIVITY_CD_EMP_REFR = "EMP_REFR";
    String ACTIVITY_CD_EMP_REFR_INPROC = "EMP_REFR_INPROC";
    String ACTIVITY_CD_EMP_REFR_INPROC_4 = "EMP_REFR_INPROC_4";
    String ACTIVITY_CD_EMP_REFR_INPROC_3 = "EMP_REFR_INPROC_3";
    String ACTIVITY_CD_FB_SUGG = "EMP_FB_SUGGEST";
    String ACTIVITY_CD_LI_SUGG = "EMP_LKDN_SUGGEST";
    String ACTIVITY_CD_EMAIL_SUGG = "EMP_EMAIL_SUGGEST";
    String ACTIVITY_CD_RESUME_SUGG = "EMP_RESUME_SUGGEST";

    String ACTIVITY_CD_FB_REF_CONT = "EMP_FB_REFR_CONT";
    String ACTIVITY_CD_LI_REF_CONT = "EMP_LKDN_REFR_CONT";
    String ACTIVITY_CD_UPL_RESUME_CONT = "EMP_RESUME_REFR_CONT";
    String ACTIVITY_CD_EMAIL_REF_CONT = "EMP_EMAIL_REFR_CONT";
    String ACTIVITY_CD_FB_SHARE_CONT = "EMP_FB_WALL_CONT";
    String ACTIVITY_CD_LI_SHARE_CONT = "EMP_LKDN_WALL_CONT";
    String ACTIVITY_CD_FB_SYNC_CONT = "EMP_FB_SYNC_CONT";
    String ACTIVITY_CD_LI_SYNC_CONT = "EMP_LKDN_SYNC_CONT";
    String ACTIVITY_CD_FB_WALL_CONT = "EMP_FB_WALL_CONT";
    String ACTIVITY_CD_LI_WALL_CONT = "EMP_LKDN_WALL_CONT";
    String ACTIVITY_CD_TWITTER_WALL_CONT = "EMP_TWTR_WALL_CONT";
    String ACTIVITY_CD_FB_SUGG_CONT = "EMP_FB_SUGGEST_CONT";
    String ACTIVITY_CD_LI_SUGG_CONT = "EMP_LKDN_SUGGEST_CONT";
    String ACTIVITY_CD_EMAIL_SUGG_CONT = "EMP_EMAIL_SUGGEST_CONT";
    String ACTIVITY_CD_RESUME_SUGG_CONT = "EMP_RESUME_SUGGEST_CONT";

    String ACTIVITY_CD_ACTIVITYSTAGE_RWD = "EMP_WON_ACTRWD";
    String ACTIVITY_CD_GOAL_RWD = "EMP_WON_GOLRWD";
    String ACTIVITY_CD_LEVEL_RWD = "EMP_WON_LVLRWD";
    String ACTIVITY_CD_JOB_RWD = "EMP_WON_JOBRWD";
    String ACTIVITY_CD_CONTEST_RWD = "EMP_WON_CONTRWD";

    String ACTIVITY_CD_EMP_REFR_HIRE = "EMP_REFR_HIRE";
    String ACTIVITY_CD_EMP_REFR_OFFER = "EMP_REFR_OFFER";
    //String ACTIVITY_CD_EMP_JOB_REFER = "EMP_JOB_REFER";
    String ACTIVITY_CD_EMP_WIN_CONT = "EMP_WIN_CONT";

    String ACTIVITY_CD_EMP_FB_DISCONNECT = "EMP_FB_DISCONNECT";
    String ACTIVITY_CD_EMP_LKDN_DISCONNECT = "EMP_LKDN_DISCONNECT";
    String ACTIVITY_CD_EMP_TWTR_DISCONNECT = "EMP_TWTR_DISCONNECT";

    String SKILL_1 = "Skill 1";
    String SKILL_2 = "Skill 2";
    String SKILL_3 = "Skill 3";
    String SKILL_4 = "Skill 4";

    String PROP_KEY_FACEBOOK_APP_ID = "facebook.clientId";

    String SYSTEM_PROPERTY_DEV_ENV = "dev";
    String SYSTEM_PROPERTY_QA_ENV = "qa";
    String SYSTEM_PROPERTY_DEMO_ENV = "test";

    int MAX_WINNER_COUNT = 5;

    String POPUP_INVITE_COLLEAGUE = "I";
    String POPUP_ACCEPT = "A";
    String POPUP_REJECT = "R";
    String POPUP_ONHOLD = "O";
    String ON = "on";

    String UNAVAILABLE = "UNAVAILABLE";

    String CONTEST_WINNER_SEL_CRIT_REF = "REFERRAL";
    String CONTEST_WINNER_SEL_CRIT_HIRE = "HIRE";

    String PROP_LINKEDIN_CONN_DIR_PATH = "linkedin.connections.directoryPath";
    String PROP_JOB_MAILER_BANNER_DIR_PATH = "jobmailer.banner.directoryPath";
    String PROP_EMPLOYEE_IMAGE_DIR_PATH = "employee.image.directoryPath";

    String PROP_S3_ENABLED = "aws.s3.enabled";
    String PROP_S3_BUCKET_NAME = "aws.s3.bucket.name";
    String PROP_S3_ACCESSKEY = "aws.s3.accessKey";
    String PROP_S3_SECRETKEY = "aws.s3.secretKey";
    String PROP_S3_KMS_MASTER_KEY = "aws.s3.kms.master.key";

    //AWS SQS Mail Queue
    String PROP_SQS_ACCESSKEY = "aws.sqs.accessKey";
    String PROP_SQS_SECRETKEY = "aws.sqs.secretKey";
    String PROP_SQS_ENDPOINT = "aws.sqs.endpoint";
    String PROP_SQS_QUEUE_NAME = "aws.sqs.queue.name";
    String SQS_QUEUE_ATTRIBUTE_VISIBLE_MESSAGE = "ApproximateNumberOfMessages";
    String SQS_QUEUE_ATTRIBUTE_NON_VISIBLE_MESSAGE = "ApproximateNumberOfMessagesNotVisible";

    //AWS SNS
    String PROP_SNS_ACCESSKEY = "aws.sns.accessKey";
    String PROP_SNS_SECRETKEY = "aws.sns.secretKey";

    String STATIC_FILE_TYPE_RESUME = "resume";
    String STATIC_FILE_TYPE_DOWNLOAD_RESUME = "downloadresume";
    String STATIC_FILE_TYPE_CONTESTBANNER = "contestbanner";
    String STATIC_FILE_TYPE_CANDIDATE_IMAGE = "candidateimage";
    String STATIC_FILE_TYPE_EMPLOYEE_IMAGE = "employeeimage";
    String STATIC_FILE_TYPE_ETL_FILE = "etlfile";
    String STATIC_FILE_TYPE_EXPORT = "exportcandidate";
    String STATIC_FILE_TYPE_KENEXA_DIT_REPORT = "kenexaditreport";
    String STATIC_FILE_TYPE_ADDITIONAL_DOC = "additionaldoc";

    String PARTICIPATED = "PARTICIPATED";
    String NOT_PARTICIPATED = "NOT PARTICIPATED";

    String REWARD_CATEGORY_ACTIVITY = "ACTIVITY";
    String REWARD_CATEGORY_LEVEL = "LEVEL";
    String REWARD_CATEGORY_GOAL = "GOAL";
    String REWARD_CATEGORY_JOB = "JOB";
    String REWARD_CATEGORY_CONTEST = "CONTEST";
    String EMPL_RWRD_CAT_ACTIVITYSTAGE_REWARD = "ACTIVITYSTAGE_REWARD";
    String EMPL_RWRD_CAT_GOAL_REWARD = "GOAL_REWARD";
    String EMPL_RWRD_CAT_LEVEL_REWARD = "LEVEL_REWARD";
    String EMPL_RWRD_CAT_JOB_REWARD = "JOB_REWARD";
    String EMPL_RWRD_CAT_CONTEST_REWARD = "CONTEST_REWARD";

    String USER_ROLE_CODE_CANDIDATE = "CANDT";
    String USER_ROLE_CODE_EMPLOYEE = "EMP";
    String USER_ROLE_CODE_RECRUITER = "RECTR";
    String USER_ROLE_CODE_ADMIN = "ADMIN";
    String USER_ROLE_CODE_OWNER = "OWNER";
    String USER_ROLE_CODE_HIRING_USR = "HIRING_USR";
    String USER_ROLE_CODE_HIRING_USR_NON_ER = "HIRING_USR_NON_ER";
    String USER_ROLE_CODE_HIRING_ADMIN = "HIRING_ADMIN";
    String USER_ROLE_CODE_HIRING_APPROVER = "HIRING_APPROVER";
    String USER_ROLE_CODE_VENDOR = "VENDOR";

    String USER_ROLE_RECRUITER = "Recruiter Role";
    String USER_ROLE_EMPLOYEE = "Employee Role";


    String JOB_STATUS_ACTIVE = "ACTIVE";
    String JOB_STATUS_CLOSED = "CLOSED";
    String JOB_STATUS_CANCELLED = "CANCELLED";
    String JOB_STATUS_WITHDRAWN = "WITHDRAWN";
    String TEMPLATE_CONTEST_WINNER_EMAIL = "template/contestWinner.vm";
    String BULK_RESUME_DOWNLOAD = "bulkresumedownload";
    String BULK_UPLOAD_RESUME_PATH = "bulkresumeupload.directoryPath";
    String DOWNLOAD_EXCEL_PATH = "bulkuser.directoryPath";
    String BULK_UPLOAD_LIST = "bulkupload.directoryPath";
    String JOB_OPEN = "OPEN";
    String JOB_UPDATE_OPENINGS = "UPDATE_OPENINGS";
    String ACTIVITY_TYPE_CLOSE_MANUAL = "CLOSE_MANUAL";
    String ACTIVITY_TYPE_CLOSE_AUTO = "CLOSE_AUTO";
    String ACTIVITY_TYPE_WITHDRAWN = "CLOSE_WITHDRAWN";
    String JOB_ACTIVITY_TYPE_CREATE_REQUEST = "CREATE_REQUEST";
    String JOB_ACTIVITY_TYPE_CREATE_JOB = "CREATE_JOB";
    String JOB_ACTIVITY_TYPE_AUTO_CREATE_REQUEST = "AUTO_CREATE_REQUEST";
    String JOB_REOPEN = "REOPEN";
    String JOB_UPDATE = "UPDATE";

    String DOT = ".";
    String CAMPAIGN_CODE_STR = "C-";
    String JOB_CODE_STR = "J-";
    String ALL_CAMPAIGNS_OPTION = "All Campaigns";
    String ALL_CAMPAIGNS_OPTION_VALUE = "A-1";
    String ALL_JOBS_OPTION = "All Jobs";
    String ALL_JOBS_OPTION_VALUE = "A-1";

    String REWARD_CRITERIA_CD_REFERRAL = "REFERRAL";
    String REWARD_CRITERIA_CD_HIRE = "HIRE";

    String REFERS = "Refers";
    String HIRES = "Hires";

    String SMTP_FROM_ADMIN = "smtp.from";
    String SMTP_FROM_NOREPLY = "smtp.from.noreply";
    String MAIL_STORE_TYPE_IMAP = "imap";
    String PROP_IMAP_HOST = "mail.imap.host";
    String PROP_IMAP_PORT = "mail.imap.port";
    String PROP_MAIL_STORE_TYPE = "mail.storetype";
    String PROP_MAIL_BOX = "mail.mailBox";
    String PROP_MAIL_PASSWORD = "mail.mailBox.password";


    String PROP_KEY_ACCESS_LINKEDIN_API = "api.linkedin.access";

    String ROUND_CODE_CD_STATUS_ROUND = "CD_STATUS_ROUND";
    String ROUND_CODE_CD_INPROCESS_ROUND = "CD_INPROCESS_ROUND";
    String ROUND_CODE_CD_OTHER_ROUND = "CD_OTHER_ROUND";

    String ACTION_STATUS_SUCCESS = "success";
    String ACTION_STATUS_ERROR = "error";
    String ACTION_STATUS_NO_CHANGE = "nochange";
    String ACTION_STATUS_ACTIVITY_REACHED_LIMIT = "activity reached limit";
    String ACTIVITY_PERDAY = "PER_DAY";
    String ACTIVITY_PERJOB_PERDAY = "PER_JOB_PER_DAY";
    String RESPONSE_HEADER_REQUESTED_WITH = "X-Requested-With";
    String TIME_OUT = "timeout";
    String MULTIPLE_SESSION = "multiple";
    String XML_HTTP_REQUEST = "XMLHttpRequest";
    String CANDIDATE_UNSUBSCRIBED = "unsubscribed";

    String SESSION_ATTR_REDIRECT_PAGE = "redirectPage";
    String SESSION_ATTR_PROVIDER_ID = "providerId";
    String SESSION_ATTR_FROM_AUTH = "fromAuth";
    String SESSION_ATTR_IS_CAMPAIGN = "isCampaign";
    String SESSION_ATTR_BUILD_NUMBER = "buildNumber";

    String SHIFT_STATUS_CANDIDATE_POOL = "CANDIDATE_POOL";
    String SHIFT_STATUS_TRANSFERRED = "TRANSFERRED";
    String TAB_TEXT_CANIDATE_POOL = "Candidate Pool";
    String ALL_Rounds = "All Rounds";
    String Talent_Pool = "Talent Pool +J-0";

    String CAMPAIGN_SHARE_MSG = "Your Company Jobs in ";

    String TEXT_CONT = "_CONT";
    String DISABLED = "disabled";
    String SMS_DISABLED = "DISABLED";

    String MEDAL_CD_GOLD = "GOLD";
    String MEDAL_CD_SILVER = "SILVER";
    String MEDAL_CD_BRONZE = "BRONZE";

    String JOB_REFER_URL = "?redirect=Y&page=profilematch&jobSeq=";

    String FACEBOOK_USER_AGENT = "facebookexternalhit";
    String LINKEDIN_USER_AGENT = "LinkedInBot";
    String TWITTER_USER_AGENT = "Twitterbot";
    String GOOGLE_USER_AGENT = "Googlebot";
    String WHATSAPP_AGENT = "WhatsApp";
    String SLACK_AGENT = "Slackbot";

    String EMP_ONLY_ONBOARDING = "empOnlyOnboarding";
    String LI_CD = "LI";
    String FB_CD = "FB";
    String TW_CD = "TW";
    String EMP_SHOW_FEEDBACK = "empshowfeedback";
    String VIEW_CANDIDATE_JOBDASHBOARD = "candidatejobdashboard";
    String PAGE_NOT_FOUND = "pagenotfound";

    String EMP_JOB_SHARE_COUNT = "EMP_JOB_SHARE_COUNT";
    String EMP_JOB_REFER_COUNT = "EMP_JOB_REFER_COUNT";

    String CANDT = "CANDT";

    String ACTIVITIES = "activities";
    String SUCCESS_MESSAGE = "successMsg";
    String CAND_EMAIL = "CandEmailAddr";
    String CAND_FIRST_NAME = "candFirstName";
    String CAND_LAST_NAME = "candLastName";
    String EMP_LEVEL_UP = "levelUp";

    String JOB_SEQ = "JOB_SEQ";
    String COMPANY_MSTR_SEQ = "COMPANY_MSTR_SEQ";
    String ALLOW_EMP_REF = "ALLOW_EMP_REF";
    String PARENT_COMPANY_MSTR_SEQ = "PARENT_COMPANY_MSTR_SEQ";
    String JOB_TITLE = "JOB_TITLE";
    String JOB_CD = "JOB_CD";
    String JOB_OPEN_DATE = "OPEN_DATE";
    String REQ_EXP_MIN = "REQ_EXP_MIN";
    String REQ_EXP_MAX = "REQ_EXP_MAX";
    String JOB_DESC = "JOB_DESC";
    String TOTAL_POSITIONS = "TOTAL_POSITIONS";
    String CITY = "CITY";
    String CITY_LOWER = "CITY_LOWER";
    String SOLR_FACET_JOB_STATUS = "JOB_STATUS";
    String JOB_STATUS = "JOB_STATUS";
    String HIRING_STATUS = "HIRING_STATUS";
    String JOB_TYPE = "JOB_TYPE";
    String JOB_TYPE_CTP = "CTP";
    String REWARD_TYPE_CD = "REWARD_TYPE_CD";
    String REWARD_QTY = "REWARD_QTY";
    String BAND_CD = "BAND_CD";
    String IS_HOT_JOB = "IS_HOT_JOB";
    String TOTAL_CLOSED_POSITIONS = "TOTAL_CLOSED_POSITIONS";
    String JOB_OTHEDETAILS = "JOB_OTHEDETAILS";
    String JOB_SKILLS = "JOB_SKILLS";
    String CREATE_DTTM = "CREATE_DTTM";
    String CREATED_BY = "CREATED_BY";
    String ASSIGNED_TO = "ASSIGNED_TO";
    String ASSIGNED_ON = "ASSIGNED_ON";
    String RESUME_UPDATE_DTTM = "RESUME_UPDATE_DTTM";
    String RESUME_DATA = "RESUME_DATA";
    String COUNTRY = "COUNTRY";
    String OPENINGS = "OPENINGS";
    String SEARCH = "search";
    String VIEW_CONTESTSEARCH = "empcontestsearch";
    String INTERVIEW_STAGE_APPLIED = "APPLIED";
    String INTERVIEW_STAGE_INPROCESS = "INPROCESS";
    String INTERVIEW_STAGE_OFFERED = "OFFERED";
    String IS_CAREER_SITE = "IS_CAREER_SITE";
    String IS_ALLOW_AGENCY = "ALLOW_AGENCY";
    String IS_REQUEST_AVAILABLE = "REQUEST_AVAILABLE";

    String CHAR_P = "P";
    String CHAR_S = "S";
    String OTHERS = "Others";
    String OTHERS_CHANNELS = "Other channels";
    String STR_NA = "NA";
    String CAPGEMINI = "capgemini";
    String FIRSTSOURCE = "firstsource";
    String FRACTAL = "fractal";
    String INFOBEANS = "infobeans";
    String MPHASIS = "mphasis";
    String PAYU = "payu";
    String CAPILLARYTECH = "capillarytech";
    String INMOBI = "inmobi";
    String HOTSTAR = "hotstar";
    String ICICIPRULIFE = "iciciprulife";
    String CAPGEMINI_UPPERCASE = "CAPGEMINI";
    String MPHASIS_UPPERCASE = "MPHASIS";
    String RIPPLEHIRE_SEQ = "RH";
    String ADITYABIRLA_UPPERCASE = "ADITYABIRLA";
    String ICICIP_UPPERCASE = "ICICIP";
    String CIPLA = "cipla";

    String ROLE_EMPLOYEE = "ROLE_EMPLOYEE";
    String ROLE_RECRUITER = "ROLE_RECRUITER";
    String ROLE_CANDIDATE = "ROLE_CANDIDATE";
    String ROLE_ADMIN = "ROLE_ADMIN";
    String ROLE_OWNER = "ROLE_OWNER";
    String ROLE_HIRING_USR = "ROLE_HIRING_USR";
    String ROLE_HIRING_USR_NON_ER = "ROLE_HIRING_USR_NON_ER";
    String ROLE_HIRING_ADMIN = "ROLE_HIRING_ADMIN";
    String ROLE_HIRING_APPROVER = "ROLE_HIRING_APPROVER";
    String ROLE_VENDOR = "ROLE_VENDOR";


    String CAPG_CONTACTED = "CONTACTED";
    String CAPG_REJECT = "REJECT";
    String CAPG_APPLIED = "APPLIED";
    String CAPG_TECHNICAL = "TECHNICAL";
    String CAPG_MANAGER = "MANAGER";
    String CAPG_CLIENT = "CLIENT";
    String CAPG_HR = "HR";
    String CAPG_OFFER = "OFFER";
    String CAPG_HIRED = "HIRED";
    String CAPG_SCHEDULED = "SCHEDULED";
    String CAPG_ONHOLD = "ONHOLD";
    String CAPG_DROPPED = "DROPPED";
    String CAPG_WITHDRAW = "WITHDRAWN";


    String ANONYMOUS_USER = "anonymousUser";
    String CAPG_LEGACY = "LEGACY";
    String EMAIL_JOB_REQUESTER = "JOB_REQUESTER_MAIL";
    String CAPG_INPROCESS = "INPROCESS";


    String REFERRED = "REFERRED";
    String SUGGESTED = "SUGGESTED";
    String PROVIDER_ID_EMAIL = "email";
    String PROVIDER_ID_RESUME = "resume";
    String FACEBOOK = "FACEBOOK";
    String BUSSINESS_UNIT = "BUSSINESS_UNIT";

    String REFER_ONLY = "refer_only";
    String BOOLEAN_TRUE = "TRUE";
    String BOOLEAN_FALSE = "FALSE";
    boolean TRUE= true;
    boolean FALSE = false;
    String BACK_BUTTON = "backButton";

    String HYPHEN = "-";

    //Job Mailer
    String JOB_MAILER_STATUS_DRAFT = "DRAFT";
    String JOB_MAILER_STATUS_SENT = "SENT";

    String STR_PAGE = "page";
    String CAPG_SHORTLISTED = "SHORTLISTED";
    String DEFAULT_SEARCH = "*:*";
    Integer MAX_MESSAGE_REMINDERS = 2;

    String EMPL_REFRL_SEQ = "EMPL_REFRL_SEQ";
    String EMPL_REFRL = "emplRefrl";
    String RH_SEQ = "RIPPLEHIRE_SEQ";
    String CANDIDATE_SEQ = "CANDIDATE_SEQ";
    String CANDIDATE_RESUMEDETAILS_SEQ = "CANDIDATE_RESUMEDETAILS_SEQ";
    String CLIENT_CANDIDATE_ID = "CLIENT_CANDIDATE_ID";
    String SOLR_CAND_FIRST_NAME = "CAND_FIRST_NAME";
    String SOLR_CAND_LAST_NAME = "CAND_LAST_NAME";
    String SOLR_CAND_FULL_NAME = "CAND_FULL_NAME";
    String SOLR_CAND_MIDDLE_NAME = "CAND_MIDDLE_NAME";
    String CAND_EMAIL_ADDR = "CAND_EMAIL_ADDR";
    String CAND_PHONE_NO = "CAND_PHONE_NO";
    String CAND_LANDLINE_NO = "CAND_LANDLINE_NO";
    String ADDRESS_LINE_1 = "ADDRESS_LINE_1";
    String ADDRESS_LINE_2 = "ADDRESS_LINE_2";
    String SKILLS = "SKILLS";
    String YEARS_TOTAL_EXP = "YEARS_TOTAL_EXP";
    String YEARS_RELEVANT_EXP = "YEARS_RELEVANT_EXP";
    String SOLR_DAY = "DAY";
    String SOLR_MONTH = "MONTH";
    String SOLR_YEAR = "YEAR";
    String SOLR_CITY = "CITY";
    String SOLR_CAND_STATE = "STATE";
    String SOLR_CAND_PINCODE = "PIN_CODE";
    String SOLR_CAND_COUNTRY = "COUNTRY";
    String CURRENT_CTC = "CURRENT_CTC";
    String EXPECTED_CTC = "EXPECTED_CTC";
    String NOTICE_PERIOD = "NOTICE_PERIOD";
    String QUALIFICATION_DESC = "QUALIFICATION_DESC";
    String OTHER_QUALIFICATION = "OTHER_QUALIFICATION";
    String GENDER_DESC = "GENDER_DESC";
    String CURRENT_EMPLOYER_DESC = "CURRENT_EMPLOYER_DESC";
    String OTHER_EMPLOYER = "OTHER_EMPLOYER";
    String SKILLS_DESC = "SKILLS_DESC";
    String SKILL_TYPE = "SKILL_TYPE";
    String RESUME_SYNOPSIS = "RESUME_SYNOPSIS";
    String CURRENT_LOCATION_DESC = "CURRENT_LOCATION_DESC";
    String PASSION = "PASSION";
    String PREVIOUS_ROUND = "PREVIOUS_ROUND";
    String COUNTRY_DESC = "COUNTRY_DESC";
    String HIGHEST_DEG = "HIGHEST_DEG";
    String HIGHEST_DEG_STREAM = "HIGHEST_DEG_STREAM";
    String HIGHEST_DEG_YEAR = "HIGHEST_DEG_YEAR";
    String HIGHEST_DEG_PERC = "HIGHEST_DEG_PERC";
    String HIGHEST_DEG_BACKLOGS = "HIGHEST_DEG_BACKLOGS";
    String CERTIFICATIONS = "CERTIFICATIONS";
    String SSC_AGG_PERC = "SSC_AGG_PERC";
    String HSC_AGG_PERC = "HSC_AGG_PERC";
    String FB_URL = "FB_URL";
    String LI_URL = "LI_URL";
    String INFO_BY_EMP = "INFO_BY_EMP";
    String NOTETO_RECRUTER = "NOTETO_RECRUTER";
    String STAGE_DESC = "STAGE_DESC";
    String REFRL_STATUS_CD = "REFRL_STATUS_CD";
    String INTERVIEW_STAGE_SEQ = "INTERVIEW_STAGE_MSTR_SEQ";
    String CLIENT_INTERVIEW_STATUS_DESC = "CLIENT_INTERVIEW_STATUS_DESC";
    String EMP_FIRST_NAME = "EMP_FIRST_NAME";
    String EMP_LAST_NAME = "EMP_LAST_NAME";
    String CAND_RELATIONSHIP_DESC = "CAND_RELATIONSHIP_DESC";
    String EMP_RELATIONSHIP_DESC = "EMP_RELATIONSHIP_DESC";
    String HIGHEST_EDUCATION = "HIGHEST_EDUCATION";
    String APPLY_DATE = "APPLY_DATE";
    String RE_APPLY_DTTM = "RE_APPLY_DTTM";
    String CONTEST_SEQ = "CONTEST_SEQ";
    String CAMPAIGN_SEQ = "CAMPAIGN_SEQ";
    String RECRUITERS = "RECRUITERS";
    String APPROVERS = "APPROVERS";
    String CLIENT_CUSTOM_MSTR_INDUSTRY = "INDUSTRY";
    String CLIENT_CUSTOM_MSTR_SUB_INDUSTRY = "SUBINDUSTRY";
    String CLIENT_CUSTOM_MSTR_EMPLOYER = "EMPLOYER";
    String CLIENT_CUSTOM_MSTR_LOCATION = "LOCATION";
    String CLIENT_CUSTOM_MSTR_EDUCATION_DETAILS = "educationDetails";
    String CLIENT_CUSTOM_MSTR_NATIONALITY = "NATIONALITY";
    String CLIENT_CUSTOM_1 = "customSelect1";
    String SOLR_LIFE_CYCLE_STATE = "LIFE_CYCLE_STATE";
    String SOLR_SOURCE_ID = "SOURCE_ID";
    String SOLR_SOURCE_EMAIL = "SOURCE_EMAIL";

    String CLIENT_ROUND_MAPPING = "ROUND_MAPPING";

    String VIEW_REPORTDASHBOARD = "report";
    String STR_COLON = ":";
    String STR_PIPE = "|";
    String STR_HIRING = "is Hiring";

    String BATCH_PROCESS_STATUS_STARTED = "STARTED";
    String BATCH_PROCESS_STATUS_COMPLETED = "COMPLETED";
    String BATCH_PROCESS_TYPE_CAND_STATUS_SYNC = "CAND_STATUS_SYNC";
    String BATCH_PROCESS_TYPE_JOB_SYNC = "JOB_SYNC";
    String BATCH_PROCESS_TYPE_EMP_IMPORT = "EMP_IMPORT";
    String BATCH_PROCESS_TYPE_EMP_DETAIL_IMPORT = "EMP_DETAIL_IMPORT";
    String BATCH_PROCESS_TYPE_REJECT_REASON_SYNC = "REJECT_REASON_SYNC";

    String FILENAME = "fileName";
    String EXCEL_REPORT_LOCATION = "temp.directoryPath";
    String TEMP_DIRECTORY_PATH = "temp.directoryPath";
    String COMPRESS_DIRECTORY_LOCATION = "compress.directoryPath";
    String RAW_EXPORT_DIRECTORY = "rawexport.directoryPath";
    String EXPORT_TYPE_JOB = "JOB";
    String EXPORT_TYPE_INTERVIEW_REPORT = "INTERVIEW_REPORT";
    String EXPORT_CD_JOB_EXPORT = "job_export";
    String EXPORT_CD_INTERVIEW_REPORT = "interview_report";
    String EXPORT_STATUS_NEW = "NEW";


    String STR_ADD = "ADD";
    String IS_FAKE_EMPLOYER = "IS_FAKE_EMPLOYER";
    String IS_FAKE_QUALIFICATION = "IS_FAKE_QUALIFICATION";
    String FRAUD_CHECK_TYPE_EMPLOYER = "EMPLOYER";
    String FRAUD_CHECK_TYPE_QUALIFICATION = "QUALIFICATION";
    String STR_EMP_CD = "EMP";
    String STR_ALL = "ALL";
    String STR_EXPORT = "EXPORT";
    String SOLR_CHANNEL = "CHANNEL";
    String SOLR_USER_PROFILE_SEQ = "USER_PROFILE_SEQ";
    String JOB_BOARD = "JOB_BOARD";
    String REGULAR = "REGULAR";
    String REFRL_TYPE_SOCIAL_MEDIA = "SOCIAL_MEDIA";
    String AGENCY = "AGENCY";
    String CHANNEL_TYPE_CUSTOM = "CUSTOM";
    String KIT_TYPE_CUSTOM = "CUSTOM";
    String SUBSOURCE = "SUBSOURCE";
    String CAREERSITE = "CAREERSITE";
    String REFERAL_TYPE_FBCAREER = "FBCAREER";
    String DIRECTCHANNEL = "DIRECTCHANNEL";
    String WALKIN = "WALKIN";
    String FILTER_JOB_BOARD = "Job board";
    String FILTER_EMP_REFERRAL = "Employee Referral";
    String FILTER_SOCIAL_SOURCING = "Social Sourcing";
    String FILTER_SOURCED_BY_ME = "Sourced by me";
    String ACTION_UPDATE_DTTM = "ACTION_UPDATE_DTTM";

    String INTERNAL_JOB_POSTING = "IJP";
    String ALLOW_IJP = "ALLOW_IJP";

    String INVALID_FILE = "INVALID_FILE";
    String DEV_MAIL_ALERT = "ERROR";
    String DEV_MAIL_UPDATE = "Update";
    String MAX_FILE_SIZE = "MAX_FILE_SIZE";
    String DEFAULT_APPLY_MODE = "DEFAULT";
    String UPLOAD_APPLY_MODE = "UPLOAD";
    String NOMAIL_APPLY_MODE = "NOMAIL";
    String GOOGLE_FROM = "googlebot";
    String ADMIN_STATUS_UPDATE = "STATUS";

    String REFERAL_SOURCE_TYPE_EMP = "EMPLOYEE";
    String REFERAL_SOURCE_TYPE_AGENCY = "AGENCY";
    Character MAIL_STATUS_PENDING = 'P';
    Character MAIL_STATUS_SUCCESS = 'Y';
    Character MAIL_STATUS_FAILED = 'F';
    Character MAIL_STATUS_UNSUB = 'U';
    Character MAIL_STATUS_RUNNING = 'R';
    String ACTIVITY_TYPE_CREATE = "CREATE";
    String ACTIVITY_TYPE_UPDATE = "UPDATE";
    String ACTIVITY_TYPE_DELETE = "DELETE";
    String ACTIVITY_TYPE_UPLOAD = "UPLOAD";
    String ACTIVITY_TYPE_ARCHIVE = "ARCHIVE";
    String ENTITY_JOB = "JOB";
    String ENTITY_CANIDATE_IMAGE = "CANDIDATE_IMAGE";
    String ENTITY_JOB_REWARD = "JOB_REWARD";
    String ENTITY_EMP_JOB_REWARD = "EMP_JOB_REWARD";
    String ENTITY_USER_PASSWORD = "USER.PASSWORD";
    String ENTITY_USER = "USER";
    String ENTITY_CONTEST = "CONTEST";
    String ENTITY_CANDIDATE = "CANDIDATE";
    String ENTITY_CANDIDATE_APPLICATION = "CANDIDATE_APPLICATION";
    String ENTITY_CAMPAIGN_JOB_MAILER = "CAMPAIGN_JOB_MAILER";
    String STR_SYSTEM_ENTITY = "S";
    String CTP_TYPE_CODE = "CTP";
    String MY_JOBS_TYPE_CODE = "MY_JOBS";
    String ADMIN_RECRUITER_TYPE_CODE = "ADMINRECRUITER";
    String AGENCY_EMAIL_ID = "AGENCY_EMAIL_ID";
    String AGENCY_PHONE_NO = "AGENCY_PHONE_NO";
    String ACTIVITY_FIRST_LOGIN = "FIRST_LOGIN";
    String STR_SHOW = "show";

    String GOOGLE_CAPTCHA_KEY = "google.captcha.key";
    String GOOGLE_CAPTCHA_SECRET = "google.captcha.secret";
    String PERSONAL_DETAILS = "PERSONAL_DETAILS";
    String PROFESSIONAL_DETIALS = "PROFESSIONAL_DETIALS";
    String DUPLICATE_FIELDS = "DUPLICATE_FIELDS";

    String ACTIVITY_NOBLE_DEED_MAILER = "NOBLE_DEED_MAILER";

    String MANAGED_CANDIDATE = "REL_MANAGED_CAND";
    String JOB_RECRUITER_ROLE_CREATOR = "O";
    String JOB_RECRUITER_ROLE_RECRUITER = "R";
    String JOB_RECRUITER_ROLE_RECRUITING_HEAD = "RH";
    String JOB_RECRUITER_ROLE_RECRUITER_LEAD = "RL";
    String JOB_RECRUITER_ROLE_SOURCER = "S";
    String JOB_RECRUITER_ROLE_SOURCER_LEAD = "SL";
    String JOB_RECRUITER_ROLE_HIRING_MANGER = "HM";
    String JOB_RECRUITER_ROLE_REPLACEMENT_FOR = "RPF";
    String JOB_RECRUITER_ROLE_RECRUITING_MANAGER = "RM";
    String JOB_RECRUITER_ROLE_RECRUITING_TEAM_REVIEWER = "RTR";
    String JOB_RECRUITER_ROLE_MANAGER = "M";
    String JOB_RECRUITER_ROLE_RHR = "RHR";
    String JOB_RECRUITER_ROLE_SHR = "SHR";
    String JOB_RECRUITER_ROLE_ZHR = "ZHR";

    String SESSION_COOKIE = "rhsessioncookie";
    String LOGIN_SALT = "loginSalt";
    String LOGIN_SESSION_IDENTITY = "loginSessionIdentity";


    String SHOW_ALL_JOBS = "SHOW_ALL_JOBS";
    String SHOW_ALL_CAMPAIGNS = "SHOW_ALL_CAMPAIGNS";
    String SHOW_ALL_EVENTS = "SHOW_ALL_EVENTS";
    String APOSTROPHE = "'";
    String JOB_TITLE_CD = "job_title";
    String CURRENT_POSITION = "current_positions";
    String RECR_SHARE = "RECRSHARE";

    String CLIENT_CUSTOM_BUSINESS_UNIT = "jobbusinessunit";
    String CLIENT_CUSTOM_OPERATING_UNIT = "custom1";
    String CLIENT_CUSTOM_CLIENT_GROUP = "custom2";
    String CLIENT_CUSTOM_JOB_TYPE = "custom3";
    String CLIENT_CUSTOM_DEPARTMENT = "department";
    String CLIENT_CUSTOM_CLIENT = "client";
    String ENTITY_WEEKLY_JOB_MAILER = "WEEKLY_JOB_MAILER";

    String REPORT_NODATA = "---";

    String EMP_FORM_CANDIDATE_DETAILS_GROUP = "candidate_details";
    String EMP_FORM_REFERRAL_DETAILS_GROUP = "referral_details";
    String EMP_FORM_REC_REFER_SUB_GROUP = "recruiter_refer";
    String EMP_FORM_CAND_REFER_SUB_GROUP = "candidate_refer";

    String STR_DISPLAY_COL = "DISPLAY_COLUMN";
    String STR_EXPORT_N_DISPLAY = "EXPORT_N_DISPLAY";

    String STR_EMPLOYER = "EMPLOYER";
    String STR_QUALIFICATION = "QUALIFICATION";

    String STR_HOURS = "Hrs";
    String STR_MINS = "mins";


    /************Import File Columns*************************/
    String IMPORT_VENDOR_ID = "vendor id";
    String IMPORT_VENDOR_NAME = "vendor name";
    String IMPORT_VENDOR_STATUS = "status";

    String IMPORT_FRAUD_TYPE = "checktype";
    String IMPORT_FRAUD_KEYWORD = "keywords";
    String IMPORT_FRAUD_STATUS = "status";

    String IMPORT_USER_FNAME = "first name";
    String IMPORT_USER_LNAME = "last name";
    String IMPORT_USER_EMAILID = "email id";
    String IMPORT_USER_LOGINID = "login id";
    String IMPORT_USER_TYPE = "user type";
    String IMPORT_USER_STATUS = "status";

    String IMPORT_COMPANY_EMPLOYEE_ID = "company employee id";
    String IMPORT_EMPLOYEE_LEVEL = "employee level";
    String IMPORT_LOCATION = "location";
    String IMPORT_DEPARTMENT = "department";
    String IMPORT_PHONE_NO = "phone no";


    String DATE_DIFFERENCE = "difference";
    String WEEKLY = "weekly";
    String MONTHLY = "monthly";
    String UI_EMPL_REFERRAL_CHANNEL = "Employee Referrals";
    String UI_OTHERS_CHANNEL = "Others";
    String UI_JOB_BOARD_CHANNEL = "Job Board";
    String UI_AGENCY_CHANNEL = "Agency";
    String UI_NON_AGENCY_CHANNEL = "Non Agency";
    String UI_CAREER_SITES_CHANNEL = "Career Sites";
    String UI_SOCIAL_MEDIA_CHANNEL = "Social Media";

    String SOURCE_FILTER_ALL_CHANNELS = "ALL_CHANNELS";
    String SOURCE_FILTER_A_NA = "A_NA";

    String CAND_ETL_POSITION_NUMBER = "POSITION_NO";
    String CAND_ETL_JOB_ID = "JOB_ID";
    String CAND_ETL_APPLICANT_ID = "APPLICANT_ID";
    String CAND_ETL_EMPLID = "EMPL_ID";
    String CAND_ETL_FIRST_NAME = "FIRST_NAME";
    String CAND_ETL_LAST_NAME = "LAST_NAME";
    String CAND_ETL_DOB = "DOB";
    String CAND_ETL_EMAIL_ID = "EMAIL_ID";
    String CAND_ETL_RECRUITER_EMAIL = "REC_EMAIL";
    String CAND_ETL_STATUS = "STATUS";
    String CAND_ETL_JOINING_DATE = "JOINING_DATE";
    String CAND_ETL_PS_UPDATE_DATE = "PS_UPDATE_DATE";
    String CAND_ETL_RH_ID = "RH_ID";

/*EEO-CONSTANTS*/

    //mphasis
    String ETHINICITY_1 = "Hispanic or Latino";
    String ETHINICITY_2 = "White (Not Hispanic or Latino)";
    String ETHINICITY_3 = "Black or African American (Not Hispanic or Latino)";
    String ETHINICITY_4 = "Native Hawaiian or Other Pacific Islander (Not Hispanic or Latino)";
    String ETHINICITY_5 = "Asian (Not Hispanic or Latino)";
    String ETHINICITY_6 = "American Indian or Alaska Native (Not Hispanic or Latino)";
    String ETHINICITY_7 = "Two or More Races (Not Hispanic or Latino)";
    String ETHINICITY_8 = "Decline to Identify";

    //fractal
    String ETHINICITY_9 = "White (Not Hispanic)";
    String ETHINICITY_10 = "African American/Black (Not Hispanic)";
    String ETHINICITY_11 = "Hispanic";
    String ETHINICITY_12 = "Asian";
    String ETHINICITY_13 = "Pacific Islander";
    String ETHINICITY_14 = "American Indian";
    String ETHINICITY_15 = "Native Alaskan";
    String ETHINICITY_16 = "Native Hawaiian";
    String ETHINICITY_17 = "Multi-racial";


    String DISABLITY1 = "I dont't wish to answer";
    String DISABLITY2 = "Yes, i have a disability (or previously had a disability)";
    String DISABLITY3 = "No, i don't have a disability";

    //mphasis
    String VETERAN1 = "Disabled Veteran";
    String VETERAN2 = "Recently seperated Veteran";
    String VETERAN3 = "Armed force Services Medal Veteran";
    String VETERAN4 = "Other protected Veteran";

    //fractal
    String VETERAN5 = "Disabled Veteran";
    String VETERAN5_FOOTER = "A veteran of the U.S. military, ground, naval or air service who is entitled to compensation (or who but for the receipt of military retired pay would be entitled to compensation) under laws administered by the Secretary of Veterans Affairs; or a person who was discharged or released from active duty because of a service-connected disability";
    String VETERAN6 = "Recently separated veteran";
    String VETERAN6_FOOTER = "Any veteran during the three-year period beginning on the date of such veteran's discharge or release from active duty in the U.S.military, ground, naval, or air service";
    String VETERAN7 = "Active duty wartime or campaign badge veteran";
    String VETERAN7_FOOTER = "A veteran who served on active duty in the U.S. military, ground, naval or air service during a war, or in a campaign or expedition for which a campaign badge has been authorized under the laws administered by the Department of Defense";
    String VETERAN8 = "Armed forces service medal veteran";
    String VETERAN8_FOOTER = "A veteran who, while serving on active duty in the U.S. military, ground, naval or air service, participated in a United States military operation for which an Armed Forces service medal was awarded pursuant to Executive Order 12985";
    String VETERAN9 = "Not a Protected Veteran";
    String VETERAN10 = "I dont't wish to answer";
    String VETERAN11 = "Protected Veteran";

    String MALE = "MALE";
    String FEMALE = "FEMALE";

    String STR_COMPETENCY = "COMPETENCY";

    String SAME_ROUND_CAND_MOVEMENT = "Success: Candidate in Same Round";

    String JOB_SOURCER_STR = "jobSourcerStr";
    String HIRING_DEADLINE = "HIRING_DEADLINE";
    String PRIMARY_SKILLS_STR = "primarySkillsStr";
    String SECONDARY_SKILLS_STR = "secondarySkillsStr";
    String REC_CUSTOM1 = "recCustom1";
    String REC_CUSTOM2 = "recCustom2";
    String REC_CUSTOM3 = "recCustom3";
    String REC_CUSTOM4 = "recCustom4";
    String TYPE_CUSTOM1 = "typeCustom1";
    String TYPE_CUSTOM2 = "typeCustom2";
    String TYPE_CUSTOM3 = "typeCustom3";
    String TYPE_CUSTOM4 = "typeCustom4";
    String TYPE_CUSTOM5 = "typeCustom5";
    String TYPE_CUSTOM6 = "typeCustom6";
    String TYPE_CUSTOM7 = "typeCustom7";
    String TYPE_CUSTOM8 = "typeCustom8";
    String TYPE_CUSTOM9 = "typeCustom9";
    String TYPE_CUSTOM10 = "typeCustom10";
    String TYPE_CUSTOM11 = "typeCustom11";
    String TYPE_CUSTOM12 = "typeCustom12";
    String TYPE_CUSTOM13 = "typeCustom13";
    String TYPE_CUSTOM14 = "typeCustom14";
    String TYPE_CUSTOM15 = "typeCustom15";
    String TYPE_CUSTOM16 = "typeCustom16";
    String TYPE_CUSTOM17 = "typeCustom17";
    String CUSTOM1 = "custom1";
    String CUSTOM2 = "custom2";
    String CUSTOM3 = "custom3";
    String CUSTOM4 = "custom4";
    String CUSTOM5 = "custom5";
    String CUSTOM6 = "custom6";
    String CUSTOM7 = "custom7";
    String CUSTOM8 = "custom8";
    String CUSTOM9 = "custom9";
    String CUSTOM10 = "custom10";
    String CUSTOM11 = "custom11";
    String CUSTOM12 = "custom12";
    String CUSTOM13 = "custom13";
    String CUSTOM14 = "custom14";
    String CUSTOM15 = "custom15";
    String CUSTOM16 = "custom16";
    String CUSTOM17 = "custom17";
    String CUSTOM18 = "custom18";
    String CUSTOM19 = "custom19";
    String CUSTOM20 = "custom20";
    String REQUEST_DATE = "requestDate";
    String RECR_START_DATE = "recruitmentStartDate";

    String JOB_STATUS_REVIEW = "REVIEW";
    String REVIEW_JOB = "REVIEW_JOB";
    String CITIZENSHIP0 = "No answer";
    String CITIZENSHIP1 = "I am a U.S. Citizen/Permanent Resident";
    String CITIZENSHIP2 = "Non-citizen allowed to work for any employer";
    String CITIZENSHIP3 = "Non-citizen allowed to work for current employer";
    String CITIZENSHIP4 = "Non-citizen seeking work authorization";

    String RELOCATION0 = "No answer";
    String RELOCATION1 = "Yes";
    String RELOCATION2 = "No";

    String DUPLICATE = "Duplicate";
    String EMP_IMAGE_SRC_UPLOAD = "UPLOAD";
    String EMP_IMAGE_SRC_FB = "FB";
    String INTERNAL_TRACKING_DETAILS = "Internal Tracking Details";

    String TW_REPLACE_TWITTER_HANDLE = "<twitter_handle>";
    String TW_REPLACE_JOB_TITLE = "<job_title>";

    String KWENCH_API_KEY = "kwench.api.key";
    String FILE_SCANNER = "file.scanner";

    String WS_JOB_OPEN = "OPEN";
    String WS_JOB_CLOSE = "CLOSE";
    String WS_JOB_CANCELLED = "CANCELLED";

    String WS_JOB_CLIENT_INTERVIEW_YES = "YES";
    String WS_JOB_CLIENT_INTERVIEW_NO = "NO";
    String FRACTAL_INVALID_RESUME_ERROR = "error: file type is not supported";

    String JOB_LEVEL = "jobLevel";

    String EMP_REWARD_TYPE_CASH = "CASH";
    String EMP_REWARD_TYPE_COIN = "COIN";
    String EMP_REWARD_TYPE_ALL = "ALL";


    String HELP_SECTION_TYPE_GENERAL = "GENERAL";
    String CHANNEL_TYPE_SOCIAL = "SOCIAL";
    String HELP_SECTION_TYPE_REWARD = "REWARD";
    String HELP_SECTION_TYPE_COIN = "COIN";
    String HELP_SECTION_TYPE_IJP = "IJP";

    String TRANSACTION_PENDING = "P";
    String TRANSACTION_SUCCESS = "S";
    String TRANSACTION_FAILED = "F";
    String TRANSACTION_TYPE_TRANSFER = "TRANSFER";
    String TRANSACTION_TYPE_REDEEM = "REDEEM";
    String TRANSACTION_TYPE_REFUND = "REFUND";
    String TRANSACTION_TYPE_POINTS_QUERY = "POINTSQUERY";
    String TRANSACTION_TYPE_USER_DEACTIVATION = "USERSTATUS";

    String REWARD_RELEASE_TYPE_INSTANT = "INSTANT";
    String REWARD_RELEASE_TYPE_DEFERRED = "DEFERRED";

    //    mongo activity type
    String MONGO_ACTIVITY_CAMPAIGN_UPDATE = "CAMPAIGN_UPDATE";
    String MONGO_ACTIVITY_SAVE_CANDIDATE = "SAVE_CANDIDATE";
    String MONGO_ACTIVITY_CONTEST_UPDATE = "CONTEST_UPDATE";
    String MONGO_ACTIVITY_EMP_REFERALL = "EMP_REFERALL";
    String MONGO_ACTIVITY_JOB_UPDATE = "JOB_UPDATE";
    String MONGO_ACTIVITY_JOB_REVIEW_UPDATE = "JOB_REVIEW_UPDATE";
    String MONGO_ACTIVITY_CANDIDATE_UPDATE = "CANDIDATE_UPDATE";


    String RUPEE_SYMBOL = "Rs.";
    String DOLLAR_SYMBOL = "$";

    String MPHASIS_ENCRYPTION_KEY = "mphasis.encryption.key";
    String EMIDS_ENCRYPTION_KEY = "emids.encryption.key";

    String EMIDS_SECRET_KEY = "emids.secret.key";

    String MICROSOFT_SSO_CLIENT_KEY = "microsoft.sso.client.id";
    String MICROSOFT_SSO_CLIENT_SECRET = "microsoft.sso.client.secret";
    String MICROSOFT_SSO_REDIRECT_URL = "microsoft.sso.redirect.url";
    String MICROSOFT_SSO_TOKEN_URL = "microsoft.sso.token.url";
    String MICROSOFT_SSO_AUTHORIZATION_URL = "microsoft.sso.authorize.url";
    String QUERY_PARAMETER_CODE = "code";
    String AUTHORIZATION_CODE = "authorization_code";
    String REDIRECT_URI = "redirect_uri";
    String RESPONSE_TYPE = "response_type";
    String CLIENT_ID = "client_id";
    String REQUEST_SCOPE = "scope";
    String REQUEST_STATE = "state";
    String REQUEST_NOUNCE = "nounce";

    String COINS_DEV_EMAIL = "coins.dev.email";

    String REQUEST_METHOD_POST = "POST";
    String REQUEST_METHOD_GET = "GET";
    String REQUEST_METHOD_PUT = "PUT";
    String REQUEST_API_KEY = "app-key";
    String REQUEST_ACCESS_TOKEN = "access-token";
    String REQUEST_CONTENT_TYPE = "Content-Type";

    Integer HTTP_RESPONSE_OK = 200;
    Integer HTTP_RESPONSE_REDIRECT = 304;
    Integer HTTP_RESPONSE_ERROR = 400;
    Integer HTTP_RESPONSE_INTERNAL_SERVER_ERROR = 500;

    String KWENCH_POINTS_URL = "kwench.points.url";
    String KWENCH_USER_POINTS_URL = "kwench.user.points.api";
    String KWENCH_USER_DEACTIVATION_URL = "kwench.user.deactivate.api";
    String KWENCH_ACCESS_TOKEN = "kwench.api.accesstoken";
    String KWENCH_LANDING_PAGE = "kwench.sso.landingpage";
    String KWENCH_POINTS_HISTORY_PAGE = "pointsHistory";

    String JOB_ETL = "JOB_ETL";
    String CANDIDATE_ETL = "CANDIDATE_ETL";
    String REJECTION_ETL = "REJECTION_ETL";
    String ETL_PROCESSING = "Processing";
    String ETL_PROCESSED = "Processed";
    String ETL_ERROR = "Error";
    String ETL_INVALID_FILE = "Invalid file";
    String ETL_FAILED = "Failed";
    String ETL_INPUT_FILE = "etl_input";
    String ETL_OUTPUT_FILE = "etl_output";

    String RAW_JOB_EXPORT = "RAW_JOB_EXPORT";
    String ACTION_STATUS_DUPLICATE = "duplicate";


    String JOB_DISPLAY_STATUS_OPEN = "OPEN";
    String JOB_DISPLAY_STATUS_CLOSED = "CLOSED";
    String JOB_DISPLAY_STATUS_CANCELLED = "CANCELLED";
    String JOB_DISPLAY_STATUS_DRAFT = "DRAFT";
    String CANDIDATE_EXPORT_MAIL = "candidate.export.mail";
    String JOB_EDIT = "JOB_EDIT";
    String CANDIDATE_EDIT = "CANDIDATE_EDIT";
    String APP_JOB_SEQ = "jobSeq";
    String LnTINFOTECH = "L&T Infotech - ";

    String CROLE = "CROLE*";
    String LEVEL_A = "LEVEL_A*";
    String LEVEL_S = "LEVEL_S*";
    String WITHDRAWN_BY = "WITHDRAWN_BY";
    String WITHDRAWN_LEVEL = "WITHDRAWN_LEVEL";
    String DEPARTMENT = "DEPARTMENT";
    String ACCOUNT_CLIENT = "ACCOUNT_CLIENT";
    String SOLR_CUSTOM1 = "CUSTOM1";
    String SOLR_CUSTOM2 = "CUSTOM2";
    String SOLR_CUSTOM8 = "CUSTOM8";
    String SOLR_CUSTOM11 = "CUSTOM11";
    String SOLR_CUSTOM11_LOWER = "CUSTOM11_LOWER";
    String OVERDUE_DATE = "OVERDUE_DATE";
    String OVERDUE = "OVERDUE";
    String IN_PROGRESS_OVERDUE = "IN PROGRESS & OVERDUE";
    String IN_PROGRESS = "IN PROGRESS";
    String OFFERED = "OFFERED";
    String OFFERED_OVERDUE = "OFFERED & OVERDUE";
    String CANDIDATE_DETAILS_ACTION = "CAND_DETAILS";
    String RIPPLEHIRE_PRIVATE_KEY = "ripplehire.signing.key.private";
    String ABG_PUBLIC_KEY = "abg.signing.key.public";
    String RIPPLEHIRE_ABG_APP_NAME = "ripplehire.abg.appname";
    String SCHEDULED = "SCHEDULED";
    String FEEDBACK_QUESTION_TYPE_SCHEDULE = "SCHEDULE";
    String IS_REVIEW_DONE = "IS_REVIEW_DONE";
    String IS_FEEDBACK_DONE = "IS_FEEDBACK_DONE";
    int JOB_DATA_COLUMN_COUNT = 59;
    String SOURCE_CHANGE = "source_change";
    String MOVEMENT_ACTIONS = "move_actions";
    String HIRE_ROUND_MOVEMENT = "HIRE_ROUND_MOVEMENT";
    String CHANGE_SOURCE = "CHANGE_SOURCE";
    String REWARD_DEACTIVATION = "REWARD_DEACTIVATION_FOR_EMPLOYEES";
    String UPDATE_LOGIN_ATTEMPT = "update";
    String RESET_LOGIN_ATTEMPT = "reset";

    String LOCK_USER = "LOCK_USER";
    String UNLOCK_USER = "UNLOCK_USER";
    String RESET_PASSWORD = "RESET_PASSWORD";
    String CAND_AGE_STAGE = "candidate-ageing-stages";
    String MAIL_FOLDER_INBOX = "inbox";
    String MAIL_STATUS_READ = "read";
    String MAIL_STATUS_UNREAD = "unread";
    String WALMART_DIT_REPORT = "walmartDitReport";
    String WALMART_SENDER_MAILID = "walmart.sender.mailId";
    String JOB_LOCATION_STR = "jobLocationStr";
    String COMPANY_CD_WALMART = "WALMARTLABS";

    String DUP_CHECK_BY_EMAIL = "EMAIL";
    String DUP_CHECK_BY_EMAIL_ON_SINGLE_JOB = "EMAIL_SINGLE_JOB";
    String DUP_CHECK_BY_PHONE = "PHONE";
    String DUP_CHECK_BY_PHONE_ON_SINGLE_JOB = "PHONE_SINGLE_JOB";
    String APPLICATION_ERROR_MSG = "error_msg";
    List<Integer> CTP_JOB_SEQ_LIST = new ArrayList<Integer>() {{
        add(4947);
        add(9839);
        add(12498);
        add(16087);
        add(12622);
        add(28162);
        add(28163);
        add(12498);
        add(12622);
        add(28164);
    }};

    String PS_ID_REQUESTED = "Applicant Id Requested";
    String PS_ID_INPROCESS = "Applicant Id Requested-Inprocess";
    String OFFERED_POSITION = "offered_positions";
    String STR_REQUIRED = "required.";
    String ACTION_STATUS_INVALID = "invalid";
    String CLIENT_CUSTOM_MSTR_MARTIAL_STATUS = "martialStatus";

    String RIPPLEHIRE_ENCRYPTION_KEY = "ripplehire.encryption.key";
    String RIPPLEHIRE_ENCRYPTION_MAPPER_KEY = "ripplehire.encryption.mapper.key";
    String DEFAULT_SMTP = "DEFAULT_SMTP";
    String DEFAULT_JOB_REWARD_BAND = "DEFAULT_BAND";
    String INTERVIEW_SCHEDULE_INTERVIEWER = "INTERVIEWER";
    String INTERVIEW_SCHEDULE_ORGANIZER = "ORGANIZER";
    String INTERVIEW_SCHEDULE_RECRUITER = "RECRUITER";
    String END_TIME_SCHEDULED = "END_TIME_SCHEDULED";
    String PENDINGMAIL_FETCH_SIZE = "pendingmail.fetchsize";
    String OTHER_UPPERCASE = "OTHER";
    String SOCIAL_EXPLORER_BADGE_CODE = "Social Explorer";

    String CANCEL_REASON = "CANCEL_REASON";


    String INTERVIEW_SCHEDULE = "SCHEDULE";
    String INTERVIEW_REVIEW = "REVIEW";

    String INTERVIEW_CANDIDATES_TODAY = "CT";
    String INTERVIEW_CANDIDATES_UPCOMING = "CU";
    String INTERVIEW_CANDIDATES_PENDING_FEEDBACK = "CPF";
    String INTERVIEW_CANDIDATES_COMPLETED = "CD";
    String REVIEW_CANDIDATES_PENDING = "RCP";
    String REVIEW_CANDIDATES_COMPLETED = "RCD";

    String FACE_TO_FACE_INTERVIEW_CODE = "FTF";
    String TELEPHONIC_INTERVIEW_CODE = "TEL";
    String VIDEO_INTERVIEW_CODE = "VED";
    String REVIEW_INTERVIEW_CODE = "REVIEW";

    String INTERVIEW_FEEDBACK_ACTION_ACCEPT_REJECT = "ACCEPT-REJECT";
    String INTERVIEW_FEEDBACK_ACTION_FEEDBACK = "FEEDBACK";

    String COMMENT_TYPE_ALL = "ALL";
    String COMMENT_TYPE_INTERVIEWER_COMMENT = "INTERVIEWER_COMMENT";
    String COMMENT_TYPE_INTERVIEWER_ONLY_COMMENT = "INTERVIEWER_ONLY_COMMENT";
    String COMMENT_TYPE_RECRUITER_COMMENT = "RECRUITER_COMMENT";
    String COMMENT_TYPE_FEEDBACK_COMMENT = "FEEDBACK_COMMENT";
    String COMMENT_TYPE_RECRUITER_ONLY_COMMENT = "RECRUITER_ONLY_COMMENT";

    String FIELD_TYPE_CANDIDATE = "candidate";
    String FIELD_TYPE_INTERVIEW = "interviewer";
    String FIELD_TYPE_JOB_VIEW = "job_view";
    String STR_DASH = "-";
    String STR_DASH_WITH_SPACE = " - ";
    String STR_DAYS = "Days";
    Integer CONVERT_TO_TIME = 60000;

    String MPHASIS_DEADLINE_CONFIG_START = "mphasis.deadline.startdate";
    String STR_YES = "yes";
    String STR_NO = "no";

    String INTERVIEW_NOTIFICATION_1 = "INTERVIEW_NOTIFICATION_1";
    String INTERVIEW_NOTIFICATION_2 = "INTERVIEW_NOTIFICATION_2";
    String INTERVIEW_NOTIFICATION_3 = "INTERVIEW_NOTIFICATION_3";
    String INTERVIEW_COMPLETED_NOTIFICATION = "INTERVIEW_FEEDBACK_DONE_NOTIFICATION";

    String REVIEW_NOTIFICATION_1 = "REVIEW_NOTIFICATION_1";
    String REVIEW_NOTIFICATION_2 = "REVIEW_NOTIFICATION_2";
    String REVIEW_NOTIFICATION_3 = "REVIEW_NOTIFICATION_3";

    String INTERVIEW_NOTIFY_1_CD = "INTERVIEW_NOTIFY_1";
    String INTERVIEW_NOTIFY_2_CD = "INTERVIEW_NOTIFY_2";
    String INTERVIEW_NOTIFY_3_CD = "INTERVIEW_NOTIFY_3";
    String INTERVIEW_FEEDBACK_DONE_NOTIFY = "INTERVIEW_FEEDBACK_DONE_NOTIFY";

    String REVIEW_NOTIFY_1_CD = "REVIEW_NOTIFY_1";
    String REVIEW_NOTIFY_2_CD = "REVIEW_NOTIFY_2";
    String REVIEW_NOTIFY_3_CD = "REVIEW_NOTIFY_3";

    String INTERVIEW_HISTORY_SCHEDULE_CHANGE = "SCHEDULE_CHANGE";

    String CANDIDATE_PAGE_FIELD_TYPE_AUTO_COMPLETE = "autocomplete";

    String STR_YES_FIRST_LETTER_CAP = "Yes";
    String STR_NO_FIRST_LETTER_CAP = "No";

    String JOB_STATUS_MSTR_ACTIVE = "ACTIVE";
    String JOB_STATUS_MSTR_CLOSED = "CLOSED";
    String JOB_STATUS_MSTR_DRAFT = "DRAFT";
    String JOB_STATUS_MSTR_CANCELLED = "CANCELLED";
    String JOB_STATUS_MSTR_DELETED = "DELETED";
    String JOB_STATUS_MSTR_RECRUITER_REVIEW = "RECRUITER_REVIEW";
    String JOB_STATUS_MSTR_HIRING_APPROVAL = "APPROVAL";
    String JOB_STATUS_MSTR_APPROVAL_REJECTED = "APPROVAL_REJECTED";
    String JOB_STATUS_MSTR_WITHDRAWN = "WITHDRAWN";

    String JOB_STATUS_MSTR_CUSTOM_REVIEW = "REVIEW";
    String JOB_STATUS_MSTR_NEW_JOB = "NEW_JOB";
    String JOB_STATUS_MSTR_NEW_JOB_REQUEST = "NEW_JOB_REQUEST";

    String JOB_STATUS_ACTION_SAVE = "SAVE_PUBLISH";
    String JOB_STATUS_ACTION_DRAFT = "SAVE_DRAFT";

    String NEW_JOB_REQUEST = "NEW_JOB_REQUEST";
    String HIRING_TEAM = "HIRING_TEAM";
    String RECRUITING_TEAM = "RECRUITING_TEAM";
    String JOB_STATUS_MSTR_TYPE_REQUEST = "JOB_REQUEST";
    String JOB_STATUS_MSTR_TYPE_JOB = "JOB";

    String JOB_APPROVAL_TYPE_DEFAULT = "DEFAULT";
    String JOB_APPROVAL_TYPE_GROUP = "GROUP";
    String JOB_APPROVAL_TYPE_CUSTOM = "CUSTOM";
    String APPROVER_LABEL = "Approver #";
    String APPROVER_NAME = "jobApprover";
    String APPROVER_TEAM = "APPROVER_TEAM";
    String RECRUITER_REVIEWER_TEAM = "RECRUITER_REVIEWER_TEAM";
    String TYPE_REJECT_REASON_CANDIDATE_REJECT = "CANDIDATE_REJECT";
    String TYPE_REJECT_REASON_APPROVAL_REJECT = "APPROVAL_REJECT";
    String TYPE_REJECT_REASON_TYPE_WITHDRAW_JOB_REQUEST = "WITHDRAW_JOB_REQUEST";

    String RECR_BOX_JOB_STATE_PUBLISHED = "Published";
    final String HTML_BREAK = "<br/>";

    String REFERRAL_CHANNEL_CAREERSITE = "CAREERSITE";
    String REFERRAL_CHANNEL_ALUMNI = "ALUMNI";
    String ADDITIONAL_INFO = "ADDITIONAL INFO";
    public String WALMART_MAIL_SUBJECT = "walmart.mail.subject";

    String SMS_SENDER_BASE_URL = "sms.kap.baseurl";
    String SMS_SENDER_INTERNATIONAL_BASE_URL = "sms.kap.international.baseurl";

    String EMPLOYEE_PHONE_NUMBER = "PhoneNo";
    String EMPLOYEE_COMPANY_NUMBER = "CompanyId";
    String EMPLOYEE_SMS_TYPE = "SMSType";
    String EMPLOYEE_USER_ID = "UserId";
    String EMPLOYEE_JOB_ID = "JobId";
    String EMPLOYEE_SMS_TEMPLATE = "SmsTemplate";
    String CANDIDATE_USER_ID = "CandUserId";
    String EMP_USER_ID = "EmpUserId";
    String CANDIADTE_INTERVIEW_LOCATION = "Location";
    String CANDIADTE_INTERVIEW_TIME = "Time";
    String CANDIADTE_INTERVIEW_DAY = "Day";
    String CANDIDATE_MESSAGE = "Message";

    String SMS_TYPE_WELCOME = "welcome";
    String SMS_TYPE_JOB = "job";
    String JOB_VIEW_GROUP_REQUEST_DETAILS = "Request Details";
    String DEFAUKT_KIT_TYPE = "DEFAULT";
    String BAND_OTHERS = "OTHERS";

    String IJP_CONFIG_1 = "IJP_CONFIG_1";
    String IJP_CONFIG_2 = "IJP_CONFIG_2";
    String IJP_CONFIG_3 = "IJP_CONFIG_3";
    String STRING_OR_WITH_SPACES = " OR ";
    String STRING_AND_WITH_SPACES = " AND ";
    String IJP_ALLOW = "IJP_ALLOW";
    String IJP_DENY = "IJP_DENY";
    String IJP_CONFIG_TYPE_ALLOW_SAME = "ALLOW_SAME";
    String IJP_CONFIG_TYPE_DISALLOW_SAME = "DISALLOW_SAME";
    String IJP_CONFIG_TYPE_CUSTOM = "CUSTOM";
    String IJP_ALLOW_CRITERIA = "ALLOW";
    String IJP_DENY_CRITERIA = "DENY";
    String SOLR_JOB_LEVEL = "JOB_LEVEL";
    String CLIENT_INTERNAL_MAPPING_TYPE_DEPARTMENT = "DepartmentMapping";

    String EMAIL_SUBJECT_JOB_REPLACE = "<jobtitle>";
    String EMAIL_SUBJECT_COMPANY_REPLACE = "<company>";
    String TALEO_ER_JOBS = "Epsilon India Referral Site ONLY";
    String STR_SUCCESS = "SUCCESS";
    String STR_FAIL = "FAIL";
    String STR_UPDATE_ERROR = "UPDATE-ERROR";
    String STR_UPDATE_NOMOVE = "UPDATE-NOMOVE";
    String STR_UPDATE_ERROR_MOVE = "UPDATE-ERROR-MOVE";
    String STR_UPDATE_SUCCESS = "UPDATE-SUCCESS";
    String STR_UPDATE_IGNORE = "UPDATE-IGNORE";
    String STR_UPDATE_EXCEPTION = "UPDATE-EXCEPTION";
    String STR_APPLY_SUCCESS = "APPLY-SUCCESS";
    String STR_APPLY_FAILED = "APPLY-FAILED";
    String STR_ASC = "ASC";
    String STR_DESC = "DESC";
    String ATTACHMENT_CREATED = "CREATED";
    String ATTACHMENT_DELETED = "DELETED";
    String ATTACHMENT_TYPE_OTHER = "OTHER";
    String JOB_UPLOAD = "jobupload";
    String CAND_UPLOAD = "candupload";
    String REFERRAL_PAYOUT_REPORT_CD = "REFERRAL_PAYOUT";
    String SYSTEM_ADMIN_USER = "system.admin";


    //Added By Vikas//
    String VERIFICATION_REPORT = "VERIFICATION_REPORT";
    String PENDING_PAYMENT_REPORT = "PENDING_PAYMENT_REPORT";
    String READY_DISBURSEMENT_REPORT = "READY_DISBURSEMENT_REPORT";
    String DISBURSEMENT_REPORT = "DISBURSEMENT_REPORT";
    String REPORT_CD_REDEMPTION_VERIFICATION = "redemption-verification-report";
    String REPORT_CD_REDEMPTION_READY_FOR_DISBURSEMENT = "redemption-ready-for-disbursment-report";
    String REPORT_CD_REDEMPTION_DISBURSED = "redemption-disbursed-report";
    String REPORT_CD_REDEMPTION_PENDING_PAYMENT = "redemption-pending-payment-report";
    String DOLLAR = "USD";
    String RUPEE = "INR";
    char REDEMPTION_PAYOUT_TYPE_VERIFICATION = 'V';
    char REDEMPTION_PAYOUT_TYPE_PENDING_PAYMENT = 'P';
    char REDEMPTION_PAYOUT_TYPE_DISBURSED = 'D';
    char REDEMPTION_PAYOUT_TYPE_READY_DISBURSED = 'R';


    //End//

    String DATA_COUNT = "COUNT";
    String DATA_ALL = "ALL";

    String LIST_PAGE = "list";
    String DETAIL_PAGE = "detail";
    String JOB_LIST_CD = "JOB_LIST";
    String JOB_DESC_CD = "JOB_DESC";
    String MAX_SMS_FETCH = "pendingsms.fetchsize";
    String TRANSACTION_ERROR = "E";
    String SMS_TEMPLATE_TYPE_JOB = "JOB_SMS";
    String SOLR_JOB_SEQ = "JOB_SEQ";
    String SMS_SCHEDULE_BULK_JOB = "Bulk Job Share";
    String SMS_SCHEDULE_PROCESS = "IN_PROCESS";
    String SMS_SCHEDULE_DONE = "DONE";
    String STR_HTTPS = "https://";

    String SMS_API_INDIA = "IND";
    String SMS_API_INTERNATIONAL = "INTRN";
    String SMS_API_AWS_SNS = "AWS_SNS";

    String RIPPLEHIRE_URL = "ripplehire.url";
    Character CHARACTER_P = 'P';
    Character CHARACTER_S = 'S';
    Character CHAR_PERCENT_SYMBOL = '%';
    String SMS_FETCH_SIZE = "sms.fetchsize";

    String DELETED_CANDIDATE_EMAIL_ADDRESS = "deleted@candidate.com";
    String DELETED_CANDIDATE_FULL_NAME = "Deleted Candidate";
    String MAIL_TYPE_JOB_REFERRAL_MAIL = "JOB_REFERRAL";
    String MAIL_TYPE_JOB_APPLICATION_PROGRESS_MAIL = "JOB_APPLICATION_PROGRESS";
    String S3_SYNC_LOCAL_FOLDER = "s3.sync.localfolder";

    //Export Types for Excel Export Log
    String EXPORT_TYPE_USER_MANAGEMENT = "User Management Export";
    String EXPORT_TYPE_CANDIDATE_MPHASIS_DAILY = "Mphasis Daily Candidate Export";
    String EXPORT_TYPE_CANDIDATE = "Candidate Export";
    String EXPORT_TYPE_BULK_SMS = "Bulk SMS Export";
    String EXPORT_TYPE_JOB_EXPORT = "Job Export";
    String EXPORT_TYPE_INTERVIEW_REPORT_EXPORT = "Interview Report Export";
    String WALMART_6_MONTH_ISSUE = "WALMART 6 MONTH ISSUE";

    String COMPANY_MSTR_SEQ_ATTR = "companyMstrSeq";
    String TRANSACTION_ID = "transactionId";
    String ACCESS_TOKEN = "accessToken";

}
