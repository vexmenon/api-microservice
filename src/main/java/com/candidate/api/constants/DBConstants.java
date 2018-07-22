package com.candidate.api.constants;

public interface DBConstants {

    //Table Names
    String TBL_EMPLOYEE_MSTR = "employee_mstr";
    String TBL_JOB = "job";

    //Query Parameter Field Names

    String FORM_TYPE = "formType";
    String BATCH_PROCESS_FILE_NAME = "fileName";
    String EMPLOYEE_MSTR_SEQ = "employeeMstrSeq";
    String COMPANY_MSTR_SEQ = "companyMstrSeq";
    String STATUS = "status";
    String FIELD_DUPLICATE = "fieldDuplicate";
    String PARENT_COMPANY_MSTR_SEQ = "parentCompanyMstrSeq";
    String JOB_SEQ = "jobSeq";
    String REWARD_TYPE_CD = "rewardTypeCd";
    String REWARD_RELEASE = "rewardRelease";
    String REWARD_TYPE_MSTR_SEQ = "rewardTypeMstrSeq";
    String GOAL_SEQ_LIST = "goalSeq";
    String GOAL_SEQ = "goalSeq";
    String ACTIVITY_MSTR_SEQ = "activityMstrSeq";
    String ACTIVITY_MSTR_CD = "activityCd";
    String USERPROFILE_SEQ = "userProfileSeq";
    String VIEW_TYPE = "viewType";
    String REFRL_STATUS_CD = "refrlStatusCd";
    String REFRL_STATUS_CODE = "refrlStatusCode";
    String REFRL_CHANNEL_CD = "refrlChannelCd";
    String REFRL_CHANNEL_CD_FACEBOOK = "FACEBOOK";
    String REFRL_CHANNEL_CD_LINKEDIN = "LINKEDIN";
    String REFRL_CHANNEL_CD_TWITTER = "TWITTER";
    String REFRL_TYPE_CD = "referralTypeCd";
    String CONTEST_JOB_SEQ = "contestJobSeq";
    String CAMPAIGN_JOB_SEQ = "campaignJobSeq";
    String CAMPAIGN_SEQ = "campaignSeq";
    String CANDIDATE_SEQ = "candidateSeq";
    String CANDIDATE_RESUME_DETAILS_SEQ = "candidateResumedetailsSeq";
    String CONTEST_SEQ = "contestSeq";
    String REWARD_CRITERIA = "rewardCriteria";
    String CONTEST_WIN_POSITION = "contestWinPosition";
    String DELETED_USER_SEQ = "deletedUserSeq";
    String JOB_REFRL_TYPE_SEQ = "jobRefrlTypeSeq";
    String USER_ID = "userId";
    String COMPANY_EMPLOYEE_ID = "companyEmplId";
    String JOB_TITLE_STRING = "jobTitleString";
    String JOB_SEQ_LIST = "jobSeqList";
    String FRIEND_USER_ID = "friendUserId";
    String FRIEND_FIRST_NAME = "friendFirstName";
    String FRIEND_LAST_NAME = "friendLastName";
    String FIRST_NAME = "firstName";
    String LAST_NAME = "lastName";
    String FRIEND_JOB_TITLE = "friendJobTitle";
    String FRIEND_COMPANY_NM = "friendCompanyNm";
    String EMPL_REFRL_SEQ = "emplRefrlSeq";
    String TIMEZONE_DESCRIPTION = "timezoneDescr";
    String INTERVIEW_SCHEDULE_SEQ = "interviewScheduleSeq";
    String INTERVIEW_REVIEW_SEQ = "interviewReviewSeq";
    String USER_TYPE = "userType";
    String INTERVIEW_DETAIL_SEQ = "interviewDetailSeq";
    String INTERVIEW_STAGE_MSTR_SEQ = "interviewStageMstrSeq";
    String FIND_CANDIDATE_BY_EMAIL_ADDR_AND_COMPANY_ID = "Candidate.findCandidateByEmailAddrAndCompanyMstrSeq";
    String JOB_RECRUITER_ROLE = "role";
    String EMAIL_ADDR = "emailAddr";
    String USER_ROLE = "userRole";
    String USER_ROLE_CD = "userRoleCd";
    String ALTERNATE_EMAIL_ADDR = "alternateEmailAddr";
    String EMAIL_LIST = "emailList";
    String EMPL_REFRL_TOKEN = "token";
    String SKILL_TEXT = "skillText";
    String REFRL_CHANNEL_MSTR_SEQ = "refrlChannelMstrSeq";
    String STAGE_NUMBER = "stageNumber";
    String ACTIVITY_STAGE_CNT = "activitystageCnt";
    String GOAL_LIST = "goalList";
    String TOTAL_POINTS = "totalPoints";
    String CURRENT_LEVEL = "currentLevel";
    String ACTIVITY_COUNT = "activityCount";
    String CITY = "city";
    String KEYWORDS = "keywords";
    String VENDOR_ID = "vendorId";
    String UPDATE_DTTM = "updateDttm";
    String VENDOR_MSTR_SEQ = "vendorMstrSeq";
    String VENDOR_CATERGORY_SEQ = "vendorCategorySeq";
    String VENDOR_MSTR_SEQ_LIST = "vendorMstrSeqList";
    String INTERVIEW_TOKEN = "interviewToken";
    String INTERVIEW_DETAILS_SEQ = "interviewDetailsSeq";
    String USER_PROFILE_SEQ = "userProfileSeq";
    String CURRENTDATE = "currentDate";
    String LOCATION_SEQ = "locationMstrSeq";
    String INTERVIEW_PRIORITY = "interviewPriority";
    String JOB_TITLE = "jobTitle";
    String ROUND_CODE = "roundCode";
    String STAGE_DESC = "stageDesc";
    String JOB_STATUS = "jobStatus";
    String JOB_TYPE = "jobType";
    String EMAIL_TEMPLATE_CD = "emailTemplateCd";
    String DAYS = "days";
    String REFRL_MODE_CD = "refrlModeCd";
    String BAND_CODE = "bandCd";
    String ACCESS_TOKEN = "accessToken";
    String JOB_CODE = "jobCd";
    String PHONE_NO = "phoneNo";
    String DOB = "dob";
    String START_DATE = "startDate";
    String END_DATE = "endDate";
    String DATE_DIFFERENCE = "difference";
    String SOCIAL_CHANNEL_CD = "socialChannelCd";
    String TRANSACTION_ID = "transactionId";
    String TRANSACTION_TYPE = "transactionType";
    String TRANSACTION_TYPE_REDEEM = "REDEEM";
    String VENDOR_PROFILE_SEQ = "vendorProfileSeq";
    String VENDOR_DEFAULT_EMAIL = "vendorDefaultMail";
    String REQUEST_TYPE = "requestType";
    String COINS_REQUEST_HISTORY = "CoinsServiceLog.fetchUserCoinsHistory";
    String CURRENCY_MSTR_SEQ = "currencyMstrSeq";
    String USER_SEARCH = "userSearch";

    String EMP_RWRD_CAT_SEQ = "empRwrdCatSeq";
    String EMPL_RWRD_CAT = "emplRwrdCat";
    String SOCIAL_MEDIA_ID = "socialMediaID";

    String COMPANY_NAME = "companyName";
    String COMPANY_LOGO_IMAGE = "logoImage";
    String CONTEST_TITLE = "contestTitle";
    String CONTEST_BANNER = "contestBanner";
    String CONTEST_JOBS = "contesJobs";
    String SOURCER_EMAIL = "sourcerEmail";

    String COUNTRY_NAME = "countryName";
    String STATE_NAME = "stateName";
    String LANG_CD = "langCd";
    String TIME_ZONE = "timezone";
    String CLIENT_INTERVIEW_STATUS_SEQ = "clientInterviewStatusSeq";

    String SEARCH_STR = "searchStr";
    String SORT_STR = "sortStr";
    String SORT_DIR = "sortDir";
    String ONLY_EMP_REF = "showOnlyEmp";
    String FORGOT_PASSWORD_TOKEN = "forgotPasswordToken";
    String ONLY_CAREER_SITE = "isCareerSite";

    String REPORT_TYPE = "type";
    String REPORT_MSTR_SEQ = "reportMstrSeq";
    String REPORT_CD = "reportCd";
    String ENTITY = "entity";
    String CHANNEL_TYPE = "channelType";
    String JOB_CHANNEL_TYPE = "jobChannelType";
    String JOB_CHANNEL_SPECIFIC = "channelSpecific";
    String HELP_SCTION_FOR = "sectionFor";
    String LOG_CANDIDATE_REAPPLY = "log_candidate_reapply";
    String ETL_TYPE = "etlType";
    String UPLOAD_STATUS = "uploadStatus";
    String MPHASIS_ETL_IMPORT_STATUS = "importStatus";
    String ETL_LOG_SEQ = "etlFileLogSeq";
    //Widget
    String PAGE_MSTR_SEQ = "pageMstrSeq";
    String WIDGET_CD = "widgetCd";

    String FIELD_EXPORT = "fieldExport";
    String JOB_REQUEST_TYPE = "jobRequestType";

    String BADGE_CD = "badgeCd";
    String INTERVIEWER_SEQ = "interviewerSeq";
    String INTERVIEW_SEQ = "interviewSeq";
    String INTERVIEW_STATUS = "interviewStatus";
    String PREV_COMMENT_TIME_LIMIT = "prevCommentTime";
    String INTERVIEW_TYPE = "interviewType";
    String USER_GROUP_CD="userGroupCd";
    String LEVEL = "level";
    String USER_GROUP_SEQ = "userGroupSeq";
    String TYPE = "type";
    String MAIL_SUBJECT="mailSubject";
    String MAIL_RECEIVED_DATE = "receivedDate";
    String INTERVIEW_KIT_SEQ = "interviewKitSeq";
    String INTERVIEW_KIT_TAG_MSTR_TITLE = "tagTitle";
    String INTERVIEW_KIT_TAG_MSTR_SEQ = "interviewKitTagMstrSeq";
    String INTERVIEW_FEEDBACK_QUESTION_TOPIC_DETAIL = "topicDetails";
    String INTERVIEW_KIT_SEQ_LIST = "interviewKitSeqList";
    String CONFIG_CD = "configCd";
    String CONFIG_VALUE = "configValue";
    String JOB_CRITERIA = "jobCriteria";
    String CRITERIA_CONDITION="criteriaCondition";
    String APPLICATION_STATUS = "applicationStatus";

    String REDEMPTION_PAYOUT_DETAIL_SEQ = "redemptionPayoutDetailsSeq";
    String EMPL_REWARD_CAT = "emplRwrdCat";
    String SMS_TEMPLATE_TYPE = "templateType";
    String SMS_SCHEDULE_SEQ="smsScheduleDetailSeq";
    String SMS_LOG_TRANSACTION_STATUS="transactionStatus";
    String ALLOW_IJP = "allowIjp";
    String SMS_TEMPLATE_ID = "smsTemplateId";

    String SHORT_URL = "shortURL";
    String IS_DEFAULT = "isDefault";
    String UNSUBSCRIBE_TYPE = "unsubscribeType";

    //Named queries
    String FIND_EMP_BY_EMPSEQ = "EmployeeMstr.findEmployeeByEmpSeq";
    String FIND_ALL_JOBS = "Job.findAllJobs";
    String FIND_ALL_COMPANY_JOBS = "Job.findAllCompanyJobs";
    String FIND_IS_COMPANY_CAMPAIGN = "Campaign.findIsCompanyCampaign";
    String FIND_HOT_JOBS = "Job.findHotJobs";
    String FIND_RANDOM_JOBS = "Job.findRandomJobs";
    String FIND_JOB_REWARDS = "Job.findRewards";
    String FIND_JOB_RECRUITERS = "Job.findJobRecruiters";
    String FIND_JOB_RECRUITERS_USER_PROFILE_SEQ = "Job.findJobRecruitersByUserProfileSeq";
    String FIND_JOB_RECRUITERS_ROLE = "Job.findJobRecruitersByRole";
    String FIND_JOB_RECRUITERS_BY_USER_ROLE_NOT_IN  = "Job.findJobRecruitersByUserRoleNotIn";
    String FIND_JOB_LOCATIONS = "Job.findJobLocations";
    String FIND_JOB = "Job.findJob";

    String FIND_JOB_LIST = "Job.findJobList";

    String FIND_JOB_LIST_FOR_CAMPAIGN = "Job.findJobListForCampaign";
    //String FIND_JOB_LIST_FOR_LOCATION = "Job.findJobListForLocation";
    //String FIND_JOB_LIST_FOR_LOC_CAMP = "Job.findJobListForLocAndCamp";


    String FIND_ALL_JOB_LIST_TO_LINK_DESC = "Job.findAllJobListToLinkDesc";
    String FIND_ALL_JOB_LIST_TO_LINK_INT_DESC = "Job.findAllJobListToLinkIntDesc";
    String FIND_ALL_JOB_LIST_TO_LINK_ASC = "Job.findAllJobListToLinkAsc";
    String FIND_ALL_JOB_LIST_TO_LINK_INT_ASC = "Job.findAllJobListToLinkIntAsc";

    String FIND_JOB_LIST_TO_LINK_DESC = "Job.findJobListToLinkDesc";
    String FIND_JOB_LIST_TO_LINK_INT_DESC = "Job.findJobListToLinkIntDesc";
    String FIND_JOB_LIST_TO_LINK_ASC = "Job.findJobListToLinkAsc";
    String FIND_JOB_LIST_TO_LINK_INT_ASC = "Job.findJobListToLinkIntAsc";

    String FIND_ALL_CONTEST_JOB_LIST_TO_LINK_ASC = "Job.findAllContestJobListToLinkAsc";
    String FIND_ALL_CONTEST_JOB_LIST_TO_LINK_DESC = "Job.findAllContestJobListToLinkDesc";
    String FIND_ALL_CONTEST_JOB_LIST_TO_LINK_INT_ASC = "Job.findAllContestJobListToLinkIntAsc";
    String FIND_ALL_CONTEST_JOB_LIST_TO_LINK_INT_DESC = "Job.findAllContestJobListToLinkIntDesc";

    String FIND_CONTEST_JOB_LIST_TO_LINK_ASC = "Job.findContestJobListToLinkAsc";
    String FIND_CONTEST_JOB_LIST_TO_LINK_DESC = "Job.findContestJobListToLinkDesc";
    String FIND_CONTEST_JOB_LIST_TO_LINK_INT_ASC = "Job.findContestJobListToLinkIntAsc";
    String FIND_CONTEST_JOB_LIST_TO_LINK_INT_DESC = "Job.findContestJobListToLinkIntDesc";


    String FIND_ALL_JOB_LIST_TO_LINK_COUNT = "Job.findAllJobListToLinkCount";
    String FIND_ALL_JOB_LIST_FOR_CAMPAIGN_COUNT = "Job.findALLJobListForCampaignCount";

    String FIND_JOB_LIST_TO_LINK_COUNT = "Job.findJobListToLinkCount";
    String FIND_JOB_LIST_FOR_CAMPAIGN_COUNT = "Job.findJobListForCampaignCount";

    String FIND_ALL_CONTEST_JOB_LIST_TO_LINK_COUNT = "Job.findAllContestJobListToLinkCount";
    String FIND_ALL_CONTEST_JOB_LIST_FOR_CAMPAIGN_COUNT = "Job.findAllContestJobListForCampaignCount";

    String FIND_CONTEST_JOB_LIST_TO_LINK_COUNT = "Job.findContestJobListToLinkCount";
    String FIND_CONTEST_JOB_LIST_FOR_CAMPAIGN_COUNT = "Job.findContestJobListForCampaignCount";


    //String FIND_JOB_LIST_FOR_LOCATION_COUNT = "Job.findJobListForLocationCount";
    //String FIND_JOB_LIST_FOR_LOC_CAMP_COUNT = "Job.findJobListForLocAndCampCount";

    String FIND_CONTEST_JOB_LIST_FOR_CAMPAIGN = "Job.findContestJobListForCampaign";
    //String FIND_CONTEST_JOB_LIST_FOR_LOCATION = "Job.findContestJobListForLocation";
    //String FIND_CONTEST_JOB_LIST_FOR_LOC_CAMP = "Job.findContestJobListForLocAndCamp";
    String FIND_EMP_REWARDS_IN_PROCESS = "EmplReward.findEmpRewardsInProcess";
    String FIND_EMP_REWARDS_EARNED = "EmplReward.findEmpRewardsEarned";
    String FIND_JOBREWARD_AMT = "JobReward.findAmtReward";
    String FIND_JOBREWARD_AMT_JOBS = "JobReward.findAmtRewardJobs";
    String FIND_ALL_JOBREWARDS = "JobReward.findJobAllRewards";
    String FIND_ALL_JOBREWARDSCONFIG = "JobReward.findJobAllRewardsConfigs";

    //String FIND_CONTEST_JOB_LIST_FOR_LOCATION_COUNT = "Job.findContestJobListForLocationCount";
    //String FIND_CONTEST_JOB_LIST_FOR_LOC_CAMP_COUNT = "Job.findContestJobListForLocAndCampCount";

    String FETCH_BAND_N_REWARD = "JobRewardRule.findBandNRewardByCompany";
    String FETCH_REWARD_TYPE_MSTR_LANG = "RewardTypeMstrLang.findRewardTypeLangValues";
    String FETCH_RECRUITERSID_N_JOB = "UserProfile.findRecruitersIDByJobSeq";


    String FIND_EMPREFRL_COUNT = "EmplRefrl.findRefrlCount";
    String FIND_EMPREFRL_COUNT_ALL_ROUNDS = "EmplRefrl.findRefrlCountAllRounds";
    String FIND_EMPLREFRL_COUNT_ALL_ROUNDS_STATS = "EmplRefrl.findRefrlCountAllRoundsStats";
    //String FIND_EMP_REWARDS = "EmplReward.findRewards";
    String FIND_EMP_TOTAL_REWARD_QTY = "EmplReward.findEmployeeTotalRewardQty";
    String FIND_EMP_LEVEL_DETAILS = "EmplLevel.findEmployeeLevelDetails";
    String FIND_EMP_REWARD_WITH_LEVEL_DETAILS = "EmplReward.findEmpRewardWithLevelDetails";
    String FIND_EMP_INPROCESS_REWARDAMOUNT = "EmplRefrl.JobReward.findEmpRewardAmountInProcess";
    String FIND_CURRENCY_SYMBOL = "CompanyMstr.findCurrencySymbol";
    String FETCH_EMP_CURRENCY_REWARDS = "EmplReward.findEmployeeCurrencyRewardQty";
    String FETCH_ALL_EMPLREFRL_FOR_CANDIDATE_BY_EMPLREFRL_SEQ = "EmplRefrl.fetchAllEmplRefrlForCandidateByEmplRefrlSeq";



    String FIND_ALL_GOALS = "Goal.findAllGoals";
    String FIND_ALL_NOTCOMPLETEDGOALS_FOR_ACTIVITY = "GoalActivity.findAllNotCompletedGoalsForActivity";
    String FIND_ALL_EMP_GOALS_LANG = "EmplGoal.findAllGoalsLang";
    String FIND_ALL_EMP_GOALS = "EmplGoal.findAllGoals";
    String FIND_ALL_BADGES = "RewardBadge.findAllBadges";
    String FIND_ALL_BADGES_LANG = "RewardBadge.findAllBadgeslang";
    String FIND_ALL_EMP_BADGES = "EmplBadges.findAllBadges";
    String FIND_ALL_MEDALS = "RewardMedal.findAllMedals";
    String FIND_ALL_EMP_MEDALS = "EmplMedal.findAllMedals";
    String FIND_TOP_PLAYERS = "EmplReward.findTopPlayers";
    String FETCH_JOB_COUNT = "Job.fetchJobCount";
    String FETCH_JOB_COUNT_All_COMPANY = "Job.fetchJobCountAllCompany";
    String FETCH_JOB_SEARCH_COUNT = "Job.fetchJobSearchCount";
    String FETCH_JOB_SEARCH_COUNT_ALL_COMPANY = "Job.fetchJobSearchCountAllCompany";
    String FIND_EMPREFRL_DETAILS = "EmplRefrl.findRefrlDetails";
    String FIND_EMPLREFRL_DETAILS = "EmplRefrl.findEmpRefrlDetails";
    String FNID_ALL_EMPREFRL_DETAILS = "EmplRefrl.findAllEmpRefrlDetails";
    String FIND_ALL_EMPREFRL_DETAILS_WITH_INTERVIEWSTAGE = "EmplRefrl.findAllEmpRefrlDetailsWithInterviewStage";
    String FIND_EMPREFRL_NETSTAT = "EmplRefrl.findRefrlNetStat";
    String FIND_EMP_BY_USERID = "EmployeeMstr.findEmployeeByUserID";
    String FIND_EMP_BY_USERIDAI = "EmployeeMstr.findEmployeeByUserIDAI";
    String FIND_EMP_BY_USER_LOGIN_ID = "EmployeeMstr.findEmpByUserLoginID";
    String FIND_EMP_COUNT = "EmployeeMstr.findEmployeeCount";
    String FIND_ALL_EMPLOYEE_DISPLAYLIST = "EmployeeMstr.findAllEmployeeDisplayList";
    String FIND_RECRUITER_DISPLAYLIST = "EmployeeMstr.findRecruiterDisplayList";
    String FIND_RECRUITER_LIST = "EmployeeMstr.findRecruiterList";
    String FIND_EMPLOYEE_LIST = "EmployeeMstr.findEmployeeList";
    String FIND_EMPLOYEE_DISPLAYLIST = "EmployeeMstr.findEmployeeDisplayList";
    String FIND_EMP_USERPROFILE_BYEMAIL = "EmployeeMstr.findUserProfileByEmail";
    String FIND_USER_BY_USERID_COMPANY = "UserProfile.findUserByUserIDCompany";
    String FETCH_EMPLOYEE_BY_COMPANY_EMPLOYEE_ID = "EmployeeMstr.fetchEmployeeByCompanyEmployeeID";
    String FIND_EMP_USERPROFILE_BYEMAILADDRESS = "EmployeeMstr.findUserProfileByEmailAdress";
    String FIND_EMP_USERPROFILE_BYEMAILADDRESS_AI = "EmployeeMstr.findUserProfileByEmailAddressAI";
    String COUNT_EMPLOYEE_BY_COMPANY_EMPLOYEE_ID = "EmployeeMstr.countEmployeeByCompanyEmployeeID";
    String FIND_EMPLOYEE_BY_COMPANY_AND_EMAIL = "EmployeeMstr.findEmployeeByCompanyAndEmailAdress";
    String FIND_EMPLOYEE_BY_COMPANY_AND_EMAIL_AI = "EmployeeMstr.findEmployeeByCompanyAndEmailAdressAI";
    String FIND_ALL_EMPLOYEE_BY_COMPANY_AND_EMAIL = "EmployeeMstr.findAllEmployeeByCompanyAndEmailAdress";
    //todo
    String FIND_ALL_EMPLOYEE_BY_COMPANY_AND_EMAIL_AND_PROFILE_SEQ = "EmployeeMstr.findAllEmployeeByCompanyAndEmailAdressAndProfileSeq";

    String FIND_ALL_CAMPAIGNS = "Campaign.findAllCampaigns";
    String FIND_OTHER_CAMPAIGNS = "Campaign.findOtherCampaigns";
    String FIND_ALL_CAMPAIGN_JOBS_ASC = "CampaignJob.findCampaignJobsASC";
    String FIND_ALL_CAMPAIGN_JOBS_ASC_INT = "CampaignJob.findCampaignJobsIntASC";
    String FIND_ALL_CAMPAIGN_JOBS_DESC = "CampaignJob.findCampaignJobsDESC";
    String FIND_ALL_CAMPAIGN_JOBS_DESC_INT = "CampaignJob.findCampaignJobsIntDESC";
    String FIND_ALL_JOBS_IN_CAMPAIGN = "CampaignJob.findAllJobsInCampaign";
    String FIND_CAMPAIGN_JOBS_ACS = "CampaignJob.findCampaignJobsFilterASC";
    String FIND_CAMPAIGN_JOBS_DESC = "CampaignJob.findCampaignJobsFilterDESC";
    String FIND_CAMPAIGN_JOBS_FILTER_COUNT = "CampaignJob.findCampaignJobsFilterCount";
    String FIND_RECRUITER_JOBS_ACS = "JobRecruiter.findRecruiterJobsFilterASC";
    String FIND_RECRUITER_JOBS_DESC = "JobRecruiter.findRecruiterJobsFilterDESC";
    String FIND_ALL_RECRUITER_JOBS_ACS = "JobRecruiter.findRecruiterAllJobsFilterASC";
    String FIND_ALL_RECRUITER_JOBS_DESC = "JobRecruiter.findRecruiterAllJobsFilterDESC";
    String FIND_RECRUITER_JOBS_COUNT = "JobRecruiter.findRecruiterJobsFilterCount";
    String FIND_RECRUITER_ALL_JOBS_COUNT = "JobRecruiter.findRecruiterAllJobsFilterCount";
    String FIND_ALL_CAMPAIGN_JOBS_STATUS = "CampaignJob.findCampaignJobsStatus";
    String FIND_ALL_CAMPAIGN_JOBS_COUNT = "CampaignJob.findCampaignJobsCount";
    String FIND_ALL_CAMPAIGN_ACTIVE_JOBS = "CampaignJob.findCampaignActiveJobs";
    String FIND_SELECTED_CAMPAIGN_JOBS = "CampaignJob.findSelectedCampaignJobs";
    String FIND_ALL_CONTESTS = "Contest.findAllContests";
    String FIND_ALL_CONTEST_JOBS = "ContestJob.findContestJobs";
    String FIND_ALL_CONTEST_JOB = "ContestJob.findContestJob";
    String FIND_ALL_JOBS_FORCONTEST = "ContestJob.findAllJobsForContest";
    String FIND_SELECTED_CONTEST_JOBS = "ContestJob.findSelectedContestJobs";
    String FIND_REVIEW_JOBS_ACS = "JobReview.findJobsReviewFilterASC";
    String FIND_REVIEW_JOBS_DESC = "JobReview.findJobsReviewFilterDESC";
    String FIND_ALL_REVIEW_JOBS_COUNT = "JobReview.findAllReviewJobsFilterCount";
    String FIND_REVIEW_JOBS_COUNT = "JobReview.findReviewJobsFilterCount";
    String FIND_RECRUITER_ALL_JOBS_REQUEST_COUNT = "JobRecruiter.findRecruiterAllJobsRequestFilterCount";
    String FIND_RECRUITER_JOBS_REQUEST_DESC = "JobRecruiter.findRecruiterJobsRequestFilterDESC";
    String FIND_RECRUITER_JOBS_REQUEST_ACS = "JobRecruiter.findRecruiterJobsRequestFilterASC";
    String FIND_ALL_RECRUITER_JOBS_REQUEST_DESC = "JobRecruiter.findRecruiterAllJobsRequestFilterDESC";
    String FIND_ALL_RECRUITER_JOBS_REQUEST_ACS = "JobRecruiter.findRecruiterAllJobsRequestFilterASC";
    String FIND_RECRUITER_JOBS_REQUEST_COUNT = "JobRecruiter.findRecruiterJobsRequestFilterCount";



    String FIND_CAMPAIGN_JOB_REFRLSTATUS_COUNT = "EmplRefrl.findCampaignJobRefrlStatusCount";
    String FIND_ALL_CAMPAIGN_JOB_REFRLSTATUS_COUNT = "EmplRefrl.findAllCampaignJobRefrlStatusCount";
    String FIND_ALL_CAMPAIGN_JOB_ALL_REFRLSTATUS_COUNT = "EmplRefrl.findAllCampaignJobAllRefrlStatusCount";
    String FIND_CAMPAIGN_JOB_ALL_REFRLSTATUS_COUNT = "EmplRefrl.findCampaignJobAllRefrlStatusCount";
    String FIND_ALL_CAMPAIGN_JOB_INTERVIEW_STAGE_COUNT = "EmplRefrl.findAllCampaignJobInterviewStageCount";
    String FIND_CAMPAIGN_JOB_INTERVIEW_STAGE_COUNT = "EmplRefrl.findCampaignJobInterviewStageCount";
    String FIND_CONTEST_JOB_REFRL_COUNT = "EmplRefrl.findContestJobRefrlCount";
    String FIND_CONTEST_JOB_INTERVIEW_STAGE_COUNT = "EmplRefrl.findContestJobInterviewStageCount";
    String FIND_INTERVIEW_STAGE_ROUNDS = "InterviewStageMstr.findInterviewStageRounds";
    String FIND_CANDIDATE_SOURCES = "CandidateSources.findSources";
    String FIND_INTERVIEW_STAGE_ROUND_TITLES = "InterviewStageMstr.findInterviewStageRoundTitles";
    String FIND_GOAL_POINTS = "Reward.findGoalsPoints";
    String FIND_EMPREFRL_FOR_JOB = "EmplRefrl.findRefrlsForJob";
    String FIND_ALL_ACTIVECONTESTS = "Contest.findAllActiveContests";
    String FIND_OTHER_CONTESTS = "Contest.findOtherContests";
    String FIND_ALL_CLOSEDCONTESTS = "Contest.findAllClosedContests";
    String FIND_CONTEST_BY_CONTESTBYID = "Contest.findContestByContestID";
    String FIND_CAMPAIGN_EMPLOYEE_PARTICIPATION = "EmplRefrl.findCampaignEmployeeParticipation";
    String FIND_ALL_CAMPAIGN_RECRUITERS = "CampaignRecruiter.findAllCampaignRecuiters";
    String FIND_CAMPAIGN = "Campaign.findCampaign";
    String FIND_DEFAULT_CAMPAIGN = "Campaign.findDefaultCampaign";
    String FIND_CONTEST_EMPLOYEE_PARTICIPATION = "EmplRefrl.findContestEmployeeParticipation";
    String FIND_ALL_CONTEST_RECRUITERS = "ContestRecruiter.findAllContestRecuiters";

    String FIND_CONTEST = "Contest.findContest";
    String FETCH_EMAIL_CONFIG = "email.findEmailConfig";
    String FETCH_ALL_COMPANIES_WITH_EMAIL_CONFIG = "email.findAllCompaniesWithEmailConfig";
    String FIND_ALL_RECRUITER_CAMPAIGNS = "CampaignRecruiter.findAllRecuiterCampaigns";
    String FIND_USER_PROFILE_BY_ID = "UserProfile.findUserProfileById";
    String FIND_ALL_USER_PROFILE_BY_ID = "UserProfile.findAllUserProfileById";
    String FIND_USER_PROFILE_BY_ID_AND_EMAIL = "UserProfile.findUserProfileByIdAndEmail";
    String FIND_USER_PROFILE_BY_ID_AND_COMPANY = "UserProfile.findUserProfileByIdAndCompany";
    String FIND_CAMPAIGNS = "Campaign.findCampaigns";
    String FETCH_CONTEST_JOBS_COUNT = "ContestJob.fetchContestJobCount";
    String FETCH_CLOSED_CONTEST_JOBS_COUNT = "ContestJob.fetchClosedContestJobCount";
    String FETCH_POSITIONS_CLOSED_CONTEST_JOB_COUNT = "EmplRefrl.fetchContestJobsPositionClosedRefrlCount";
    String FETCH_CONTEST_JOBS_REFERRED_COUNT = "EmplRefrl.fetchContestJobsReferredRefrlCount";
    String FETCH_PARTICIPATION_CONTEST_JOB_COUNT = "EmplRefrl.fetchTotalContestParticipationCount";
    String FIND_CANDIDATE_DETAILS = "Candidate.findCandidateDetails";
    String FIND_EMPL_REFRL_DETAILS = "EmplRefrl.findEmplRefrlDetails";
    String FIND_JOB_DETAILS = "Job.findJobDetails";
    String FIND_JOBS_LOCATION_DETAILS = "Job.findJobsLocationsDetails";
    String FIND_JOBS_TITLE = "Job.findJobTitle";
    String FIND_JOBS_ON_TITLE = "Job.findJobOnTitle";
    String FIND_JOB_BY_TITLE = "Job.findJobByTitle";
    String FETCH_JOB_ELIGIBLE_FOR_CONTEST = null;
    String FIND_JOB_VIEWS = "JobViews.findJobViews";

    String FETCH_JOB_REWARD_TYPE = "JobRewardType.fetchRewardTypeByParentCompany";
    String FETCH_JOB_REWARD_CONFIG_VALUES = "JobRewardPolicy.fetchRewardConfigValuesByParentCompany";

    String FIND_ACTIVITYSTAGE_REWARDS = "ActivitystageReward.findAcivityRewards";
    String FIND_GOAL_ACTIVITY = "Activity.findGoalActivity";
    String FIND_ALL_EMPL_GOAL_ACTIVITY_COUNT = "EmplActivity.findAllEmplGoalActivityCount";
    String FIND_EMPL_ACTIVITY_COUNT = "EmplActivity.findActivityCount";
    String FETCH_ACTIVITIES_REWARDED = "EmpActivity.findActivitiesRewardedToday";

    String FIND_ALL_CAMPAIGN_JOBSEQ = "CampaignJob.findCampaignJobSeq";
    String FIND_ALL_CAMPAIGN_FROM_JOBSEQ = "CampaignJob.findCampaignFromJobSeq";
    String FIND_ALL_CAMPAIGN_JOB_COUNT = "CampaignJob.findAllCampaignJobCount";
    String FIND_ALL_CONTEST_JOB_COUNT = "ContestJob.findAllContestJobCount";
    String FIND_CAMPAIGN_SEQ_FROM_JOBSEQ = "CampaignJob.findCampaignSeqFromJobSeq";
    String FIND_CONTEST_SEQ_FROM_JOB_SEQ = "ContestJob.findContestSeqFromJobSeq";
    String FIND_CAMPAIGN_JOB = "CampaignJob.findCampaignJob";
    String FIND_ALL_CAMPAIGN_CLOSEDJOBCOUNT = "CampaignJob.findCampaignClosedJobCount";
    String FIND_CAMPAIGN_LIST_CLOSEDJOBCOUNT = "CampaignJob.findCampaignListClosedJobCount";
    String FIND_CAMPAIGN_LIST_JOB_COUNT_BY_STATUS = "CampaignJob.findCampaignListJobCountByStatus";
    String FIND_CAMPAIGN_JOB_COUNT_BY_STATUS = "CampaignJob.findCampaignJobCountByStatus";
    String FIND_CONTEST_LIST_CLOSEDJOBCOUNT = "ContestJob.findContestListClosedJobCount";
    String FIND_ALL_CAMPAIGN_FROM_CAMPAIGN_SEQ = "Campaign.findAllCampaignFromCampaignSeq";
    String FIND_ALL_CAMPAIGN_CANDIDATECLICKS = "EmplRefrl.findCampaignCandidateClicks";
    String FIND_CAMPAIGN_CANDIDATE_CLICK_STATS = "EmpRefrl.findCampaignCandidateClickStats";
    String FIND_CAMPAIGN_RESPONDED_CANDIDATE_STATS = "EmpRefrl.findCampaignRespondedCandidateStats";
    String FIND_COMPANY_CANDIDATE_SOURCE_STAT = "EmpRefrl.findCompanyCandidateSourceStat";
    String FIND_CONTEST_JOB_REFRL_OFFERED_HIRED_COUNT = "";
    String FIND_CAMPAIGN_ACTIVE_JOBS_COUNT = "CampaignJob.findCampaignJobsCount";
    String FIND_CAMPAIGN_LIST = "Campaign.findCampaignList";

    String FIND_JOB_REWARD_BY_COMPANY_SEQ = "JobReward.FindJobRewardByCompanySeq";
    String FIND_REWARD_TYPE_LOCAL_DESC = "Reward.FindRewardTypeLocalDescByRewardSeq";
    String FIND_EMP_INPROCESS_REWARDAMOUNT_BAND = "EmplRefrl.JobReward.findEmpRewardAmountInProcessBand";
    String FIND_EMP_INPROCESS_REWARDAMOUNT_BAND_OTHERS = "EmplRefrl.JobReward.findEmpRewardAmountInProcessBandOther";


    String FIND_PASSWORD_BY_ID = "UserProfile.findPasswordByUserID";
    String FIND_USER_PROFILE_BY_TOKEN = "UserProfile.findUserProfileByToken";


    String FIND_ALL_CANDIDATES_COUNT_PER_ROUND = "EmplRefrl.FindAllCandidateCountPerRound";
    String FIND_ALL_CANDIDATES_COUNT_IN_ROUND12345 = "EmplRefrl.FindAllCandidateCountPerRound12345";
    String FIND_ALL_CANDIDATES_CLICKS_PER_COMPANY = "EmplRefrl.FindAllCandidateClicksPerCompany";
    String FIND_ALL_EMPLOYEE_LOGINS_PER_COMPANY = "LoginHistory.FindTotalEmployeeLoginsPerCompany";
    String FIND_ALL_EMPLOYEE_PARTICIPATED_PER_COMPANY = "UserProfile.FindTotalEmployeeParticipatedPerCompany";

    String FETCH_ALL_APPLIED_CANDIDATE_IDS = "EmplRefrl.FetchAllAppliedCandiadateIds";
    String FETCH_ALL_NOT_REJECTED_CANDIDATE_IDS = "EmplRefrl.FetchAllNotRejecteCandiadateIds";
    String FETCH_ALL_REJECTED_CANDIDATE_IDS = "EmplRefrl.FetchAllRejecteCandiadateIds";
    //Common Master Data Fetch Queries

    String FIND_VENDOR_COUNT = "VendorMstr.findAllVendorCount";
    String FIND_VENDOR_COUNT_BY_STATUS = "VendorMstr.findAllVendorCountByStatus";
    String FIND_EXISTING_VENDOR = "VendorMstr.findVendorId";

    String FIND_VENDOR_USERPROFILESEQ = "VendorMstr.findVendorUserProfileSeq";
    String FIND_VENDOR_USERPROFILESEQ_UPDATEBY = "VendorMstr.findVendorUserProfileSeqUpdateBy";

    String FIND_REFRLSTATUS_BYREFRLCODE = "RefrlStatusMstr.findRefrlStatusMstrByCd";
    String FIND_REFRLSTATUS_SEQ_CD_BY_COMPANY = "RefrlStatusMstr.findRefrlStatusMstrSeqCdByCompanyID";
    String FETCH_COMPANY_DETAILS = "CompanyMstr.fetchCompanyDetailsBySeq";
    String FETCH_COMPANY_INFO_BY_COMPANY_MSTR_SEQ = "CompanyInfo.fetchCompanyInfoByCompanyMstrSeq";

    String FETCH_COMPANY_CONFIG = "CompanyConfig.fetchConfigDetailsByCompany";
    String FETCH_COMPANY_CONFIGS_ALL_COS = "CompanyConfig.fetchConfigDetailAllCompanies";
    String FIND_ALL_CONTEST_CLOSEDJOBCOUNT = "ContestJob.findContestClosedJobCount";
    String FIND_ALL_CONTEST_FROM_CONTEST_SEQ = "Contest.findAllContestFromContestSeq";
    String FIND_ALL_CONTEST_JOBSEQ = "ContestJob.findContestJobSeq";
    String FIND_ALL_JOBSEQ_OF_CONTEST = "ContestJob.findAllJobSeqOfContest";
    String FIND_REFRL_CHANNEL_TITLE = "RefrlChannelMstr.findRefrlChannelMstrDesc";
    String FIND_ALL_RELATIONSHIP = "RelationshipMstr.findRelationshipMstr";

    String FIND_CONTEST_JOB = "ContestJob.findContestJob";
    String FIND_CONTEST_JOB_REFRLSTATUS_COUNT = "EmplRefrl.findContestJobRefrlStatusCount";
    String FIND_CONTEST_JOB_ALL_REFRLSTATUS_COUNT = "EmplRefrl.findContestJobAllRefrlStatusCount";
    String FIND_CONTEST_CANDIDATE_CLICK_STATS = "EmpRefrl.findContestCandidateClickStats";
    String FIND_CONTEST_RESPONDED_CANDIDATE_STATS = "EmpRefrl.findContestRespondedCandidateStats";
    String FIND_ALL_CONTEST_CANDIDATECLICKS = "EmplRefrl.findContestCandidateClicks";

    String FIND_ALL_FB_FRIENDS = "FbUserNetwork.findFriendProfiles";
    String FIND_FB_FRIENDS_BY_ID = "FbUserNetwork.findFriendProfileById";
    String FIND_FB_FRIENDS_BY_NAME = "FbUserNetwork.findFriendProfileByName";

    String FIND_ALL_RECRUITER_JOBS = "JobRecruiter.findRecruiterJobs";
    String FIND_ALL_RECRUITER_ALL_JOBS = "JobRecruiter.findRecruiterAllJobs";
    String FETCH_RECRUITER_CLOSED_JOBS_COUNT = "JobRecruiter.findRecruiterClosedJobCount";
    String FETCH_RECRUITER_ALL_CLOSED_JOBS_COUNT = "Job.findRecruiterAllClosedJobCount";
    String FETCH_RECRUITER_TOTAL_JOBS_COUNT = "JobRecruiter.findRecruiterJobCount";
    String FIND_ALL_RECRUITER_EMP_REFRLS = "EmplRefrl.findRecruiterEmpRefrls";
    String GET_CANDIDATES_LISTING = "EmplRefrl.getCandidateListing";
    String FIND_RECRUITER_CONTEST_EMP_REFRLS = "EmplRefrl.findContestRecruiterEmpRefrls";
    String FIND_ALL_RECRUITER_EMP_REFRLS_BY_REFRL_STATUS_CD = "EmplRefrl.findRecruiterEmpRefrlsByRefrlStatusCd";
    String FIND_RECRUITER_CONTEST_EMP_REFRLS_BY_REFRL_STATUS_CD = "EmplRefrl.findContestRecruiterEmpRefrlsByRefrlStatusCd";

    String FIND_REFRL_CHANNEL_BY_CODE = "RefrlChannelMstr.findRefrlChannelMstrByCd";
    String FIND_REFRL_CHANNEL_BY_SEQ = "RefrlChannelMstr.findRefrlChannelMstrBySeq";
    String FIND_REFRL_CHANNEL_BY_SEQ_MULTI_COMPANY = "RefrlChannelMstr.findRefrlChannelMstrBySeqMultiCompany";
    String FIND_CANDIDATE_INTERVIEW_DETAILS = "InterviewDetails.findCandidateInterviewDetails";
    String FIND_INTERVIEW_DETAILS_BY_RHID_AND_JOB_SEQ = "InterviewDetails.findInterviewDetailsByRHIDandJobSeq";
    String FIND_CANDIDATE_INTERVIEW_COMMENTS = "InterviewComments.findCandidateInterviewComments";
    String FIND_CANDIDATE_ROUND_INTERVIEWERS = "Interviewer.findCandidateRoundInterviewers";
    String FIND_CANDIDATE_ROUND_INTERVIEWERS_FOR_NON_EXIST_EMP = "Interviewer.findCandidateRoundInterviewersForNonExistEmp";
    String FIND_CANDIDATE_ROUND_INTERVIEWER_TOKEN_BY_EMAIL = "Interviewer.findCandidateRoundInterviewersTokenByEmail";
    String FIND_CANDIDATE_ROUND_INTERVIEWER_TOKEN_NON_EXISTING_EMP = "Interviewer.findCandidateRoundInterviewersTokenByEmailNonExisiting";
    String FIND_CANDIDATE_ALL_ROUNDS_INTERVIEWERS = "Interviewer.findCandidateAllRoundsInterviewers";
    String FIND_CANDIDATE_ROUND_INTERVIEWER_EMAILS = "Interviewer.findCandidateRoundInterviewerEmails";
    String FIND_CANDIDATE_ROUND_INTERVIEWER_EMAILS_NON_EXISTING_EMP = "Interviewer.findCandidateRoundInterviewerEmailsForNonExistingEmp";
    String FIND_CANDIDATE_INTERVIEW_DETAIL_SEQ = "InterviewDetails.findCandidateInterviewDetailSeq";
    String FIND_CURRENT_ROUND_INTERVIEW_DETAILS = "InterviewDetails.findCurrentRoundInterviewDetails";
    String FIND_RECENT_INTERVIEW_STAGE_MSTR_BY_ROUND_CODE = "InterviewDetails.findRecentInterviewStageMstrByRoundCode";
    String FIND_RECENT_INTERVIEW_DETAILS_BY_ROUND_CODE = "InterviewDetails.findRecentInterviewDetailsByRoundCode";
    String FIND_CANDIDATE_INTERVIEW_SKILL_RATING = "InterviewSkillRating.findCandidateInterviewSkillRating";
    String FIND_REFERRAL_CHANNEL_NAME = "RefrlChannelMstr.findReferralChannelName";
    String FIND_LOCATIONLIST = "LocationMstr.findlocationlist";
    String FIND_LOCATION_BYCITY = "LocationMstr.findLocationByCity";

    String FIND_VENDOR_BYID = "VendorMstr.findVendorById";
    String FIND_ALL_VENDOR_BYID = "VendorMstr.findAllVendorById";
    String FIND_VENDOR_BYMSTRSEQ = "VendorMstr.findVendorByMstrSeq";
    String FIND_ALL_LOCATIONS = "LocationMstr.findAllLocations";
    String Find_Parent_Company_Config = "ParentCompany.findConfigByCompanySeq";
    String FIND_REWARD_TYPE_CODE = "RewardTypeMstr.findRewardTypeCdByRewardSeq";
    String FIND_RUPEE_VALUE = "Currency.FindRupeeValueByCompanySeq";
    String FIND_BATCH_PROCESS_LOG_BYNAME = "BatchProcessLog.FindBatchProcessLogByName";
    String FIND_VENDOR_CATERGORY_BYSEQ = "VendorCategory.findVendorCategoryBySeq";
    String FETCH_JOB_CHANNEL_BY_JOB_AND_CHANNEL = "JobChannelMstr.fetchJobChannelMstrByJobSeqAndChannel";

    String FETCH_CAMPAIGNJOBS_BY_JOBSEQ = "CampaignJobs.findCampaignJobsByJobSeq";

    String FIND_REPORT_LOCATIONLIST = "LocationMstrLang.findAllLocations";

    //Reward Queries
    String FIND_ACTIVITYREWARDS = "Reward.findActivityRewards";
    String FIND_ACTIVITYREWARDS_BY_CD = "Reward.findActivityRewardsByCd";
    String FIND_GOALREWARDS = "GoalReward.findGoalRewards";
    String FIND_EMPL_LEVEL = "EmplLevel.findEmplLevel";
    String FIND_ALL_CONTESTREWARDS = "ContestReward.findAllContestRewards";
    String FIND_LEVEL_REWARDS = "LevelReward.findLevelRewards";
    String FIND_GOAL_REWARD_LIST = "GoalReward.findGoalRewardList";
    String FIND_EMP_REWARDS = "EmplReward.findDistEmplReward";
    String FIND_USER_PROFILE_BY_SEQ = "UserProfile.FindUserProfileBySeq";
    String USER_LOCATION_REWARD = "Reward.FindRewardForUserLocation";
    String FIND_CURRENCY_SYMBOL_COMPANY = "CompanyMstr.findCurrencySymbolByCompany";
    String FIND_REWARDAMT_JOB = "JobReward.findAmtRewardForJob";
    String FIND_REWARDAMT_JOBS = "JobReward.findAmtRewardForJobs";
    String FIND_REWARDAMT_COMPANY = "JobReward.findAmtRewardCompany";
    String JOB_LOCATION_REWARD = "Reward.FindRewardForJobLocation";
    String FIND_REWARDAMT_CONFIG_COMPANY = "JobReward.findRewardAmtConfigCompany";
    //employee performance queries
    String FIND_TOPPLAYER = "EmplLevel.findTopPlayer";
    String FIND_APP_TOPPLAYER = "EmplLevel.findAppTopPlayer";
    String FIND_CANDIDATE_INTERVIEW_STAGE_MSTR_SEQ = "EmplRefrl.findCandidateInterviewStageMstrSeq";

    String FIND_ELIMINATED_WINNERS_BY_REFERRAL = "ContestWinner.findEliminatedWinnersByReferral";
    String FIND_ELIMINATED_WINNERS_BY_HIRE = "ContestWinner.findEliminatedWinnersByHire";
    String FIND_EMPL_REFRL = "EmplRefrl.findEmplRefrl";
    String FIND_RECRUITER_CANDIDATE_INTERVIEW_STAGE_COUNT = "EmplRefrl.findRecruiterCandidateInterviewStageCount";
    String FIND_RECRUITER_CANDIDATE_INTERVIEW_STAGE_COUNT_BY_JOB = "EmplRefrl.findRecruiterCandidateInterviewStageCountByJob";
    String FIND_RECRUITER_CANDIDATE_INTERVIEW_STAGE_COUNT_BY_CAMPAIGN_SEQ_JOB_SEQ = "EmplRefrl.findRecruiterCandidateInterviewStageCountByCampaignSeqJobSeq";
    String FIND_RECRUITER_CANDIDATE_INTERVIEW_STAGE_COUNT_BY_CONTEST_SEQ = "EmplRefrl.findRecruiterCandidateInterviewStageCountByContestSeq";
    String FIND_RECRUITER_CANDIDATE_INTERVIEW_STAGE_COUNT_BY_CONTEST_SEQ_JOB_SEQ = "EmplRefrl.findRecruiterCandidateInterviewStageCountByContestSeqJobSeq";
    String FIND_RECRUITER_CANDIDATE_REFRL_STATUS_COUNT = "EmplRefrl.findRecruiterCandidateRefrlStatusCount";
    String FIND_RECRUITER_CANDIDATE_REFRL_STATUS_COUNT_BY_JOB = "EmplRefrl.findRecruiterCandidateRefrlStatusCountByJob";
    String FIND_RECRUITER_CANDIDATE_REFRL_STATUS_COUNT_BY_CAMAPIGN_SEQ_JOB_SEQ = "EmplRefrl.findRecruiterCandidateRefrlStatusCountByCampaignSeqJobSeq";
    String FIND_RECRUITER_CANDIDATE_REFRL_STATUS_COUNT_BY_CONTEST_SEQ = "EmplRefrl.findRecruiterCandidateRefrlStatusCountByContestSeq";
    String FIND_RECRUITER_CANDIDATE_REFRL_STATUS_COUNT_BY_CONTEST_SEQ_JOB_SEQ = "EmplRefrl.findRecruiterCandidateRefrlStatusCountByContestSeqJobSeq";
    String FIND_RECRUITER_CANDIDATE_REFRL_STATUS_COUNT_BY_CAMPAIGN_SEQ = "EmplRefrl.findRecruiterCandidateRefrlStatusCountByCampaignSeq";
    String FIND_RECRUITER_CANDIDATE_INTERVIEW_STAGE_COUNT_BY_CAMPAIGN_SEQ = "EmplRefrl.findRecruiterCandidateInterviewStageCountByCampaignSeq";
    String FIND_RECRUITER_EMPL_REFRL_SEQ = "EmplRefrl.findRecruiterEmpRefrlSeq";
    String FIND_RECRUITER_CONTEST_EMPL_REFRL_SEQ = "EmplRefrl.findRecruiterContestEmpRefrlSeq";

    String REWARD_CRITERIA_CD = "rewardCriteriaCd";
    String REWARD_SEQ = "rewardSeq";

    String GET_CONTEST_WINNERS_BY_TYPE = "ContestWinner.getContestWinnersByType";
    String DETERMINE_CONTEST_WINNERS = "ContestWinner.determineContestWinners";

    String GET_CONTEST_REWARDS = "ContestReward.getContestRewards";
    String FIND_EMPLOYEE_CONTEST_PARTICIPATION = "EmplRefrl.findEmployeeContestParticipation";
    String FIND_ALL_EMPLOYEE_EMAIL = "EmployeeMstr.findAllEmployeeEmail";
    String FIND_ALL_EMPLOYEE_PHONE = "EmployeeMstr.findAllEmployeePhone";
    String FIND_ALL_USER_DETAILS = "EmployeeMstr.findAllUserDetails";
    String FIND_USER_SEARCH_RESULT_COUNT = "EmployeeMstr.findUserSearchResultCount";
    String EMPLOYEE_MSTR_COUNT = "EmployeeMstr.getCount";
    String FIND_ALL_USERS_COUNT = "EmployeeMstr.findAllUsersCount";
    String FETCH_ALL_EMPLOYEE_DETAILS = "EmployeeMstr.fetchAllEmployeeDetails";

    String FIND_EMPLOYEES_BY_EMAIL_AND_COMPANY = "EmployeeMstr.findEmployeesByEmailAndCompany";

    String FIND_ALL_FRAUD_COUNT = "FraudChecklist.findAllFraudCount";
    String FIND_ALL_FRAUD_DETAILS = "FraudChecklist.findAllFraudDetails";
    String FIND_ALL_FRAUD_BY_KEYWORDS = "FraudChecklist.findAllFraudByKeywords";

    String FIND_ALL_RECRUITER_EMAIL = "EmployeeMstr.findAllRecruiterEmail";
    String FIND_ALL_INTERVIEWER_EMAIL = "EmployeeMstr.findAllInterviewerEmail";
    String FIND_EMPLOYEES_EMAIL = "EmployeeMstr.findEmployeesEmail";
    String FIND_INTERVIEWER = "Interviewer.findInterviewer";
    String FIND_INTERVIEWER_BY_TOKEN_AND_DETAIL_SEQ = "Interviewer.findInterviewerByTokenAndInterviewDetailSeq";
    String FIND_REVIEW_INTERVIEWER_BY_INTERVIEW_SEQ = "Interviewer.findReviewInterviewerByInterviewSeq";
    String FIND_INTERVIEWER_BY_USER_PROFILE_SEQ_AND_INTERVIEW = "Interviewer.findInterviewerByUserprofileAndInterview";

    String FIND_ALL_UNINTERVIEWED_INTERVIEW_DETAILS_SEQ = "Interviewer.findAllUnInterviewedInterviewDetailsSeq";
    String FIND_ALL_INTERVIEWED_INTERVIEW_DETAILS_SEQ = "Interviewer.findAllInterviewedInterviewDetailsSeq";
    String FIND_ALL_INTERVIEW_DETAILS_OF_INTERVIEWER = "Interviewer.findAllInterviewDetailsOfInterviewer";
    String FIND_INTERVIEWER_EMPL_REFRLS = "InterviewDetails.findInterviewerEmplRefrls";
    String FIND_CONTEST_WINNER = "ContestWinner.findContestWinner";

    String FIND_ACTIVITY_LIMIT_PERDAY = "ActivityMstr.findActivityLimitPerDay";
    String FIND_ACTIVITY_LIMIT_PERJOB_PERDAY = "ActivityMstr.findActivityLimitPerJobPerDay";
    String FIND_ACTIVITY_DETAILS_BYCODE = "ActivityMstr.findActivityByCode";
    String FIND_ACTIVE_CONTESTJOB_FOR_JOB = "ContestJob.findActiveContestJobForJob";
    String FIND_ALL_ACTIVITY_MSTR_OF_COMPANY = "ActivityMstr.findAllActivityMstrOfCompany";
    String FIND_ALL_USER_ROLE_OF_COMPANY = "UserRole.findAllUserRoleOfCompany";

    String FIND_REWARDBADGE = "RewardBadge.findRewardBadge";

    String FIND_EMPLOYEE_BY_EMAIL_ID = "EmployeeMstr.findEmployeeByEmailID";
    String FIND_TOP_PLAYERS_IN_CATEGORY = "EmplReward.findTopPlayersInCategory";
    String FIND_CAMPAIGN_TOP_PLAYERS = "EmplReward.findCampaignTopPlayers";
    String FIND_CONTEST_TOP_PLAYERS = "EmplReward.findContestTopPlayers";
    String FIND_CAMPAIGN_TOTAL_BADGES = "EmplReward.findCampaignTotalBadges";
    String FIND_CONTEST_TOTAL_BADGES = "EmplReward.findContestTotalBadges";
    String FIND_CAMPAIGN_TOTAL_POINTS = "EmplReward.findCampaignTotalPoints";
    String FIND_CONTEST_TOTAL_POINTS = "EmplReward.findContestTotalPoints";
    String FIND_CAMPAIGN_TOTAL_REWARDS = "EmplReward.findCampaignTotalRewards";
    String FETCH_TOP_PLAYERS = "EmplReward.fetchTopPlayers";
    String FETCH_OVERALL_TOP_PLAYERS = "EmplReward.findOverallTopPlayers";
    String FETCH_TOP_PLAYERS_IN_RANGE = "EmplReward.findTopPlayersInRange";

    String FIND_CANDIDATE_BY_EMAIL_ADDR = "Candidate.findCandidateByEmailAddr";
    String FIND_RECRUITER_CAMPAIGN_SEQ = "CampaignJob.findRecruiterCampaignSeq";
    String FIND_RECRUITER_CONTEST_SEQ = "ContestJob.findRecruiterContestSeq";
    String FIND_RECRUITER_CONTEST = "ContestRecruiter.findRecuiterContest";
    String FIND_RECRUITER_ALL_CONTEST = "ContestRecruiter.findRecuiterAllContest";
    String FIND_CONTEST_LIST = "Contest.findContestList";
    String FIND_RECRUITER_CAMPAIGN = "CampaignRecruiter.findRecuiterCampaign";
    String FIND_RECRUITER_ALL_CAMPAIGN = "CampaignRecruiter.findAllRecuiterCampaign";
    String FIND_RECRUITER_ALL_CAMPAIGN_SUGGEST = "Recruiter.findAllCampaignSuggest";
    String FIND_RECRUITER_CAMPAIGN_SUGGEST = "CampaignRecruiter.findRecuiterCampaignSuggest";
    String FIND_RECRUITER_CAMPAIGN_PAGINATED = "CampaignRecruiter.findRecuiterCampaignPaginated";
    String FIND_RECRUITER_CAMPAIGN_PAGINATED_ASC = "CampaignRecruiter.findRecuiterCampaignPaginatedAsc";
    String FIND_RECRUITER_CAMPAIGN_PAGINATED_COUNT = "CampaignRecruiter.findRecuiterCampaignPaginatedCount";
    String FIND_RECRUITER_ALL_CAMPAIGN_PAGINATED = "CampaignRecruiter.findRecuiterAllCampaignPaginated";
    String FIND_RECRUITER_ALL_CAMPAIGN_PAGINATED_ASC = "CampaignRecruiter.findRecuiterAllCampaignPaginatedAsc";
    String FIND_RECRUITER_ALL_CAMPAIGN_PAGINATED_COUNT = "CampaignRecruiter.findRecuiterAllCampaignPaginatedCount";

    String FIND_CANDIDATE_BY_SOCIAL_MEDIA_ID = "Candidate.findCandidateBySocialMediaID";
    String FIND_CANDIDATE_BY_PHONE_NO_OR_EMAIL = "Candidate.findCandidateByPhoneNoOrEmail";
    String FIND_USERPROFILE_BY_PHONE_NO_OR_EMAIL = "Candidate.findUserProfileByPhoneNoOrEmail";

    String FIND_CONTEST_WIN_REWARD = "ContestReward.findContestWinReward";
    String FIND_CONTEST_JOB_FROM_CONTEST_JOB_SEQ = "ContestJob.findContestJobFromContesJobSeq";
    String FIND_INTERVIEW_STAGE_MSTR_BY_INTERVIEW_PRIORITY = "InterviewStageMstr.findInterviewStageMstrByInterviewPriority";
    String FIND_INTERVIEW_STAGE_MSTR_BY_REFRL_STATUS_CD = "InterviewStageMstr.findInterviewStageMstrByRefrlStatusCd";
    String FIND_INTERVIEW_STAGE_MSTR_BY_STAGE_DESC = "InterviewStageMstr.findInterviewStageMstrByStageDesc";
    String FIND_JOB_FROM_EMPL_REFRL = "EmplRefrl.findJobsFromEmpRefrl";

    String FIND_REWARD_TYPES = "RewardTypeMstr.findRewardType";
    String FIND_ALL_REWARD_TYPES = "RewardTypeMstr.findAllRewardTypeOfACompany";

    String FIND_APPLICABLE_CONTESTREWARD_TYPES = "ContestReward.findApplicableContestRewardTypes";

    String FIND_ALL_LI_FRIENDS = "LiUserNetwork.findFriendProfiles";
    String FIND_LI_FRIENDS_BY_KEYWORD = "LiUserNetwork.findFriendProfileByKeyword";
    String FIND_USER_BY_ID = "LoginHistory.findUserById";
    String FIND_LAST_LOGIN = "LoginHistory.findLastLogin";
    String FIND_EMP_REWARD_NOTIFICATION = "EmplReward.findNotificationewardList";

    String FIND_EMPL_MEDAL = "EmplMedal.findEmpMedal";

    String FIND_REWARDMEDAL = "RewardMedal.findRewardMedal";

    String FIND_ALL_GOALS_FROM_GOAL_SEQ = "Goal.findAllGoalsFromGoalSeq";

    String FIND_LATEST_REWARDS = "EmplReward.findLatestRewards";

    String FIND_LATEST_REWARDS_BY_ACTIVITYCD = "EmplReward.findLatestRewardsByActivityCd";

    String FIND_DATA_FOR_CANDIDATE_POOL = "EmplRefrl.findDataForCandPool";

    String SHIFT_STATUS = "shiftStatus";

    String FIND_EMPL_REFRL_SEQ_BY_SHIFT_STATUS = "EmplRefrl.findEmplRefrlSeqByShiftStatus";

    String FIND_CAND_EMPL_REFRL_COUNT_FOR_A_JOB = "EmplRefrl.findCandEmplRefrlCountForAJob";

    String FIND_CAND_EMPL_REFRL_COUNT_FOR_A_JOB_BY_PHONE = "EmplRefrl.findCandEmplRefrlCountForAJobByPhone";
    String FIND_CAND_EMPL_REFRL_FOR_A_JOB_BY_PHONE = "EmplRefrl.findCandEmplRefrlForAJobByPhone";
    String FIND_CAND_EMPL_REFRL_FOR_A_JOB = "EmplRefrl.findCandEmplRefrlForAJob";

    String FIND_CAND_EMPL_REFRL_COUNT_FOR_A_JOB_WITH_INTERVIEW_STAGE_MSTR = "EmplRefrl.findCandEmplRefrlCountForAJobWithInterviewStageMstr";

    String FIND_CAND_EMPL_REFRL = "EmplRefrl.findCandEmplRefrl";

    String FIND_DUPLICATE_MPHASIS = "EmplRefrl.findDuplicateCountMphasis";

    String FIND_DUPLICATE_MPHASIS_WITH_DOB = "EmplRefrl.findDuplicateCountMphasisWithDOB";

    String FIND_DUPLICATE_CAND_EMAIL_PHONE = "EmplRefrl.findDuplicateCountEmailPhone";
    String FIND_UPLOAD_DUPLICATE_MPHASIS_WITH_DOB = "EmplRefrl.findUploadDuplicateCountMphasisWithDOB";
    String FIND_UPLOAD_DUPLICATE_MYNTRA = "EmplRefrl.findUploadDuplicateCountMyntra";
    String FIND_UPLOAD_DUPLICATE_CAND_EMAIL_PHONE = "EmplRefrl.findUploadDuplicateCountEmailPhone";

    String PROBATION_DATE = "probationDate";
    String FIND_ACTIVITYSTAGE_REWARD_WITH_REWARD = "ActivitystageReward.findActivityStageRewardWithReward";
    String FIND_GOAL_REWARD_WITH_REWARD = "GoalReward.findGoalRewardWithReward";
    String FIND_JOB_REWARD_WITH_REWARD = "JobReward.findJobRewardWithReward";

    String FIND_ALL_COMPANIES = "CompanyMstr.findAllCompanies";
    String FIND_ALL_COMPANIES_WITH_TEMPLATE = "EmailTemplateConfig.findAllCompaniesWithTemplate";
    String FIND_ALL_ACTIVE_CONTESTS_WITH_MORE_THAN_SPECIFIED_DAYS_TO_END = "Contest.findAllActiveContestsWithMoreThanSpecifiedDaysToEnd";
    String FIND_ALL_ACTIVE_CONTESTS_WITH_LESS_THAN_SPECIFIED_DAYS_TO_END = "Contest.findAllActiveContestsWithLessThanSpecifiedDaysToEnd";
    String FIND_COMPANY_BY_COMPANY_CD = "CompanyMstr.findCompanyByCompanyCd";
    String FIND_COMPANY_BY_ACCESS_TOKEN = "CompanyMstr.findCompanyByAccessToken";
    String FIND_COMPANY_BY_DOMAIN = "CompanyMstr.findCompanyByDomain";
    String FIND_ALL_CONTEST_ACTIVITIES = "EmplActivity.findAllContestActivities";
    String FIND_EMP_CONTEST_ACTIVITIES = "EmplActivity.findAllEmpContestActivities";

    String FIND_CANDIDATES_WITH_REFRL_STATUS_CD = "EmplRefrl.findCandidatesWithRefrlStatusCd";

    String FIND_ALL_COUNTRY_NAMES = "Country.findAllCountryNames";
    String FIND_STATE_NAMES_WITH_COUNTRY_NAME = "State.findStateNamesWithCountryName";
    String FIND_CITY_NAMES_WITH_STATE_NAME = "City.findCityNamesWithStateName";

    String FIND_EMP_REFERRAL_AND_SHARE_COUNTS = "EmplRefrl.findEmpRefrlAndShareCounts";

    String FETCH_ALL_REG_ID = "UserProfile.fetchAllRegIdByUserProfileSeq";

    String FIND_PARENTCOMPANY_DETAILS = "CompanyMstr.findParentCompanyDetails";

    String FIND_ALL_CURRENCY_DETAILS = "CurrencyMstr.findCurrencyDetails";

    String FETCH_LANG_SEQ_BY_CODE = "LangMstr.fetchLangSeqbyCode";
    String FETCH_LANG_BY_CODE = "LangMstr.fetchLangbyCode";

    String FIND_ALL_JOBS_ID = "Job.findAllJobsbyId";
    String FIND_ALL_COMPANY_JOBS_ID = "Job.findAllCompanyJobsbyId";

    String FIND_ALL_JOBS_ID_FOR_ER = "Job.findAllJobsbyIdForEr";
    String FIND_ALL_COMPANY_JOBS_ID_FOR_ER = "Job.findAllCompanyJobsbyIdForEr";

    String FIND_PARENT_COMPANY_CONFIG = "CompanyMstr.findParentCompanyMstrByCompanySeq";
    String FIND_ALL_ACTIVE_CONTESTS = "Contest.findAllActiveContest";

    String FETCH_ALL_LEVEL_REWARDS = "LevelReward.fetchAllLevelRewards";
    String CHECK_CANDIDATE_IN_PROCESS = "EmplRefrl.checkCandInProcess";
    String CHECK_CANDIDATE_IN_PROCESS_BY_PHONE = "EmplRefrl.checkCandInProcessByPhone";
    String CHECK_EMP_IN_PROCESS = "EmplRefrl.checkEmpInProcess";
    String CHECK_EMP_IN_PROCESS_BY_PHONE = "EmplRefrl.checkEmpInProcessByPhone";

    //String FIND_CONFIG_BY_COMPANY = "CompanyConfig.findConfigByCompany";
    String FIND_CAMPAIGN_BY_TITLE = "Campaign.findCampaignByTitle";
    String CAMPAIGN_TITLE = "campaignTitle";
    String FIND_CAMPAIGN_BY_TITLE_NOT_EQUALS_CAMPAIGN_SEQ = "Campaign.findCampaignByTitleNotEqualsCampaignSeq";
    String FETCH_COUNTRY_DETAILS_LANG = "CountryMstr.fetchCountryDetailsLang";
    String FETCH_CURRENT_LOCATION_DETAILS_LANG = "CurrentLocationMstr.fetchCurrentLocationDetailsLang";
    String FETCH_CURRENT_EMPLOYER_DETAILS_LANG = "CurrentEmployerMstr.fetchCurrentEmployerDetailsLang";
    String FETCH_CURRENT_EMPLOYER_DETAILS_LANG_BY_NAME = "CurrentEmployerMstr.fetchCurrentEmployerDetailsLangByName";
    String FETCH_QUALIFICATION_DETAILS_LANG = "QualificationMstr.fetchQualificationDetailsLang";
    String FETCH_SKILLS_DETAILS_LANG = "SkillsMstr.fetchSkillsDetailsLang";
    String FETCH_GENDER_DETAILS_LANG = "GenderMstr.fetchGenderDetailsLang";

    String FIND_WEBSERVICES_LOG_BY_TRANSACTION_ID = "WebServicesLog.findWebServicesLogByTransactionId";
    String FETCH_CANDIDATE_SKILLS_BY_RESUME_SEQ = "CandidateSkills.fetchCandidateSkillsByResumeSeq";

    String RIPPLEHIRE_SEQ = "ripplehireSeq";
    String FETCH_REFRL_DETAILS_BY_RIPPLEHIRE_ID = "EmplRefrl.fetchRefrlDetailsByRipplehireId";
    String FETCH_REFRL_BY_RIPPLEHIRE_ID = "EmplRefrl.fetchRefrlByRipplehireId";
    String GENDER_CLIENT_KEY = "genderClientKey";
    String FETCH_GENDER_SEQ_BY_GENDER_DESC = "GenderMstr.fetchGenderSeqbyGenderDesc";
    String CURRENT_LOCATION_CLIENT_KEY = "currentLocationClientKey";
    String FETCH_CURRENT_LOCATION_SEQ_BY_CURRENT_LOCATION_DESC = "CurrentLocationMstr.fetchCurrentLocationSeqbyCurrentLocationDesc";
    String QUALIFICATION_CLIENT_KEY = "qualificationClientKey";
    String FETCH_QUALIFICATION_SEQ_BY_CLIENT_KEY = "QualificationMstr.fetchQualificationSeqbyClientKey";
    String CURRENT_EMPLOYER_CLIENT_KEY = "currentEmployerClientKey";
    String FETCH_CURRENT_EMPLOYER_BY_CLIENT_KEY = "CurrentEmployerMstr.fetchCurrentEmployerSeqbyClientKey";
    String FETCH_CURRENT_EMPLOYER_OTHER = "CurrentEmployerMstr.fetchCurrentEmployerSeqOther";
    String COUNTRY_CLIENT_KEY = "countryClientKey";
    String FETCH_COUNTRY_SEQ_BY_CLIENT_KEY = "CountryMstr.fetchCountrySeqbyClientKey";
    String FIND_JOB_LEVEL_CONFIG = "JobLevelConfig.findJobLevelConfig";
    String SKILLS_CLIENT_KEY = "skillsClientKey";
    String FETCH_SKILLS_SEQ_BY_CLIENT_KEY = "SkillsMstr.fetchSkillsSeqbyClientKey";
    String FETCH_INTERVIEW_STAGE_MSTR_BY_STATUS_CD_PRIORITY = "InterviewStageMstr.fetchInterviewStageMstrByStatusCdPriority";
    String JOB_CD = "jobCd";
    String FETCH_JOB_BY_JOB_CD = "Job.fetchJobByJobCd";
    String FETCH_CAMPAIGN_BY_JOB_ID = "Campaign.fetchCampaignByJobId";
    String CLIENT_CANDIDATE_ID = "clientCandidateId";
    String KENEXA_CODE = "kenexaCode";
    String KENEXA_CREDIT = "credit";
    String FETCH_KENEXA_APPLICATION_BY_KENEXA_CODE = "KenexaApplication.fetchKenexaApplicationByKenexaCode";
    String FETCH_PENDING_KENEXA_APPLICATION_BY_EMAIL = "KenexaApplication.fetchPendingKenexaApplicationByEmail";
    String FETCH_PENDING_KENEXA_APPLICATION_BY_EMAIL_OR_CODE = "KenexaApplication.fetchPendingKenexaApplicationByEmailOrCode";
    String FETCH_KENEXA_APPLICATION_BY_CLIENT_SEQ = "KenexaApplication.fetchKenexaApplicationByClientSeq";
    String FETCH_KENEXA_APPLICATION_BY_EMAIL = "KenexaApplication.fetchKenexaApplicationByEmail";
    String FIND_EMPL_REFRL_BY_CLIENT_SEQ = "EmplRefrl.findEmplRefrlByClientSeq";
    String FETCH_CANDIDATE_SEQ_BY_CLIENT_SEQ = "EmplRefrl.fetchCandidateSeqByClientSeq";
    String FIND_JOB_BY_JOB_CODE = "Job.findJobByJobCode";
    String FIND_JOB_BY_JOB_CODE_ALL_STATUS = "Job.findJobByJobCodeAllStatus";
    String FIND_CLIENT_INTERVIEW_STATUS_LANG = "ClientInterviewStatusLang.findClientInterviewStatusLang";
    String CLIENT_INTERVIEW_ROUND_CD = "clientInterviewRoundCd";
    String FIND_CLIENT_INTERVIEW_STATUS_BY_REFRL_STATUS_CD_AND_ROUND_CD = "ClientInterviewStatus.findClientInterviewStatusByRefrlCdAndRoundCd";
    String CLIENT_INTERVIEW_SUBSTATUS = "cleintInterviewSubstatus";
    String FIND_CLIENT_INTERVIEW_STATUS_BY_INTERVIEW_STAGE_MSTR_AND_SUBSTATUS_CD = "ClientInterviewStatus.findClientInterviewStatusByStageMstrAndSubstatus";
    String FIND_CLIENT_INTERVIEW_STATUS_BY_REFRL_STATUS_CD_ROUND_CD_AND_SUBSTATUS_CD = "ClientInterviewStatus.findClientInterviewStatusByRefrlCdRoundCdAndSubstatus";
    String FIND_CLIENT_INTERVIEW_STATUS_BY_ROUND_CD_AND_SUBSTATUS_CD = "ClientInterviewStatus.findClientInterviewStatusByRoundCdAndSubstatus";
    String FETCH_REFRL_DETAILS_BY_RIPPLEHIRE_ID_AND_CLIENT_ID = "EmplRefrl.fetchRefrlDetailsByRipplehireIdAndClientID";
    String GENDER_DESC = "genderDesc";
    String CURRENT_LOCATION_DESC = "currentLocationDesc";

    String COMPANY_CODE = "companyCd";
    String FIND_CANDIDATE_WHO_UNSUBSCRIBED = "CandidateSubscription.findCandidateWhoUnsubscribed";
    String FIND_JOB_LIST_FOR_CAMPAIGN_LINK_JOB = "CampaignJob.findJobListForCampaignLinkJob";
    String FIND_JOB_LIST_FOR_CONTEST_LINK_JOB = "ContestJob.findJobListForContestLinkJob";
    String FIND_USER_PROFILE_BY_ID_FOR_INACTIVE = "UserProfile.findUserProfileByIdForInactive";
    String CANDIDATE_SEARCH = "candidateSearch";
    String JOB_SEARCH = "jobSearch";
    String FIND_ALL_RECRUITER_EMP_REFRLS_BY_SEARCH = "EmplRefrl.findRecruiterEmpRefrlsBySearch";
    String FIND_RECRUITER_CONTEST_EMP_REFRLS_BY_SEARCH = "EmplRefrl.findContestRecruiterEmpRefrlsBySearch";
    String FIND_ALL_RECRUITER_EMP_REFRLS_RESULT_COUNT = "EmplRefrl.findRecruiterEmpRefrlsResultCount";
    String FIND_RECRUITER_CONTEST_EMP_REFRLS_RESULT_COUNT = "EmplRefrl.findContestRecruiterEmpRefrlsResultCount";
    String FIND_ALL_EMP_GOALS_LANG_FB = "EmplGoal.findAllGoalsLangfb";
    String FIND_ALL_GOALS_FB = "Goal.findAllGoalsfb";

    String FIND_REFERRAL_STATUS = "EmplRefrl.findReferralStatus";
    String FIND_TOP_PLAYERS_BY_LOCATION = "EmplReward.findTopPlayersbyLocation";
    String FIND_REWARD_LIST_FOR_CONTEST_BADGES = "EmplReward.findRewardListForContestBadges";
    String EMPL_REWARD_SEQ = "emplRwrdSeq";
    String FIND_REWARD_LIST_FOR_NEW_CONTEST_BADGES = "EmplReward.findRewardListForNewContestBadges";

    String FETCH_TRANSFERRED_REFRL_DETAILS_BY_RIPPLEHIRE_ID_AND_CLIENT_ID = "EmplRefrl.fetchTransferredRefrlDetailsByRipplehireIdAndClientID";
    String PARENT_EMPL_REFRL_SEQ = "parentEmplRefrlSeq";
    String FETCH_REFRL_DETAILS_BY_PARENT_REFRL_SEQ_ID_AND_CLIENT_ID = "EmplRefrl.fetchRefrlDetailsByParentRefrlSeqAndClientID";
    /**
     * Report queries
     */
    String FIND_SOURCERS_WITH_APPLIED_CAND = "EmplRefrl.findSourcersWithAppliedCandidates";
    String FIND_APPLIED_CAND_BY_SOURCER = "EmplRefrl.findAppliedCandidatesListBySourcer";
    String FIND_ALL_APPLIED_CAND_OF_PREVIOUS_DAY = "EmplRefrl.findAllAppliedCandidatesOfPreviousDay";
    String FETCH_EMP_CAND_CONV = "EmpCandConv.fetchBuddyConversation";
    String FETCh_EMP_CAND_CONV_WITH_STATUS_CODE = "EmpCandConv.fetchBuddyConversationWithRefrlStatusCode";
    String MESSAGE_SENDER = "sender";
    String FIND_EMPLOYEE_BY_USER_PROFILE_SEQ = "EmployeeMstr.findEmployeeByUserProfileSeq";
    String FIND_RECTR_USER_PROFILE_BY_JOB_SEQ = "UserProfile.findRectrUserProfileByJobSeq";
    String FIND_EMPL_REFRL_BY_JOB_SEQ = "EmplRefrl.findEmplRefrlByJobSeq";
    String FIND_EMPL_REFRL_BY_CAMPAIGN_JOB_SEQ = "EmplRefrl.findEmplRefrlByCampaignJobSeq";
    String FIND_EMPL_REFRL_BY_JOB_SEQ_AND_CAND_EMAIL_ADDR = "EmplRefrl.findEmplRefrlByJobSeqAndCandEmailAddr";
    String FIND_ALL_JOBS_OF_CONTEST = "ContestJob.findAllJobSeqOfContestWithClosedJobs";

    String FIND_CLIENT_CUSTOM_ITEMS = "ClientCustomItemsMstr.findClientCustomItems";
    String FIND_CLIENT_CUSTOM_ITEMS_BY_TYPE = "ClientCustomItemsMstr.findClientCustomItemsByType";
    String FIND_CLIENT_CUSTOM_ITEMS_BY_TYPE_AND_DISPLAY_PAGE = "ClientCustomItemsMstr.findClientCustomItemsByTypeAndDisplayPage";
    String FIND_CLIENT_CUSTOM_ITEMS_BY_TYPE_SUGGESTIONS = "ClientCustomItemsMstr.findClientCustomItemsByTypeSuggestions";
    String FIND_CLIENT_CUSTOM_ITEMS_BY_DISPLAY_PAGE = "ClientCustomItemsMstr.findClientCustomItemsByDisplayPage";
    String CUSTOM_ITEM_CLIENT_ID = "customItemClientId";
    String CUSTOM_ITEM_DESC = "customItemDesc";
    String CUSTOM_ITEM_TYPE = "customItemType";
    String CUSTOM_ITEM_DISPLAY_PAGE = "displayPage";
    String CLIENT_CUSTOM_MAP_TYPE_ROUNDS = "ROUND_MAPPING";
    String CLIENT_CUSTOM_MAP_TYPE = "type";
    String CLIENT_CUSTOM_MAP_EXT_KEY = "externalKey";
    String CLIENT_INTERNAL_MAP_TYPE = "type";

    String FIND_CLIENT_CUSTOM_MAP_BY_EXT_TYPE = "ClientCustomMap.findClientCustomMapByExtType";
    String FIND_ALL_CAMPAIGN_JOBS_TITLE_BY_SEARCH = "CampaignJob.findAllJobTitleCampaignSearch";
    String FIND_ALL_CAMPAIGN_ACTIVE_JOBS_TITLE_BY_SEARCH = "CampaignJob.findAllActiveJobTitleCampaignSearch";
    String FIND_ALL_CONTEST_JOBS_TITLE_BY_SEARCH = "ContestJob.findAllJobTitleOfContestBySearch";
    String FIND_ALL_CONTEST_ACTIVE_JOBS_TITLE_BY_SEARCH = "ContestJob.findAllActiveJobTitleOfContestBySearch";
    String FIND_ALL_JOBS_TITLE_BY_SEARCH = "Job.findAllJobsTitleBySearch";
    String FIND_VENDOR_BY_SEARCH = "VendorMstr.findVendorBySearch";
    String FIND_ALL_ACTIVE_JOBS_TITLE_BY_SEARCH = "Job.findAllActiveJobsTitleBySearch";
    String FIND_ALL_ACTIVE_JOBS = "Job.findAllActiveJobs";

    String FIND_ALL_CONTEST_CLOSED_JOB = "ContestJob.findAllContestClosedJob";
    String FIND_RECRUITER_CAMPAIGN_ALLOWED_LIST_SEQ = "JobRecruiter.findRecruiterCampaignAllowedListSeq";
    String FIND_RECRUITER_CONTEST_ALLOWED_LIST_SEQ = "JobRecruiter.findRecruiterContestAllowedListSeq";
    String FIND_CANDIDATE_RESUME_NAME_BY_UUID = "UserProfile.findCandidateResumeNameByUuid";
    String GET_ALL_RESUMES_SIZE = "EmplRefrl.getResumesDownloadSize";
    String GET_ALL_SELECTED_RESUMES = "EmplRefrl.getAllSelectedResumes";

    String FETCH_CURRENT_LOCATION_DETAILS_BY_DESC = "CurrentLocationDesc.fetchCurrentLocationDetailsDesc";
    String FETCH_FORM_FIELDS = "CandidateFormFields.fetchFormFields";
    String FETCH_CANDIDATE_FORM_FIELDS = "CandidateFormFields.fetchCandidateFormFields";
    String FETCH_INTERVIEWER_FORM_FIELDS = "CandidateFormFields.fetchInterviewerFormFields";

    String FIND_USERS_PENDING_FOR_MAIL = "EmailLog.findMailPendingUsers";

    String GET_FRAUD_CHECKLIST = "FraudChecklist.getChecklist";
    String RESUME_FILE_REF_ACTUAL_NM = "resumeFileRefActualNm";
    String FETCH_LIST_OF_RESUME_DATA = "EmplRefrl.fetchListOfResumeDataByCompanySeq";
    String FETCH_CANDIDATE_RESUME_NAMES_WITHIN_A_WEEK = "CandidateResumeDetails.fetchCandidateResumeNamesInAWeek";

    String FETCH_CANDIDATE_UPLOAD_RESUME_SIZE = "CandidateUploadResumeDetails.fetchCandidateUploadCount";
    String FETCH_REFERRAL_CHANNEL_CONFIG = "ReferralChannelConfig.fetchListOfReferralChannel";
    String FETCH_REFERRAL_SOCIAL_CHANNELS = "ReferralChannelConfig.fetchSocialReferralChannel";

    String FIND_NEW_JOBS = "findNewJobsByCompany";
    String FIND_CANDIDATES_AND_INTERVIEWSTAGE_BY_COMPANY = "findCandidatesAndInterviewstageByCompany";
    String FIND_DISTINCT_LOGIN_COUNT_BY_COMPANY = "findDistinctLoginCountByCompany";
    String FIND_DISTINCT_REFERREL_ACTIVITIES_BY_COMPANY = "findDistinctReferralActivities";
    String FIND_TOTAL_REFERREL_ACTIVITIES_BY_COMPANY = "findTotalReferralActivities";
    String FIND_NEWUSERS_BY_COMPANY = "findNewusersByCompany";
    String FETCH_SKILLS_DETAILS_LANG_BY_SEARCH = "SkillsMstr.fetchSkillsDetailsLangBySearch";
    String STR_YEAR = "year";
    String STR_MONTH = "month";
    String FETCH_JOB_VIEWES = "findCandidateJobViews";

    String FIND_ALLOWED_COMPANIES_FOR_JOBS = "Job.findAllowedCompaniesForJobs";
    String FIND_ETHNICITY_LIST_FOR_COMPANY = "CandidateEthnicity.findEthnicityListOfCompany";
    String FIND_COMPANY_FACEBOOK_CONFIG = "CompanyFacebookConfig.findCompanyFacebookConfig";
    String FIND_COMPANY_FACEBOOK_CONFIG_BY_COMPANY = "CompanyFacebookConfig.findCompanyFacebookConfigByCompany";

    String FIND_RH_ADMIN_USER = "Employee.findRhAdminUser";

    String DOMAIN_NAME = "domainName";

    String FIND_COUNTRY_PHONE_CODE = "CountryPhoneCode.fetchAllCountryPhoneCode";

    String FETCH_COMMON_TALENT_POOL_JOB = "job.fetchCommonTalentPoolJob";
    String FETCH_COMMON_TALENT_POOL_CAMPAIGN = "campaign.fetchCommonTalentPoolCampaign";
    String FETCH_JOB_WEBSERVICE_CONFIG = "JobWebserviceConfig.findJobWebServiceConfig";
    String FIND_ALL_JOBS_LIST = "Job.findAllJobsList";
    String FIND_ALL_JOBS_WITHIN_RANGE = "Job.findAllJobsListWithinRange";
    String ACCESS_KEY = "accessKey";
    String ACCESS_SECCRET = "accessSecret";

    String FETCH_CANDIDATE_RESUME_DATE_BY_CANDIDATE_RESUME_DETAILS = "CandidateResumeData.fetchCandidateResumeDataByCandidateResumeDetails";

    String VENDOR_EMAIL_ID = "vendorEmailId";
    String FIND_VENDOR_PROFILE = "VendorProfile.findVendorProfileByVendorEmailID";
    String FETCH_VENDOR_PROFILE_EMAIL_LIST_BY_COMPANY_SEQ = "VendorProfile.fetchVendorProfileEmailListByCompanyID";
    String FETCH_CAND_DETAILS_BY_VENDOR_EMAIL_ID = "EmplRefrl.fetchCandidateDetailsByVendorEmailID";
    String FIND_CANDIDATE_RECRUITERS = "Job.findCandidateRecruiters";
    String FIND_CANDIDATE_RECRUITERS_FROM_EMPL_REFRL = "EmplRefrl.findCandidateRecruitersByEmplRefrlSeq";


    //Employee Engagement mailer
    String ACTIVITY_TYPE = "activityType";
    String MAX_DIFFERENCE_BETWEEN_TWO_DATES = "maxDifference";
    String MIN_DIFFERENCE_BETWEEN_TWO_DATES = "minDifference";
    String FETCH_EMPLREFRL_BY_USERPROFILESEQ = "EmplRefrl.fetchEmpRefrlByUserProfileSequence";
    String FIND_USER_CREATION_RECORDS_BY_DATE_DIFF = "EmployeeMstr.fetchActivityLogforUserCreationByDateDiff";
    String FIND_NOT_REFERRED_RANDOM_JOBS_BY_USER = "Job.findNotReferredRandomJobsByUser";
    String FIND_NOT_REFERRED_MONETARY_REWARD_RANDOM_JOBS_BY_USER = "Job.findNotReferredMonetaryRewardRandomJobsByUser";
    String FIND_USER_CREATION_RECORDS_FOR_JOB_MAILER = "EmployeeMstr.fetchUserCreationRecordsForJobMailer";

    String FIND_ALL_USER_ROLE_PERMISSIONS = "PermissionsMstr.findAllUserRolePermissions";

    String FIND_REJECT_REASONS_BY_COMPANY = "ActionReasons.findRejectReasonsByCompany";

    String FIND_ALL_USER_COMPANIES = "UserCompanyConfig.findAllUserCompanies";

    String FIND_FORGOT_PASSWORD_TOKEN = "ForgotPasswordToken.finfFOrgotPasswordToken";

    String FIND_OLD_FORGOT_PASSWORD_TOKENS_BY_USER_ID = "ForgotPasswordToken.findOldForgotPasswordTokens";

    String FETCH_COMPANY_REPORTS = "ReportMstr.fetchCompanyReports";
    String FETCH_CHILD_REPORTS = "ReportMstr.fetchChildReports";
    String FETCH_REPORT_BY_CODE = "ReportMstr.fetchReportByCode";
    String FETCH_IMPL_CLASS_BY_CODE = "ReportMstr.fetchImplClassByCode";

    String FETCH_LATEST_JOB_OPENINGS = "JobHistory.fetchLatestJobOpenings";

    String FIND_LOGGED_IN_USERS_COUNT = "LoginHistory.findTotalLoggedInUsers";
    String FIND_LOGGED_IN_USERS_COUNT_BY_DATE = "LoginHistory.findTotalLoggedInUsersByDate";

    String FIND_EMP_ACTIVITY_RECORDS = "EmplActivity.FindEmpActivityRecords";
    String FIND_ACTIVITY_RECORDS_BETWEEN_TWO_DATES_BY_ENTITY = "ActivityLog.findActivityRecordsBetweenTwoDatesByEntity";

    String FETCH_EMP_FORM_FIELDS = "Employeeformfields.fetchEmpFormFields";
    String FIND_JOB_HISTORY_BY_JOB = "JobHistory.findJobHistoryByJobSeq";
    String CUSTOM_JOB_FORM_FIELDS = "JobFormFields.findJobFormFields";
    String CUSTOM_JOB_FORM_FIELDS_FOR_API = "JobFormFields.findJobFormFieldsforApi";
    String FIND_ALL_EMPLOYEE_PARTICIPATED_BY_COMPANY = "EmplRefrl.findAllEmpParticipationByCompany";
    String FIND_ALL_EMPLOYEE_PARTICIPATED_BY_COMPANY_BY_DATE = "EmplRefrl.findAllEmpParticipationByCompanyByDate";
    String FIND_TOTAL_EMPLOYEE_COUNT_BY_COMPANY = "EmployeeMstr.findTotalEmpCountByCompany";
    String FIND_TOTAL_EMPLOYEE_COUNT_BY_DATE = "EmployeeMstr.findTotalEmpCountByDate";
    String FIND_DIMENSION_REPORT_DATA = "ReportMstr.findDimensionReportData";

    //Added By Vikas//
    String REDEMPTION_REPORT_VERIFICATION = "RedemptionReport.fetchRecordsRedemptionVerification";
    String REDEMPTION_REPORT_PENDING_PAYMENT = "RedemptionReport.fetchRecordsRedemptionPendingPayment";
    String REDEMPTION_REPORT_READY_DISBURSEMENT = "RedemptionReport.fetchRecordsRedemptionReadyDisbursement";
    String REDEMPTION_REPORT_DISBURSEMENT = "RedemptionReport.fetchRecordsRedemptionDisbursement";
    String EMPLREWARD_FROM_IDLIST = "EmplReward.findEmpRewardFromIdList";
    String EMPLREWARD_FROM_IDLIST_PARAM = "emplRwrdSeqList";
    String CURRENCY_RATE_FROM_EMPLREFSEQ = "RedemptionReport.fetchCurrencyRateFromEmplRewardSeq";
    String REDEMPTION_PAYOUTDETAIL_EMPLSEQ = "RedemptionPayoutDetails.findRedemptionPayoutDetailsByEmplSeq";
    String FETCH_REDEMPTION_PAYOUT_DETAIL_BY_EMPLREFRL_SEQ  = "RedemptionPayoutDetails.findRedemptionPayoutDetailsByEmplRefrlSeq";
    String REDEMPTION_PAYOUTDETAIL_EMPLSEQ_PARAM = "empSeq";
    String REWARD_DETAILS_FROM_EMPREFRL_SEQ = "EmplRefrl.getRewardDetailsFromEmplReferral";
    String REWARD_DETAILS_FROM_EMPREFRL_SEQ_PARAM = "empSeqList";
    String EMPLREWARD_USER_CATEGORY = "EmplReward.findEmpRewardFromUserAndCategory";
    String JOBREWARD_FETCH_BY_JOBSEQ = "JobReward.fetchJobRewardFromJobSeq";
    String JOBREWARD_FETCH_BY_JOBSEQ_AND_REWARDTYPE_CD = "JobReward.fetchJobRewardFromJobSeqAndRewardCode";
    String JOBREWARD_FETCH_BY_JOBSEQ_AND_REWARDTYPE_CD_PARAM = "rewardTypeCdList";


    //End//

    String FIND_REFERRAL_INPROCESS_COUNT = "EmplRefrl.findInprocessCount";
    String FIND_EMP_JOBSHARE_VIEW_COUNT = "EmplRferl.findEmpShareViewCount";
    String GET_CANDIDATES_LISTING_FRACTAL = "EmplRefrl.getCandidateListingForFractal";
    String FETCH_EMP_REFRL_SEQ_LIST = "EmplRefrl.fetchEmplRefrlSeqList";

    String FIND_REFERAL_COUNT_BY_CHANNEL_CD = "EmplRefrl.findRefrlCountByChannelCd";
    String FIND_REFERAL_COUNT_BY_CHANNEL_TYPE = "EmplRefrl.findRefrlCountByChannelType";
    String FIND_REFERAL_COUNT_BY_VENDOR_ID = "EmplRefrl.findRefrlCountByVendorId";

    String FETCH_CHANNEL_LIMIT_BY_CHANNEL_TYPE = "JobChannelMstr.fetchChannelLimitByChannelType";
    String FETCH_CHANNEL_LIMIT_BY_CHANNEL_CD = "JobChannelMstr.fetchChannelLimitByChannelCd";
    String FETCH_JOB_BY_CHANNEL = "JobChannelMstr.fetchJobListByChannel";
    String FIND_SOCIAL_MESSAGE = "SocialMessages.findSocialMessageForChannel";
    String FIND_SOCIAL_MESSAGE_CANDIDATE = "SocialMessages.findSocialMessageForCandidate";

    String FIND_USER_COINS_HOSTORY = "UserCoinsHistory.fetchUserCoinsHistory";
    String FIND_JOB_REVIEW_ENTRY_BY_JOB_CODE = "JobReview.findJobReview";
    String FIND_JOB_REVIEW_LIST = "JobReview.findJobReviewList";
    String FIND_EMP_BY_EMAIL_IDS = "EmployeeMstr.findEmpByEmailIds";

    String FETCH_CANDIDATE_COUNT_BY_REFRL_STATUS_CD = "EmplRefrl.fetchCandidateCountByRefrlStatusCd";
    String FIND_COMPANY_HELP_CONFIG = "CompanyHelpConfig.fetchCompanyHelpConfig";
    String FIND_HELP_SECTIONS = "CompanyHelpConfig.findHelpSectionList";

    String FETCH_PENDING_EMPL_REWARDS = "EmplReward.fetchPendingEmplRewards";

    String FETCH_WIDGET_BY_PAGE_ID = "WidgetMstr.fetchWidgetByPageId";
    String FETCH_WIDGET_BY_CD = "WidgetMstr.fetchWidgetByCd";
    String FETCH_MPHASIS_CANDIDATE_STATUS = "MphasisCandImport.fetchMphasisCandidateStatus";
    String FETCH_EMPL_REFRL_BY_RH_ID_AND_COMPANY_CD = "EmplRefrl.fetchEmplRefrlByRhIdAndCompanyCd";
    String FETCH_EMPL_REFRL_BY_CLIENT_CADIDATE_ID_AND_COMPANY_CD = "EmplRefrl.fetchEmplRefrlByClientCandidateIdAndCompanyCd";
    String FETCH_EMPL_REFRL_BY_CANDIDATE_ID_AND_JOB_SEQ = "EmplRefrl.fetchEmplRefrlByCandidateIdAndJobSeq";
    String FETCH_CLIENT_CUSTOM_MAPPING_BY_EXT_KEY_AND_COMPANY_MSTR = "ClientCustomMapping.fetchClientCustomMappingByExtKeyAndCompanyMstrSeq";
    String RH_ID_LIST = "rhIdList";
    String IMPORT_STATUS = "iStatus";
    String JOB_RECRUITER_SEQ = "jobRecruiterSeq";
    String FIND_CANDIDATE_BY_USER_PROFILE_SEQ = "Candidate.findCandidateByUserProfileSeq";
    String FETCH_COINS_FAILED_REQUEST = "CoinsServiceLog.fetchFailedRequests";
    String FIND_CLIENT_INTERVIEW_STATUS_BY_COMPANY = "ClientInterviewStatus.findClientInterviewStatusByCompany";
    String FIND_INTERVIEW_STAGE_MSTR_BY_COMPANY = "InterviewStageMstr.findInterviewStageMstrByCompany";

    //Unsubscribe
    String FIND_EMPLOYEE_BY_EMAIL_ONLY = "EmployeeMstr.findEmpByEmailOnly";

    String FETCH_VENDOR_PROFILE_BY_USERPROFILE_SEQ = "VendorProfile.fetchVendorProfileByUserProfileSeq";
    String FETCH_VENDOR_JOB_CITY_COUNT = "Vendor.fetchVendorJobCityCount";
    String FIND_ALL_JOB_VENDORS = "Job.findAllJobVendors";
    String FIND_VENDOR_PROFILE_BY_VENDOR_MSTR_SEQ = "VendorProfile.findVendorProfileByVendorMstrSeq";

    String VENDOR_ID_LIST = "vendorIdList";
    String FIND_VENDOR_COMPANY_LIST = "VendorMstr.findAllVendorsById";
    String FIND_JOB_VENDORS = "JobChannelMstr.findJobVendors";
    String FIND_ALL_VENDORS_BY_JOB = "JobChannelMstr.findAllVendorsByJob";

    String FETCH_ALL_JOB_VENDORS_BY_CATEGORY = "JobChannelMstr.findAllVendorsByJobAndCategory";
    String FETCH_ALL_JOB_VENDORS_BY_LIST = "VendorMstr.findAllVendorsByJobAndInList";
    String FETCH_ALL_JOB_VENDORS_BY_LIST_AND_CATEGORY = "VendorMstr.findAllVendorsByJobAndCategoryInList";
    String FETCH_ALL_VENDORS_NOT_IN_LIST = "VendorMstr.fetchAllVendorsExceptList";
    String FETCH_ALL_VENDORS_NOT_IN_LIST_AND_BY_CATEGORY = "VendorMstr.fetchAllVendorsInCategoryExceptList";


    String FETCH_RESUME_DETAILS_BY_EMPL_REFRL = "CandidateUploadResumeDetails.fetchCandidateResumeDetailsByEmplRefrl";
    String FIND_ETL_LOGS = "EtlFileLog.getEtlFileLogs";
    String FIND_ETL_LOGS_COUNT = "EtlFileLog.getEtlFileLogsCount";
    String FETCH_MPHASIS_REPARSE_LIST = "MphasisCandReparse.fetchNewRecords";
    String FIND_PENDINF_ETL_LOGS = "EtlFileLog.findPendingEtlLogs";

    String FETCH_VENDOR_CATEGORIES = "VendorCategory.fetchVendorCategories";
    String STR_EXPORT_STATUS = "exportStatus";
    String FETCH_NEW_RAW_EXPORT_REQUEST = "ExportQueue.fetchNewRawExportRequest";
    String STR_PROCESSED = "PROCESSED";
    String STR_ERROR = "ERROR";
    String STR_EXPORT_TYPE = "exportType";
    String FIND_ACTIVE_EMPL_REFRL_BY_SEQ = "EmplRefrl.findActiveEmplRefrlBySeq";
    String FETCH_EMPL_REFRL_BY_CAND_SEQ_AND_SUB_STATUS = "EmplRefrl.fetchEmplRefrlByCandSeqAndSubStatus";
    String FETCH_NEW_KENEXA_OBJECT = "KenexaApplication.fetchNewKenexaObject";
    String FETCH_MAIL_DATA_SEQ_ON_FROM = "MailData.fetchMailDataSeqOnFrom";
    String FETCH_NEW_DIT_LOG = "KenexaDitLog.fetchNewDitLog";
    String FETCH_NEW_DIT_DATA = "KenexaDitData.fetchNewDitData";
    String DIT_LOG_SEQ = "ditLogSeq";

    String FETCH_RECRUITERBOX_JOB_STAGES = "RecruiterboxJobStages.fetchRecruiterboxJobStage";
    String RECRUITERBOX_JOB_SEQ = "jobSeq";
    String RECRUITERBOX_STAGE_SEQ = "stageSeq";

    String FETCH_VENDOR_PROFILES_FOR_COMPANY = "VendorProfile.fetchVendorProfilesForCompany";
    String FETCH_VENDOR_PROFILES_FOR_COMPANY_BY_STATUS = "VendorProfile.fetchVendorProfilesForCompanyByStatus";

    String FIND_CLIENT_CUSTOM_ITEMS_TYPE_BY_COMPANYID = "ClientCustomItemsMstr.findClientCustomItemsType";
    String FETCH_WEEKLY_VENDOR_EMAIL_LIST = "EmplRefrl.fetchWeeklyVendorEmailList";
    String FETCH_AGENCY_JOB_INFORMATION = "VendorProfile.fetchVendorInformation";
    String FETCH_TRANSFERRED_REFERRAL_LIST = "EmplRefrl.fetchTransferredReferralList";
    String FETCH_TRANSFERREDTO_REFERRAL_LIST = "EmplRefrl.fetchTransferredToReferralList";
    String FIND_PARENT_COMPANY_SEQ_BY_COMPANY_MSTR_SEQ = "ParentCompanyMstr.fetchParentCompanySeqByCompanyMstrSeq";
    String FETCH_VENDOR_CATEGORY_MAPPING_BY_VENDOR_SEQ = "VendorCategoryMapping.fetchVendorCategoryMappingByVendorSeq";
    String FETCH_VENDOR_CATEGORY_BY_SEARCH = "VendorCategoryMstr.fetchVendorCategoryBySearch";
    String FETCH_REFRALS_BY_COMPANY_SUBSTATUS = "EmplRefrl.findReferalsByCompanyandSubstatus";
    String FIND_JOB_OFFERED_HIRED_COUNT = "EmplRefrl.findJobHiredCount";

    String FETCH_JOB_AGENCY_LIST = "JobChannelMstr.fetchJobAgencyList";
    String FETCH_PREVIOUS_INTERVIEW_STAGE = "EmplRefrl.fetchPreviousInterviewStage";
    String FIND_EMP_ACTIVITY_BY_JOB_AND_USER = "EmplActivity.findEmplActivityByJobAndUser";
    String FIND_EMP_ACTIVITY_BY_EMPL_REFRL_JOB_AND_USER = "EmplActivity.findEmplActivityByEmplRefrJobAndUser";
    String FIND_EMP_GOAL_BY_USER_AND_ACTIVITY = "EmplGoal.findEmplGoalByUserAndActivity";
    String FIND_EMPL_REWARDS_BY_EMPL_REFRL_AND_JOB = "EmplRewards.findEmplRewardsByEmplRefrlRewardsAndJob";
    String FIND_GOAL_REWARD_BY_ACTIVITY_MSTR_SEQ = "GoalReward.findGoalRewardByActivityMstrSeq";
    String FIND_ACTIVITYSTAGE_REWARDS_BY_ACTIVITY = "ActivityStageRewards.findActivityStageRewardsByActivity";

    String FIND_USER_PROFILE_AI_BY_ID_ALL_COMPANY = "UserProfile.findAllUserProfileByIdAllCompany";
    String FIND_USER_PROFILE_BY_EMPLOYEE_ID = "UserProfile.findAllUserProfileByEmployeeId";
    String GET_VIEW_JOB_PAGE_DETAILS = "Job.getViewJobPageDetails";

    String FIND_JOB_AGENCIES = "JobAgency.findJobVendors";
    String FETCH_JOB_AGENCY_LIMIT = "JobAgency.fetchAgencyJobLimit";
    String FETCH_ALL_JOB_AGENCIES = "Job.findAllJobAgencies";
    String FETCH_AGENCY_BY_JOB_SEQ = "JobAgency.fetchJobAgencyByJobSeq";
    String FETCH_JOB_AGENCY_BY_JOB = "JobAgency.findAllAgenciesByJob";
    String FETCH_JOB_TO_AGENCY_LIST = "JobAgency.fetchJobAgencyList";
    String FETCH_AGENCY_JOB_LIST = "JobAgency.fetchJobList";
    String FETCH_AGENCY_BY_JOB_SEQ_ONLY = "JobAgency.fetchJobAgencyByJobSeqOnly";

    String CHECK_CANDIDATE_DUPLICATE_BY_EMAIL = "EmplRefrl.checkCandidateDuplicateByEmail";
    String CHECK_CANDIDATE_DUPLICATE_BY_PHONE = "EmplRefrl.checkCandidateDuplicateByPhone";
    String CHECK_CANDIDATE_DUPLICATE_BY_EMAIL_ON_SINGLE_JOB = "EmplRefrl.checkCandidateDuplicateByEmailOnSingleJob";
    String CHECK_CANDIDATE_DUPLICATE_BY_PHONE_ON_SINGLE_JOB = "EmplRefrl.checkCandidateDuplicateByPhoneOnSingleJob";

    String FIND_ALL_USER_PROFILE_PERMISSIONS = "UserProfilePermissions.findAllUserProfilePermissions";

    String FIND_REFERAL_BY_USER_AND_CLIENT_CANDID = "EmplRefrl.fetchEmplRefrlByReferedAndCandidateId";
    String ACTION = "action";

    String FIND_CLIENT_ROUND_MAPPING = "ClientExternalRoundMapping.findClientRoundMapping";
    String CLIENT_EXTERNAL_ROUND_CODE = "externalRoundCode";
    String CLIENT_EXTERNAL_SUB_ROUND_CODE = "externalSubRoundCode";
    String FETCH_JOB_DETAIL_BY_CUSTOM8 = "JobDetail.fetchJobDetailByCustom8";
    String CUSTOM8 = "custom8";
    String COMPANY_ENTITY_ID = "companyEntityId";
    String COMPANY_ENTITY_LOCATION = "companyEntityLocation";
    String FETCH_COMPANY_BY_ENTITY_ID = "CompanyMstr.fetchCompanyByEntityId";
    String FETCH_COMPANY_BY_ENTITY_ID_AND_LOCATION = "CompanyMstr.fetchCompanyByEntityIdAndLocation";

    String FIND_SCHEDULE_CANCEL_BY_COMPANY = "InterviewScheduleCancelReason.findScheduleCancelReasonsByCompany";
    String FIND_INTERVIEW_SCHEDULES_BY_COMPANY_REFRL = "InterviewSchedule.findInterviewScheduleByRefrl";
    String FIND_TIMEZONES = "TimezoneMstr.getTimezones";
    String FIND_TIMEZONE_WITH_DESCRIPTION = "TimezoneMstr.getTimezoneWithDescription";
    String FIND_INTERVIEW_SCHEDULE_ATTENDEE_BY_COMPANY_INTERVIEW_SCHEDULE = "InterviewScheduleAttendee.findInterviewScheduleAttendeeByInterviewSchedule";
    String FIND_OPEN_INTERVIEW_SCHEDULE_STATUS_MSTR = "InterviewScheduleStatusMstr.findOpenInterviewScheduleStatusMstr";
    String FIND_INTERVIEW_SCHEDULE_ATTENDEE_BY_INTERVIEW_SCHEDULE_AND_USER_TYPE = "InterviewScheduleAttendee.findInterviewScheduleAttendeeByInterviewScheduleAndUsertype";
    String FIND_ALL_INTERVIEW_SCHEDULE_ATTENDEE_BY_COMPANY_INTERVIEW_SCHEDULE = "InterviewScheduleAttendee.findAllInterviewScheduleAttendeeByInterviewSchedule";


    String TASK_STATUS_CD = "taskStatusCD";
    String INTERVIEW_STATUS_CD = "statusCD";
    String TASK_TYPE_CD = "taskTypeCD";

    String INTERVIEW_SCHEDULE_REASON_TYPE = "type";

    String TASK_CANCELLED = "CANCELLED";
    String TASK_COMPLETE_ON_TIME = "COMPLETE_IN_TIME";
    String TASK_ASSIGNED = "ASSIGNED";
    String TASK_PENDING = "PENDING";
    String TASK_COMPLETE_AUTO = "COMPLETE_AUTO";
    String INTERVIEW_TASK = "INTERVIEW";
    String REVIEW_TASK = "REVIEW";
    String REC_REVIEW_TASK = "REC_REVIEW";
    String APPROVAL_TASK = "APPROVAL";

    String FIND_TASK_STATUS_BY_CODE_AND_COMPANY = "TaskStatusMaster.findTaskStatusByCDAndCompany";
    String FIND_TASK_TYPE_BY_CODE_AND_COMPANY = "TaskTypeMaster.findTaskTypeByCDAndCompany";
    String FIND_INTERVIEW_TASK_BY_INTERVIEW_SEQ_AND_COMPANY = "InterviewTask.findInterviewTaskByInterviewSeqAndCompany";
    String FIND_INTERVIEW_TASK_BY_INTERVIEW_REVIEW_SEQ_AND_COMPANY = "InterviewReviewTask.findInterviewReviewTaskByInterviewReviewSeqAndCompany";
    String FIND_JOB_REQUEST_TASK_BY_JOB_SEQ_AND_COMPANY = "JobRequestTask.findJobRequestTaskByJobSeqAndCompany";
    String FIND_JOB_APPROVAL_TASK_BY_JOB_SEQ_AND_COMPANY = "JobApprovalTask.findJobApprovalTaskByJobSeqAndCompany";

    String FIND_INTERVIEW_REVIEW_TASK_BY_INTERVIEW_SEQ_AND_COMPANY = "InterviewTask.findInterviewReviewTaskByInterviewSeqAndCompany";

    String FIND_INTERVIEW_INFO_BY_TAB = "InterviewScheduleAttendee.findInterviewInfoByTab";

    String FETCH_EMPLOYEE_DETAIL_BY_USER_PROFILE = "EmployeeDetail.fetchEmployeeDetailByUserProfile";
    String FETCH_EMPLOYEE_DETAIL_MAPPER_BY_USER_PROFILE = "EmployeeDetailMapper.fetchEmployeeDetailMapperByUserProfile";
    String FETCH_USER_COINS_COUNT_BY_REQUEST_TYPE = "CoinsServiceLog.fetchUserCoinsCountByRequestType";

    String GET_EMP_BADGE_RECORD = "EmplBadge.getEmpBadgeRecord";
    String FIND_EMPLOYEE_EMAILS_FOR_JOB_MAILER = "EmployeeMstr.findEmployeeEmailForJobMailer";
    String FIND_EMPLOYEES_BY_EMAIL_FOR_JOB_MAILER = "EmployeeMstr.findEmployeesByEmailForJobMailer";
    String FETCH_SOCIAL_CHANNEL_COUNT = "ReferralChannelConfig.fetchSocialChannelCount";


    //interview feedback queries
    String GET_INTERVIEW_CANDIDATES_TODAY_COUNT = "InterviewScheduleAttendee.getInterviewCandidateTodayCount";
    String GET_INTERVIEW_CANDIDATES_UPCOMING_COUNT = "InterviewScheduleAttendee.getInterviewCandidateUpcomingCount";
    String GET_INTERVIEW_CANDIDATES_PENDING_FEEDBACK_COUNT = "InterviewScheduleAttendee.getInterviewCandidatePendingCount";
    String GET_INTERVIEW_CANDIDATES_COMPLETED_COUNT = "InterviewScheduleAttendee.getInterviewCandidateCompletedCount";

    String GET_INTERVIEW_CANDIDATES_TODAY_LIST_FOR_EMPL_REFRL = "InterviewScheduleAttendee.getInterviewCandidateTodayListForEmplRefrl";
    String GET_INTERVIEW_CANDIDATES_TODAY_LIST = "InterviewScheduleAttendee.getInterviewCandidateTodayList";
    String GET_INTERVIEW_CANDIDATES_UPCOMING_LIST_FOR_EMPL_REFRL = "InterviewScheduleAttendee.getInterviewCandidateUpcomingListForEmplRefrl";
    String GET_INTERVIEW_CANDIDATES_UPCOMING_LIST = "InterviewScheduleAttendee.getInterviewCandidateUpcomingList";
    String GET_INTERVIEW_CANDIDATES_PENDING_FEEDBACK_LIST_FOR_EMPL_REFRL = "InterviewScheduleAttendee.getInterviewCandidatePendingListForEmplRefrl";
    String GET_INTERVIEW_CANDIDATES_PENDING_FEEDBACK_LIST = "InterviewScheduleAttendee.getInterviewCandidatePendingList";
    String GET_INTERVIEW_CANDIDATES_COMPLETED_LIST_FOR_EMPL_REFRL = "InterviewScheduleAttendee.getInterviewCandidateCompletedListForEmplRefrl";
    String GET_INTERVIEW_CANDIDATES_COMPLETED_LIST = "InterviewScheduleAttendee.getInterviewCandidateCompletedList";
    //interview feedback queries end

    String GET_INTERVIEW_EMAIL_NOTIFY_LIST = "InterviewScheduleAttendee.getInterviewEmailNotifyList";
    String GET_REVIEW_EMAIL_NOTIFY_LIST = "InterviewReview.getReviewEmailNotifyList";

    String FIND_INTERVIEW_QUESTIONS_BY_COMPANY = "InterviewFeedbackQuestions.findInterviewQuestionByCompany";
    String FIND_INTERVIEW_ANSWERS_BY_EMP_REFRL_AND_INTERVIEW = "InterviewFeedbackAnswers.findInterviewAnswersByEmpRefrlAndInterview";
    String FIND_INTERVIEW_INFO_BY_TOKEN = "Interviewer.findInterviewerByToken";
    String FIND_MAX_INTERVIEW_INFO_BY_INTERVIEW_DETAILS = "Interview.findMaxInterviewInfoFromInterviewDetails";

    String FIND_INTERVIEW_SCHEDULE_BY_INTERVIEW_DETAIL_SEQ = "InterviewSchedule.findInterviewScheduleByInterviewDetailSeq";
    String FETCH_ALL_CHILD_COMPANY_MSTR_SEQ = "CompanyMstr.fetchAllChildCompanyMstrSeq";

    String FIND_CANDIDATE_RESUME_DETAILS_BY_EMPL_REFRL_SEQ = "CandidateResumeDetails.findCandidateResumeDetailsByEmplRefrlSeq";

    String FETCH_FORM_FIELDS_HEADERS_ALL = "CandidateFormFields.fetchFormFieldsHeadersAll";
    String FETCH_FORM_FIELDS_HEADERS_INTERVIEW = "CandidateFormFields.fetchInterviewerFormFieldsHeaders";
    String FIND_COMMENTS_FOR_INTERIVIEWER_BY_EMPL_REFRL_ALL_COLLAB = "InterviewComments.findCommentsForInterviewerByEmplRefrlAllCollab";
    String FIND_COMMENTS_FOR_INTERIVIEWER_BY_EMPL_REFRL_NO_COLLAB = "InterviewComments.findCommentsForInterviewerByEmplRefrlNoCollab";
    String FIND_INTERVIEW_INFO_BY_USER_INTERVIEW_DETAIL = "Interviewer.findInterviewerByUserAndInterviewDetailSeq";
    String INTERVIEW_FEEDBACK_QUESTIONS_SEQ = "interviewFeedbackQuestionsSeq";
    String FIND_INTERVIEW_QUESTIONS_BY_QUESTION_SEQ = "InterviewFeedbackQuestions.findInterviewQuestionByQuestionSeq";

    String FIND_INTERVIEW_BY_INTERVIEW_SEQ = "Interview.findInterviewByInterviewSeq";
    String FETCH_CONTEST_JOB_REWARD_BY_BAND = "ContestReward.findContestTotalContestRewardBandInJobs";

    String FIND_INTERVIEW_SCHEDULE_BY_INTERVIEW_SEQ = "InterviewSchedule.findInterviewScheduleByInterviewSeq";
    String FIND_EMPL_REFRL_BY_INTERVIEW_DETAILS_SEQ = "EmplRefrl.findEmplRefrlByInterviewDetailSeq";
    String FIND_INTERVIEW_BY_SCHEDULE_SEQ = "InterviewSchedule.findInterviewByScheduleSeq";
    String FIND_INTERVIEW_STAGE_MSTR_BY_INTERVIEW_DETAILS_SEQ = "InterviewStageMstr.findInterviewStageMstrByInterviewDetailSeq";
    String FIND_INTERVIEW_USER_INFO_BY_TOKEN = "Interviewer.findInterviewUserInfoByToken";

    String FIND_ATTENDEES_BY_INTERVIEW_SCHEDULE_SEQ = "InterviewScheduleAttendee.findAttendeesByScheduleSeq";

    //    interview review queries
    String GET_REVIEW_CANDIDATES_COUNT_PENDING = "InterviewReview.getReviewCandidateCountPending";
    String GET_REVIEW_CANDIDATES_COUNT_FOR_INTERVIEW_TOKEN = "InterviewReview.getReviewCandidateCountForInterviewToken";
    String GET_REVIEW_CANDIDATES_COUNT_COMPLETED = "InterviewReview.getReviewCandidateCountCompleted";

    String GET_REVIEW_CANDIDATES_LIST_PENDING = "InterviewReview.getReviewCandidateListPending";
    String GET_REVIEW_CANDIDATES_LIST_PENDING_FOR_EMPL_REFRL = "InterviewReview.getReviewCandidateListPendingForEmplRefrl";
    String GET_REVIEW_CANDIDATES_LIST_COMPLETED = "InterviewReview.getReviewCandidateListCompleted";
    String GET_REVIEW_CANDIDATES_LIST_COMPLETED_FOR_EMPL_REFRL = "InterviewReview.getReviewCandidateListCompletedForEmplRefrl";
//    interview review queries end

    String FIND_INTERVIEW_REVIEW_BY_INTERVIEW_SEQ = "InterviewReview.findReviewByInterview";
    String FIND_INTERVIEW_BY_INTERVIEW_DETAIL_SEQ = "Interview.findInterviewByInterviewDetailSeq";
    String FIND_ALL_INTERVIEW_BY_INTERVIEW_DETAIL_SEQ = "Interview.findAllInterviewByInterviewDetailSeq";
    String FETCH_IS_FEEDBACK_DONE = "Interview.getIsFeedbakDone";
    String FETCH_IS_REVIEW_DONE = "InterviewReview.getIsReviewDone";

    String FIND_EMPL_REFRL_BY_INTERVIEW_SEQ = "Interview.findEmplRefrlByInterviewSeq";
    String FIND_INTERVIEW_BY_JOB = "Interview.findInterviewForJob";
    String FIND_INTERVIEW_REVIEW_BY_INTERVIEW_DETAILS_SEQ = "InterviewReview.findInterviewReviewsByInterviewDetailSeq";
    String FIND_INTERVIEW_FEEDBACK_COMMENTS_BY_INTERVIEW_SEQ = "InterviewFeedbackComments.findInterviewFeedbackCommentsByInterviewSeq";

    String VALIDATE_REVIEWER_FOR_EXISITNG_INTERVIEW = "InterviewDetails.validateReviewerForExistingInterview";

    String GET_SCHEDULE_CANDIDATE_DETAILS = "InterviewSchedule.getScheduleCandidateDetails";
    String GET_REVIEW_CANDIDATE_DETAILS = "InterviewReview.getReviewCandidateDetails";
    String INTERVIEW_COMMENT_TYPE = "commentType";
    String GET_INTERVIEW_REVIEW_BY_REFRL = "InterviewReview.getInterviewReviewByRefrl";

    String FETCH_CURRENCY_CONVERSION_BY_COMPANY="CurrencyConversion.fetchCurrencyConversionByCompany";
    String FETCH_CURRENCY_CONVERSION_BY_COMPANY_AND_CURRENCY="CurrencyConversion.fetchCurrencyConversionByCompanyAndCurrency";
    String FETCH_USER_COINS_HISTORY="UserCoinsHistory.fetchUserCoinsHistory";

    String FETCH_JOB_FORM_FIELDS_VIEW_HEADERS_ALL = "JobFormField.getAllViewJobFieldHeaders";
    String FIND_APPROVER_DISPLAY_LIST="EmployeeMstr.findApproverDisplayList";

    String JOB_STATUS_CD = "jobStatusCd";
    String JOB_STATUS_LABEL = "jobStatusLabel";
    String GET_JOB_STATUS_MSTR = "JobStatusMstr.getJobStatusMstr";

    String GET_JOB_HISTORY_DATES = "Job.getJobHistoryDates";
    String REQUEST_JOB_FORM_FIELDS = "JobFormField.getRequestJobFields";
    String FIND_ALL_USER_EMAILS = "EmployeeMstr.findAllUserEmail";

    String RECRUITERBOX_IN_PROCESS = "in_process";
    String RECRUITERBOX_SCREENING = "Screening";
    String RECRUITERBOX_MAKE_CONTACT = "Make Contact";
    String RECRUITERBOX_MAKE_OFFER = "Make Offer";
    String FIND_JOB_SNAPSHOT_BY_JOB_SEQ = "JobSnapshot.findJobSnapshotByJobSeq";

    String JOB_APPROVAL_LEVEL = "level";
    String FIND_JOB_APPROVERS_BY_LEVEL = "Job.findJobApproversByLevel";
    String FETCH_JOB_APPROVAL_DETAILS_BY_JOB = "JobApprovalDetails.fetchJobApprovalDetailsByJob";
    String FETCH_JOB_APPROVER_BY_JOB_LEVEL = "JobApprover.fetchJobApproverByJobLevel";
    String FETCH_JOB_APPROVER_BY_USER_PROFILE_SEQ = "JobApprover.fetchJobApproverByUserProfileSeq";
    String FIND_USER_GROUP_MEMBER_BY_USER_GROUP_SEQ = "UserGroupMembers.findUserGroupMemberByUserGroupSeq";
    String FETCH_INACTIVE_JOB_APPROVAL_DETAILS_BY_JOB_LEVEL_SHIFT_STATUS = "JobApprovalDetails.fetchInactiveJobApprovalDetailsByJobLevelShiftStatus";
    String FETCH_JOB_APPROVER_BY_JOB_USER = "JobApprover.fetchJobApproverByJobUser";
    String FETCH_JOB_APPROVER_FOR_SOLR_VIEW_BY_JOB = "JobApprover.fetchJobApproverForSolrViewByJob";
    String FETCH_ALL_JOB_APPROVERS_BY_JOB="JobApprover.fetchAllJobApproversByJob";
    String FETCH_ALL_JOB_APPROVERS_DETAILS_BY_JOB= "JobApprovalDetails.fetchAllJobApproversDetailsByJob";
    String FIND_JOB_APPROVERS_COUNT="JobApprover.findJobApproversCount";
    String FIND_JOBS_BY_JOB_SEQ_LIST = "Job.findJobsByJobSeqList";
    String FIND_MAIL_DATA_PRESENT_OR_NOT = "MailData.findMailDataPresentOrNot";

    String FIND_ALL_JOBS_IN_CONTEST = "ContestJob.findAllJobsInContest";
    String FIND_ALL_ACTIVE_JOBS_LIST = "Job.findAllActiveJobsList";
    String FIND_ALL_ACTIVE_JOBS_COUNT = "Job.findAllActiveJobsCount";
    String GET_ALL_CHILD_COMPANIES_BY_COMPANY = "CompanyMstr.getAllChildCompanesByCompanyMstrSeq";
    String FETCH_WITHDRAWEE_NAME_BY_JOB = "EmployeeMstr.FetchWithdraweeName";
    String CHECK_EMP_BY_COMPANY_AND_EMAIL = "EmplRefrl.checkEmpbyCompanyAndEmail";
    String CHECK_EMP_BY_COMPANY_AND_PHONE_NO = "EmplRefrl.checkEmpbyCompanyAndPhoneNo";

    String FIND_INTERVIEW_KIT_BY_COMPANY = "InterviewKit.findInterviewKitByCompanyMstrSeq";
    String FIND_INTERVIEW_KIT_MAP_BY_INTERVIEW_SEQ = "InterviewKitMap.findInterviewKitMapByInterviewSeq";
    String FIND_INTERVIEW_QUESTIONS_BY_COMPANY_AND_KIT = "InterviewKitQuestion.findInterviewQuestionsByKit";
    String FIND_PREASSIGNED_STAGE_KIT_MAPPING = "InterviewKit.findPreassignedStageKitMapping";

    String INTERVIEW_KIT_DEFAULT = "DEFAULT";
    String INTERVIEW_KIT_OFF = "OFF";
    String INTERVIEW_KIT_ON_SCHEDULE_OFF = "OFF";

    String INTERVIEW_KIT_ON_JOB_OFF = "OFF";
    String INTERVIEW_KIT_ON_JOB_ON = "ON";

    String INTERVIEW_KIT_ON_HM_REQUEST_OFF = "OFF";

    String FIND_DEFAULT_INTERVIEW_KIT = "InterviewKit.findDefaultInterviewKit";
    String FIND_INTERVIEW_KIT_TAG_MSTR_WITH_TITLE = "InterviewKitTagMstr.findTagMstrWithTitle";
    String FIND_INTERVIEW_FEEDBACK_QUESTION_WITH_TOPIC_DETAILS = "InterviewFeedbackQuestion.findQuestionWithTopicDetails";
    String FIND_ALL_INTERVIEW_KIT_TAG_MSTR_LIKE_TITLE = "InterviewKitTagMstr.findAllTagMstrLikeTitle";
    String GET_JOB_STAGE_KIT_MAPPING = "InterviewKitJobStage.getJobStageKitMapping";
    String FIND_INTERVIEW_KIT_TAG_BY_INTERVIEW_KIT_AND_TAG_SEQ = "InterviewKitTag.getInterviewKitTagByInterviewKitSeqAndTagMstrSeq";
    String FIND_INTERVIEW_KIT_QUESTION_BY_INTERVIEW_KIT_AND_INTERVIEW_FEEDBACK_QUESTION_SEQ = "InterviewKitQuestion.getInterviewKitQuestionByInterviewKitSeqAndInterviewFeedbackSeq";
    String FIND_INTERVIEW_KITS_FOR_JOB_STAGE = "InterviewKitJobStage.findInterviewKitsForJobAndStage";
    String FIND_ASSIGNED_STAGE_KIT_MAPPING = "InterviewKitJobStage.findAssignedStageKitMapping";
    String FETCH_REMOVED_KITS_FROM_STAGE = "InterviewKitJobStage.fetchRemovedKitsFromStage";
    String FIND_KIT_COUNT_JOB_STAGE = "InterviewKitJobStage.findKitCountJobStage";
    String FIND_STAGE_FOR_KIT_MAPPING = "InterviewStageMstr.findStagesForKitMapping";
    String FIND_KIT_COUNT_BY_COMAPNY = "InterviewKit.getKitCountByCompany";

    String FETCH_PREVIOUS_DAY_IJP_JOB_CAND_DETAILS = "Job.fetchPreviousDayIjpJobCandDetails";
    String FETCH_RECRUITER_DETAILS_FOR_JOB = "JobRecruiter.fetchRecruiterDetailsForJob";

    String FETCH_NOTIFY_INTERNAL_JOB_BY_USER_PROFILE_AND_JOB = "NotifyInternalJob.fetchNotifyInternalJobByUserProfileAndJob";
    String FIND_INTERNAL_JOB_ELIGIBILITY_MAPPING="InternalJobEligibilityMapping.findINtrnalJobEligibilityMapping";
    String FIND_CLIENT_INTERNAL_MAPPING_BY_TYPE = "ClientCustomItemsMstr.findClientInternalMappingByType";
    String FETCH_COMPANIES_ALL_JOBS =  "Job.fetchCompaniesAllJobs";
    String FETCH_COMPANIES_ALL_JOBS_COUNT =  "Job.fetchCompaniesAllJobsCount";
    String FETCH_ALL_COMPANIES_BY_CODE =  "CompanyMstr.fetchAllCompaniesByCompanyCd";
    String FIND_EMPL_REWARDS_BY_EMPL_REFRL_AND_JOB_REWARD_RELESE = "EmplRewards.findEmplRewardsforEmplRefrlAndJob";
    String FIND_CANDIDATE_PAGE_LAYOUT_BY_COMPANY_AND_PAGE_CD = "CandidatePageLayout.findCandidatePageLayoutByCompanyAndPageCd";
    String FIND_CANDIDATE_PAGE_REGIONS_BY_COMPANY_AND_PAGE_LAYOUT = "CandidatePageRegions.findCandidatePageRegionsByCompanyAndPageLayout";
    String PAGE_CD = "pageCd";
    String CANDIDATE_PAGE_LAYOUT_SEQ = "candidatePageLayoutSeq";
    String FIND_REDEMPTION_PAYOUT_DETAIL_BY_SEQ = "RedemptionPayoutDetails.findRedemptionPayoutDetailsBySeq";
    String FETCH_ALL_NOT_RELEASED_REWARDS_BY_JOB = "EmplReward.fetchAllNotReleasedRewardsByJobseq";
    String FETCH_PENDING_SMS= "SmsLog.fetchPendingSms";
    String GET_JOB_SMS_TEMPLATES="SmsTemplateConfig.getJobSmsTemplatesByCompany";

    String FETCH_EMP_DETAILS_LIST="EmployeeMstr.fetchEmpDetailsList";
    String FETCH_EMP_COUNT="EmployeeMstr.fetchEmpCount";
    String FETCH_EMP_MSTR_BY_EMP_MSTR_SEQ = "EmployeeMstr.fetchEmployeeMstrByEmployeeMstrSeq";

    String FETCH_ALL_USER_PROFILES_CREATED_BY_USER = "UserProfile.fetchAllUserProfilesCreatedByUser";
    String FIND_EMPL_REFRL_BY_JOB_SEQ_ALL_ENTITY = "EmplRefrl.findEmplRefrlByJobSeqAllEntity";
    String FETCH_ALL_ATTACHMENTS_BY_EMPL_REFRL = "CandidateAttachment.fetchAllAttachmentsByEmplRefrl";

    String FETCH_SMS_SCHEDULE_COUNT_BY_COMPANY = "SmsScheduleDetails.fetchSmsScheduleCountByCompany";
    String FETCH_SMS_SCHEDULES_BY_COMPANY = "SmsScheduleDetails.fetchSmsScheduleByCompany";
    String FIND_PENDING_SMS_BY_SCHEDULE = "SmsLog.findPendingSmsBySchedule";
    String FIND_ALL_ER_JOBS_COMPANY = "Job.findAllErJobsCompany";
    String FETCH_SMS_LOGS_BY_SCHEDULE = "SmsLog.fetchSmsLogsBySchedule";
    String FIND_EMPLOYEE_BY_PHONE = "EmployeeMstr.findEmployeeByPhone";
    String FETCH_ER_JOB_COUNT_ALL_COMPANY="Job.fetchERJobCountAllCompany";
    String FETCH_JOB_COUNT_ALL_COMPANY="Job.fetchTotalJobCountAllCompany";
    String FIND_SMS_TEMPATE_BY_ID="SmsTemplateConfig.findSmsTemplateById";

    String FETCH_TALEO_CAND_BY_CLIENT_ID_AND_APPLICATION_STATUS = "TaleoPreApplication.fetchTaleoCandByClientIDAndApplicationStatus";
    String FIND_ETL_LOGS_BY_UPLOAD_STATUS = "EtlFileLog.getEtlFileLogsByUploadStatus";
    String FIND_DUPLICATE_CANDIDATE_BY_EMAIL = "TaleoPreApplication.findDuplicateCandidateByEmail";
    String FIND_DUPLICATE_CANDIDATE_BY_JOB_AND_EMAIL = "TaleoPreApplication.findDuplicateCandidateByJobAndEmail";
    String FIND_CANDIDATE_NOT_SENT_TO_TALEO = "TaleoPreApplication.findCandidateNotSentToTaleo";
    String FETCH_FIRST_REFERRER = "TaleoPreApplication.fetchFirstReferrer";
    String FETCH_TALEO_APPLICATION_BY_JOB_EMPLREFRL_CID = "TaleoPreApplication.FetchTaleoApplicationByJobEmplRefrlCID";
    String FIND_EMPL_REFRLS_BY_CAND_EMAIL = "EmplRefrl.findEmplRefrlsByCandEmail";
    String FETCH_INTRV_DETAILS_BY_RHID_AND_JOB_CD = "InterviewDetails.FetchRejectionEntryByRHIDAndJobCd";

    String GET_URL_MAPPING = "URLMapping.getURLMapping";
    String FETCH_PENDING_SMS_DETAILS_LOG = "SmsDetailsLog.fetchPendingSmsDetailsLog";
    String FETCH_LATEST_REAPPLY_DATE_FOR_CANDIDATE = "DuplicateCandidateLog.fetchLatestReapplyDateForCandidate";
    String FIND_VENDOR_MSTR_IN_VENDOR_PROFILE_BY_USER_PROFILE_SEQ = "VendorProfile.findVendorMstrByUserProfile";


    String FETCH_EMPLOYEE_BY_PHONE_AND_DOB="EmployeeMstr.fetchEmployeesByPhoneAndDOB";
    String FETCH_EMPLOYEE_BY_NAME_AND_DOB="EmployeeMstr.fetchEmployeesByNameAndDOB";
    String GET_ALL_IJP_EMPLOYEES="EmployeeMstr.GetAllIjpEmployees";

    // IJP
    String IJP_DUPLICACY_MESSAGE = "ijp_duplicacy_message";

    //ICICI Location Code
    String LOCATION_CODE = "locationCode";
    String FETCH_LOCATION_CODE_MAPPING_DATA = "IciciLocationCodeMapping.fetchLocationCodeMappingData";
}

