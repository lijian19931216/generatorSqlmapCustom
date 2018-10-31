package com.luying.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TCtTouchExample {
    /**
     * t_ct_touch
     */
    protected String orderByClause;

    /**
     * t_ct_touch
     */
    protected boolean distinct;

    /**
     * t_ct_touch
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2018-10-31
     */
    public TCtTouchExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbggenerated 2018-10-31
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated 2018-10-31
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated 2018-10-31
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated 2018-10-31
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated 2018-10-31
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated 2018-10-31
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated 2018-10-31
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated 2018-10-31
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @mbggenerated 2018-10-31
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated 2018-10-31
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * t_ct_touch 2018-10-31
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTouchIdIsNull() {
            addCriterion("touch_id is null");
            return (Criteria) this;
        }

        public Criteria andTouchIdIsNotNull() {
            addCriterion("touch_id is not null");
            return (Criteria) this;
        }

        public Criteria andTouchIdEqualTo(Long value) {
            addCriterion("touch_id =", value, "touchId");
            return (Criteria) this;
        }

        public Criteria andTouchIdNotEqualTo(Long value) {
            addCriterion("touch_id <>", value, "touchId");
            return (Criteria) this;
        }

        public Criteria andTouchIdGreaterThan(Long value) {
            addCriterion("touch_id >", value, "touchId");
            return (Criteria) this;
        }

        public Criteria andTouchIdGreaterThanOrEqualTo(Long value) {
            addCriterion("touch_id >=", value, "touchId");
            return (Criteria) this;
        }

        public Criteria andTouchIdLessThan(Long value) {
            addCriterion("touch_id <", value, "touchId");
            return (Criteria) this;
        }

        public Criteria andTouchIdLessThanOrEqualTo(Long value) {
            addCriterion("touch_id <=", value, "touchId");
            return (Criteria) this;
        }

        public Criteria andTouchIdIn(List<Long> values) {
            addCriterion("touch_id in", values, "touchId");
            return (Criteria) this;
        }

        public Criteria andTouchIdNotIn(List<Long> values) {
            addCriterion("touch_id not in", values, "touchId");
            return (Criteria) this;
        }

        public Criteria andTouchIdBetween(Long value1, Long value2) {
            addCriterion("touch_id between", value1, value2, "touchId");
            return (Criteria) this;
        }

        public Criteria andTouchIdNotBetween(Long value1, Long value2) {
            addCriterion("touch_id not between", value1, value2, "touchId");
            return (Criteria) this;
        }

        public Criteria andCrtUserIdIsNull() {
            addCriterion("crt_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCrtUserIdIsNotNull() {
            addCriterion("crt_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCrtUserIdEqualTo(Long value) {
            addCriterion("crt_user_id =", value, "crtUserId");
            return (Criteria) this;
        }

        public Criteria andCrtUserIdNotEqualTo(Long value) {
            addCriterion("crt_user_id <>", value, "crtUserId");
            return (Criteria) this;
        }

        public Criteria andCrtUserIdGreaterThan(Long value) {
            addCriterion("crt_user_id >", value, "crtUserId");
            return (Criteria) this;
        }

        public Criteria andCrtUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("crt_user_id >=", value, "crtUserId");
            return (Criteria) this;
        }

        public Criteria andCrtUserIdLessThan(Long value) {
            addCriterion("crt_user_id <", value, "crtUserId");
            return (Criteria) this;
        }

        public Criteria andCrtUserIdLessThanOrEqualTo(Long value) {
            addCriterion("crt_user_id <=", value, "crtUserId");
            return (Criteria) this;
        }

        public Criteria andCrtUserIdIn(List<Long> values) {
            addCriterion("crt_user_id in", values, "crtUserId");
            return (Criteria) this;
        }

        public Criteria andCrtUserIdNotIn(List<Long> values) {
            addCriterion("crt_user_id not in", values, "crtUserId");
            return (Criteria) this;
        }

        public Criteria andCrtUserIdBetween(Long value1, Long value2) {
            addCriterion("crt_user_id between", value1, value2, "crtUserId");
            return (Criteria) this;
        }

        public Criteria andCrtUserIdNotBetween(Long value1, Long value2) {
            addCriterion("crt_user_id not between", value1, value2, "crtUserId");
            return (Criteria) this;
        }

        public Criteria andCrtTimeIsNull() {
            addCriterion("crt_time is null");
            return (Criteria) this;
        }

        public Criteria andCrtTimeIsNotNull() {
            addCriterion("crt_time is not null");
            return (Criteria) this;
        }

        public Criteria andCrtTimeEqualTo(Date value) {
            addCriterion("crt_time =", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeNotEqualTo(Date value) {
            addCriterion("crt_time <>", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeGreaterThan(Date value) {
            addCriterion("crt_time >", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("crt_time >=", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeLessThan(Date value) {
            addCriterion("crt_time <", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeLessThanOrEqualTo(Date value) {
            addCriterion("crt_time <=", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeIn(List<Date> values) {
            addCriterion("crt_time in", values, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeNotIn(List<Date> values) {
            addCriterion("crt_time not in", values, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeBetween(Date value1, Date value2) {
            addCriterion("crt_time between", value1, value2, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeNotBetween(Date value1, Date value2) {
            addCriterion("crt_time not between", value1, value2, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtAppSysIdIsNull() {
            addCriterion("crt_app_sys_id is null");
            return (Criteria) this;
        }

        public Criteria andCrtAppSysIdIsNotNull() {
            addCriterion("crt_app_sys_id is not null");
            return (Criteria) this;
        }

        public Criteria andCrtAppSysIdEqualTo(String value) {
            addCriterion("crt_app_sys_id =", value, "crtAppSysId");
            return (Criteria) this;
        }

        public Criteria andCrtAppSysIdNotEqualTo(String value) {
            addCriterion("crt_app_sys_id <>", value, "crtAppSysId");
            return (Criteria) this;
        }

        public Criteria andCrtAppSysIdGreaterThan(String value) {
            addCriterion("crt_app_sys_id >", value, "crtAppSysId");
            return (Criteria) this;
        }

        public Criteria andCrtAppSysIdGreaterThanOrEqualTo(String value) {
            addCriterion("crt_app_sys_id >=", value, "crtAppSysId");
            return (Criteria) this;
        }

        public Criteria andCrtAppSysIdLessThan(String value) {
            addCriterion("crt_app_sys_id <", value, "crtAppSysId");
            return (Criteria) this;
        }

        public Criteria andCrtAppSysIdLessThanOrEqualTo(String value) {
            addCriterion("crt_app_sys_id <=", value, "crtAppSysId");
            return (Criteria) this;
        }

        public Criteria andCrtAppSysIdLike(String value) {
            addCriterion("crt_app_sys_id like", value, "crtAppSysId");
            return (Criteria) this;
        }

        public Criteria andCrtAppSysIdNotLike(String value) {
            addCriterion("crt_app_sys_id not like", value, "crtAppSysId");
            return (Criteria) this;
        }

        public Criteria andCrtAppSysIdIn(List<String> values) {
            addCriterion("crt_app_sys_id in", values, "crtAppSysId");
            return (Criteria) this;
        }

        public Criteria andCrtAppSysIdNotIn(List<String> values) {
            addCriterion("crt_app_sys_id not in", values, "crtAppSysId");
            return (Criteria) this;
        }

        public Criteria andCrtAppSysIdBetween(String value1, String value2) {
            addCriterion("crt_app_sys_id between", value1, value2, "crtAppSysId");
            return (Criteria) this;
        }

        public Criteria andCrtAppSysIdNotBetween(String value1, String value2) {
            addCriterion("crt_app_sys_id not between", value1, value2, "crtAppSysId");
            return (Criteria) this;
        }

        public Criteria andModfUserIdIsNull() {
            addCriterion("modf_user_id is null");
            return (Criteria) this;
        }

        public Criteria andModfUserIdIsNotNull() {
            addCriterion("modf_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andModfUserIdEqualTo(Long value) {
            addCriterion("modf_user_id =", value, "modfUserId");
            return (Criteria) this;
        }

        public Criteria andModfUserIdNotEqualTo(Long value) {
            addCriterion("modf_user_id <>", value, "modfUserId");
            return (Criteria) this;
        }

        public Criteria andModfUserIdGreaterThan(Long value) {
            addCriterion("modf_user_id >", value, "modfUserId");
            return (Criteria) this;
        }

        public Criteria andModfUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("modf_user_id >=", value, "modfUserId");
            return (Criteria) this;
        }

        public Criteria andModfUserIdLessThan(Long value) {
            addCriterion("modf_user_id <", value, "modfUserId");
            return (Criteria) this;
        }

        public Criteria andModfUserIdLessThanOrEqualTo(Long value) {
            addCriterion("modf_user_id <=", value, "modfUserId");
            return (Criteria) this;
        }

        public Criteria andModfUserIdIn(List<Long> values) {
            addCriterion("modf_user_id in", values, "modfUserId");
            return (Criteria) this;
        }

        public Criteria andModfUserIdNotIn(List<Long> values) {
            addCriterion("modf_user_id not in", values, "modfUserId");
            return (Criteria) this;
        }

        public Criteria andModfUserIdBetween(Long value1, Long value2) {
            addCriterion("modf_user_id between", value1, value2, "modfUserId");
            return (Criteria) this;
        }

        public Criteria andModfUserIdNotBetween(Long value1, Long value2) {
            addCriterion("modf_user_id not between", value1, value2, "modfUserId");
            return (Criteria) this;
        }

        public Criteria andModfTimeIsNull() {
            addCriterion("modf_time is null");
            return (Criteria) this;
        }

        public Criteria andModfTimeIsNotNull() {
            addCriterion("modf_time is not null");
            return (Criteria) this;
        }

        public Criteria andModfTimeEqualTo(Date value) {
            addCriterion("modf_time =", value, "modfTime");
            return (Criteria) this;
        }

        public Criteria andModfTimeNotEqualTo(Date value) {
            addCriterion("modf_time <>", value, "modfTime");
            return (Criteria) this;
        }

        public Criteria andModfTimeGreaterThan(Date value) {
            addCriterion("modf_time >", value, "modfTime");
            return (Criteria) this;
        }

        public Criteria andModfTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modf_time >=", value, "modfTime");
            return (Criteria) this;
        }

        public Criteria andModfTimeLessThan(Date value) {
            addCriterion("modf_time <", value, "modfTime");
            return (Criteria) this;
        }

        public Criteria andModfTimeLessThanOrEqualTo(Date value) {
            addCriterion("modf_time <=", value, "modfTime");
            return (Criteria) this;
        }

        public Criteria andModfTimeIn(List<Date> values) {
            addCriterion("modf_time in", values, "modfTime");
            return (Criteria) this;
        }

        public Criteria andModfTimeNotIn(List<Date> values) {
            addCriterion("modf_time not in", values, "modfTime");
            return (Criteria) this;
        }

        public Criteria andModfTimeBetween(Date value1, Date value2) {
            addCriterion("modf_time between", value1, value2, "modfTime");
            return (Criteria) this;
        }

        public Criteria andModfTimeNotBetween(Date value1, Date value2) {
            addCriterion("modf_time not between", value1, value2, "modfTime");
            return (Criteria) this;
        }

        public Criteria andModfAppSysIdIsNull() {
            addCriterion("modf_app_sys_id is null");
            return (Criteria) this;
        }

        public Criteria andModfAppSysIdIsNotNull() {
            addCriterion("modf_app_sys_id is not null");
            return (Criteria) this;
        }

        public Criteria andModfAppSysIdEqualTo(String value) {
            addCriterion("modf_app_sys_id =", value, "modfAppSysId");
            return (Criteria) this;
        }

        public Criteria andModfAppSysIdNotEqualTo(String value) {
            addCriterion("modf_app_sys_id <>", value, "modfAppSysId");
            return (Criteria) this;
        }

        public Criteria andModfAppSysIdGreaterThan(String value) {
            addCriterion("modf_app_sys_id >", value, "modfAppSysId");
            return (Criteria) this;
        }

        public Criteria andModfAppSysIdGreaterThanOrEqualTo(String value) {
            addCriterion("modf_app_sys_id >=", value, "modfAppSysId");
            return (Criteria) this;
        }

        public Criteria andModfAppSysIdLessThan(String value) {
            addCriterion("modf_app_sys_id <", value, "modfAppSysId");
            return (Criteria) this;
        }

        public Criteria andModfAppSysIdLessThanOrEqualTo(String value) {
            addCriterion("modf_app_sys_id <=", value, "modfAppSysId");
            return (Criteria) this;
        }

        public Criteria andModfAppSysIdLike(String value) {
            addCriterion("modf_app_sys_id like", value, "modfAppSysId");
            return (Criteria) this;
        }

        public Criteria andModfAppSysIdNotLike(String value) {
            addCriterion("modf_app_sys_id not like", value, "modfAppSysId");
            return (Criteria) this;
        }

        public Criteria andModfAppSysIdIn(List<String> values) {
            addCriterion("modf_app_sys_id in", values, "modfAppSysId");
            return (Criteria) this;
        }

        public Criteria andModfAppSysIdNotIn(List<String> values) {
            addCriterion("modf_app_sys_id not in", values, "modfAppSysId");
            return (Criteria) this;
        }

        public Criteria andModfAppSysIdBetween(String value1, String value2) {
            addCriterion("modf_app_sys_id between", value1, value2, "modfAppSysId");
            return (Criteria) this;
        }

        public Criteria andModfAppSysIdNotBetween(String value1, String value2) {
            addCriterion("modf_app_sys_id not between", value1, value2, "modfAppSysId");
            return (Criteria) this;
        }

        public Criteria andSampIdIsNull() {
            addCriterion("samp_id is null");
            return (Criteria) this;
        }

        public Criteria andSampIdIsNotNull() {
            addCriterion("samp_id is not null");
            return (Criteria) this;
        }

        public Criteria andSampIdEqualTo(Long value) {
            addCriterion("samp_id =", value, "sampId");
            return (Criteria) this;
        }

        public Criteria andSampIdNotEqualTo(Long value) {
            addCriterion("samp_id <>", value, "sampId");
            return (Criteria) this;
        }

        public Criteria andSampIdGreaterThan(Long value) {
            addCriterion("samp_id >", value, "sampId");
            return (Criteria) this;
        }

        public Criteria andSampIdGreaterThanOrEqualTo(Long value) {
            addCriterion("samp_id >=", value, "sampId");
            return (Criteria) this;
        }

        public Criteria andSampIdLessThan(Long value) {
            addCriterion("samp_id <", value, "sampId");
            return (Criteria) this;
        }

        public Criteria andSampIdLessThanOrEqualTo(Long value) {
            addCriterion("samp_id <=", value, "sampId");
            return (Criteria) this;
        }

        public Criteria andSampIdIn(List<Long> values) {
            addCriterion("samp_id in", values, "sampId");
            return (Criteria) this;
        }

        public Criteria andSampIdNotIn(List<Long> values) {
            addCriterion("samp_id not in", values, "sampId");
            return (Criteria) this;
        }

        public Criteria andSampIdBetween(Long value1, Long value2) {
            addCriterion("samp_id between", value1, value2, "sampId");
            return (Criteria) this;
        }

        public Criteria andSampIdNotBetween(Long value1, Long value2) {
            addCriterion("samp_id not between", value1, value2, "sampId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNull() {
            addCriterion("task_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("task_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(Long value) {
            addCriterion("task_id =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(Long value) {
            addCriterion("task_id <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(Long value) {
            addCriterion("task_id >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(Long value) {
            addCriterion("task_id >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(Long value) {
            addCriterion("task_id <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(Long value) {
            addCriterion("task_id <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<Long> values) {
            addCriterion("task_id in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<Long> values) {
            addCriterion("task_id not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(Long value1, Long value2) {
            addCriterion("task_id between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(Long value1, Long value2) {
            addCriterion("task_id not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskQualifyIdIsNull() {
            addCriterion("task_qualify_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskQualifyIdIsNotNull() {
            addCriterion("task_qualify_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskQualifyIdEqualTo(Long value) {
            addCriterion("task_qualify_id =", value, "taskQualifyId");
            return (Criteria) this;
        }

        public Criteria andTaskQualifyIdNotEqualTo(Long value) {
            addCriterion("task_qualify_id <>", value, "taskQualifyId");
            return (Criteria) this;
        }

        public Criteria andTaskQualifyIdGreaterThan(Long value) {
            addCriterion("task_qualify_id >", value, "taskQualifyId");
            return (Criteria) this;
        }

        public Criteria andTaskQualifyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("task_qualify_id >=", value, "taskQualifyId");
            return (Criteria) this;
        }

        public Criteria andTaskQualifyIdLessThan(Long value) {
            addCriterion("task_qualify_id <", value, "taskQualifyId");
            return (Criteria) this;
        }

        public Criteria andTaskQualifyIdLessThanOrEqualTo(Long value) {
            addCriterion("task_qualify_id <=", value, "taskQualifyId");
            return (Criteria) this;
        }

        public Criteria andTaskQualifyIdIn(List<Long> values) {
            addCriterion("task_qualify_id in", values, "taskQualifyId");
            return (Criteria) this;
        }

        public Criteria andTaskQualifyIdNotIn(List<Long> values) {
            addCriterion("task_qualify_id not in", values, "taskQualifyId");
            return (Criteria) this;
        }

        public Criteria andTaskQualifyIdBetween(Long value1, Long value2) {
            addCriterion("task_qualify_id between", value1, value2, "taskQualifyId");
            return (Criteria) this;
        }

        public Criteria andTaskQualifyIdNotBetween(Long value1, Long value2) {
            addCriterion("task_qualify_id not between", value1, value2, "taskQualifyId");
            return (Criteria) this;
        }

        public Criteria andSeatIdIsNull() {
            addCriterion("seat_id is null");
            return (Criteria) this;
        }

        public Criteria andSeatIdIsNotNull() {
            addCriterion("seat_id is not null");
            return (Criteria) this;
        }

        public Criteria andSeatIdEqualTo(Long value) {
            addCriterion("seat_id =", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdNotEqualTo(Long value) {
            addCriterion("seat_id <>", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdGreaterThan(Long value) {
            addCriterion("seat_id >", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdGreaterThanOrEqualTo(Long value) {
            addCriterion("seat_id >=", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdLessThan(Long value) {
            addCriterion("seat_id <", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdLessThanOrEqualTo(Long value) {
            addCriterion("seat_id <=", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdIn(List<Long> values) {
            addCriterion("seat_id in", values, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdNotIn(List<Long> values) {
            addCriterion("seat_id not in", values, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdBetween(Long value1, Long value2) {
            addCriterion("seat_id between", value1, value2, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdNotBetween(Long value1, Long value2) {
            addCriterion("seat_id not between", value1, value2, "seatId");
            return (Criteria) this;
        }

        public Criteria andCtiAgentIdIsNull() {
            addCriterion("cti_agent_id is null");
            return (Criteria) this;
        }

        public Criteria andCtiAgentIdIsNotNull() {
            addCriterion("cti_agent_id is not null");
            return (Criteria) this;
        }

        public Criteria andCtiAgentIdEqualTo(String value) {
            addCriterion("cti_agent_id =", value, "ctiAgentId");
            return (Criteria) this;
        }

        public Criteria andCtiAgentIdNotEqualTo(String value) {
            addCriterion("cti_agent_id <>", value, "ctiAgentId");
            return (Criteria) this;
        }

        public Criteria andCtiAgentIdGreaterThan(String value) {
            addCriterion("cti_agent_id >", value, "ctiAgentId");
            return (Criteria) this;
        }

        public Criteria andCtiAgentIdGreaterThanOrEqualTo(String value) {
            addCriterion("cti_agent_id >=", value, "ctiAgentId");
            return (Criteria) this;
        }

        public Criteria andCtiAgentIdLessThan(String value) {
            addCriterion("cti_agent_id <", value, "ctiAgentId");
            return (Criteria) this;
        }

        public Criteria andCtiAgentIdLessThanOrEqualTo(String value) {
            addCriterion("cti_agent_id <=", value, "ctiAgentId");
            return (Criteria) this;
        }

        public Criteria andCtiAgentIdLike(String value) {
            addCriterion("cti_agent_id like", value, "ctiAgentId");
            return (Criteria) this;
        }

        public Criteria andCtiAgentIdNotLike(String value) {
            addCriterion("cti_agent_id not like", value, "ctiAgentId");
            return (Criteria) this;
        }

        public Criteria andCtiAgentIdIn(List<String> values) {
            addCriterion("cti_agent_id in", values, "ctiAgentId");
            return (Criteria) this;
        }

        public Criteria andCtiAgentIdNotIn(List<String> values) {
            addCriterion("cti_agent_id not in", values, "ctiAgentId");
            return (Criteria) this;
        }

        public Criteria andCtiAgentIdBetween(String value1, String value2) {
            addCriterion("cti_agent_id between", value1, value2, "ctiAgentId");
            return (Criteria) this;
        }

        public Criteria andCtiAgentIdNotBetween(String value1, String value2) {
            addCriterion("cti_agent_id not between", value1, value2, "ctiAgentId");
            return (Criteria) this;
        }

        public Criteria andSpOrgIdIsNull() {
            addCriterion("sp_org_id is null");
            return (Criteria) this;
        }

        public Criteria andSpOrgIdIsNotNull() {
            addCriterion("sp_org_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpOrgIdEqualTo(Long value) {
            addCriterion("sp_org_id =", value, "spOrgId");
            return (Criteria) this;
        }

        public Criteria andSpOrgIdNotEqualTo(Long value) {
            addCriterion("sp_org_id <>", value, "spOrgId");
            return (Criteria) this;
        }

        public Criteria andSpOrgIdGreaterThan(Long value) {
            addCriterion("sp_org_id >", value, "spOrgId");
            return (Criteria) this;
        }

        public Criteria andSpOrgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sp_org_id >=", value, "spOrgId");
            return (Criteria) this;
        }

        public Criteria andSpOrgIdLessThan(Long value) {
            addCriterion("sp_org_id <", value, "spOrgId");
            return (Criteria) this;
        }

        public Criteria andSpOrgIdLessThanOrEqualTo(Long value) {
            addCriterion("sp_org_id <=", value, "spOrgId");
            return (Criteria) this;
        }

        public Criteria andSpOrgIdIn(List<Long> values) {
            addCriterion("sp_org_id in", values, "spOrgId");
            return (Criteria) this;
        }

        public Criteria andSpOrgIdNotIn(List<Long> values) {
            addCriterion("sp_org_id not in", values, "spOrgId");
            return (Criteria) this;
        }

        public Criteria andSpOrgIdBetween(Long value1, Long value2) {
            addCriterion("sp_org_id between", value1, value2, "spOrgId");
            return (Criteria) this;
        }

        public Criteria andSpOrgIdNotBetween(Long value1, Long value2) {
            addCriterion("sp_org_id not between", value1, value2, "spOrgId");
            return (Criteria) this;
        }

        public Criteria andErOrgIdIsNull() {
            addCriterion("er_org_id is null");
            return (Criteria) this;
        }

        public Criteria andErOrgIdIsNotNull() {
            addCriterion("er_org_id is not null");
            return (Criteria) this;
        }

        public Criteria andErOrgIdEqualTo(Long value) {
            addCriterion("er_org_id =", value, "erOrgId");
            return (Criteria) this;
        }

        public Criteria andErOrgIdNotEqualTo(Long value) {
            addCriterion("er_org_id <>", value, "erOrgId");
            return (Criteria) this;
        }

        public Criteria andErOrgIdGreaterThan(Long value) {
            addCriterion("er_org_id >", value, "erOrgId");
            return (Criteria) this;
        }

        public Criteria andErOrgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("er_org_id >=", value, "erOrgId");
            return (Criteria) this;
        }

        public Criteria andErOrgIdLessThan(Long value) {
            addCriterion("er_org_id <", value, "erOrgId");
            return (Criteria) this;
        }

        public Criteria andErOrgIdLessThanOrEqualTo(Long value) {
            addCriterion("er_org_id <=", value, "erOrgId");
            return (Criteria) this;
        }

        public Criteria andErOrgIdIn(List<Long> values) {
            addCriterion("er_org_id in", values, "erOrgId");
            return (Criteria) this;
        }

        public Criteria andErOrgIdNotIn(List<Long> values) {
            addCriterion("er_org_id not in", values, "erOrgId");
            return (Criteria) this;
        }

        public Criteria andErOrgIdBetween(Long value1, Long value2) {
            addCriterion("er_org_id between", value1, value2, "erOrgId");
            return (Criteria) this;
        }

        public Criteria andErOrgIdNotBetween(Long value1, Long value2) {
            addCriterion("er_org_id not between", value1, value2, "erOrgId");
            return (Criteria) this;
        }

        public Criteria andTouchModeCdIsNull() {
            addCriterion("touch_mode_cd is null");
            return (Criteria) this;
        }

        public Criteria andTouchModeCdIsNotNull() {
            addCriterion("touch_mode_cd is not null");
            return (Criteria) this;
        }

        public Criteria andTouchModeCdEqualTo(String value) {
            addCriterion("touch_mode_cd =", value, "touchModeCd");
            return (Criteria) this;
        }

        public Criteria andTouchModeCdNotEqualTo(String value) {
            addCriterion("touch_mode_cd <>", value, "touchModeCd");
            return (Criteria) this;
        }

        public Criteria andTouchModeCdGreaterThan(String value) {
            addCriterion("touch_mode_cd >", value, "touchModeCd");
            return (Criteria) this;
        }

        public Criteria andTouchModeCdGreaterThanOrEqualTo(String value) {
            addCriterion("touch_mode_cd >=", value, "touchModeCd");
            return (Criteria) this;
        }

        public Criteria andTouchModeCdLessThan(String value) {
            addCriterion("touch_mode_cd <", value, "touchModeCd");
            return (Criteria) this;
        }

        public Criteria andTouchModeCdLessThanOrEqualTo(String value) {
            addCriterion("touch_mode_cd <=", value, "touchModeCd");
            return (Criteria) this;
        }

        public Criteria andTouchModeCdLike(String value) {
            addCriterion("touch_mode_cd like", value, "touchModeCd");
            return (Criteria) this;
        }

        public Criteria andTouchModeCdNotLike(String value) {
            addCriterion("touch_mode_cd not like", value, "touchModeCd");
            return (Criteria) this;
        }

        public Criteria andTouchModeCdIn(List<String> values) {
            addCriterion("touch_mode_cd in", values, "touchModeCd");
            return (Criteria) this;
        }

        public Criteria andTouchModeCdNotIn(List<String> values) {
            addCriterion("touch_mode_cd not in", values, "touchModeCd");
            return (Criteria) this;
        }

        public Criteria andTouchModeCdBetween(String value1, String value2) {
            addCriterion("touch_mode_cd between", value1, value2, "touchModeCd");
            return (Criteria) this;
        }

        public Criteria andTouchModeCdNotBetween(String value1, String value2) {
            addCriterion("touch_mode_cd not between", value1, value2, "touchModeCd");
            return (Criteria) this;
        }

        public Criteria andTouchBgnTimeIsNull() {
            addCriterion("touch_bgn_time is null");
            return (Criteria) this;
        }

        public Criteria andTouchBgnTimeIsNotNull() {
            addCriterion("touch_bgn_time is not null");
            return (Criteria) this;
        }

        public Criteria andTouchBgnTimeEqualTo(Date value) {
            addCriterion("touch_bgn_time =", value, "touchBgnTime");
            return (Criteria) this;
        }

        public Criteria andTouchBgnTimeNotEqualTo(Date value) {
            addCriterion("touch_bgn_time <>", value, "touchBgnTime");
            return (Criteria) this;
        }

        public Criteria andTouchBgnTimeGreaterThan(Date value) {
            addCriterion("touch_bgn_time >", value, "touchBgnTime");
            return (Criteria) this;
        }

        public Criteria andTouchBgnTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("touch_bgn_time >=", value, "touchBgnTime");
            return (Criteria) this;
        }

        public Criteria andTouchBgnTimeLessThan(Date value) {
            addCriterion("touch_bgn_time <", value, "touchBgnTime");
            return (Criteria) this;
        }

        public Criteria andTouchBgnTimeLessThanOrEqualTo(Date value) {
            addCriterion("touch_bgn_time <=", value, "touchBgnTime");
            return (Criteria) this;
        }

        public Criteria andTouchBgnTimeIn(List<Date> values) {
            addCriterion("touch_bgn_time in", values, "touchBgnTime");
            return (Criteria) this;
        }

        public Criteria andTouchBgnTimeNotIn(List<Date> values) {
            addCriterion("touch_bgn_time not in", values, "touchBgnTime");
            return (Criteria) this;
        }

        public Criteria andTouchBgnTimeBetween(Date value1, Date value2) {
            addCriterion("touch_bgn_time between", value1, value2, "touchBgnTime");
            return (Criteria) this;
        }

        public Criteria andTouchBgnTimeNotBetween(Date value1, Date value2) {
            addCriterion("touch_bgn_time not between", value1, value2, "touchBgnTime");
            return (Criteria) this;
        }

        public Criteria andTouchFinishTimeIsNull() {
            addCriterion("touch_finish_time is null");
            return (Criteria) this;
        }

        public Criteria andTouchFinishTimeIsNotNull() {
            addCriterion("touch_finish_time is not null");
            return (Criteria) this;
        }

        public Criteria andTouchFinishTimeEqualTo(Date value) {
            addCriterion("touch_finish_time =", value, "touchFinishTime");
            return (Criteria) this;
        }

        public Criteria andTouchFinishTimeNotEqualTo(Date value) {
            addCriterion("touch_finish_time <>", value, "touchFinishTime");
            return (Criteria) this;
        }

        public Criteria andTouchFinishTimeGreaterThan(Date value) {
            addCriterion("touch_finish_time >", value, "touchFinishTime");
            return (Criteria) this;
        }

        public Criteria andTouchFinishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("touch_finish_time >=", value, "touchFinishTime");
            return (Criteria) this;
        }

        public Criteria andTouchFinishTimeLessThan(Date value) {
            addCriterion("touch_finish_time <", value, "touchFinishTime");
            return (Criteria) this;
        }

        public Criteria andTouchFinishTimeLessThanOrEqualTo(Date value) {
            addCriterion("touch_finish_time <=", value, "touchFinishTime");
            return (Criteria) this;
        }

        public Criteria andTouchFinishTimeIn(List<Date> values) {
            addCriterion("touch_finish_time in", values, "touchFinishTime");
            return (Criteria) this;
        }

        public Criteria andTouchFinishTimeNotIn(List<Date> values) {
            addCriterion("touch_finish_time not in", values, "touchFinishTime");
            return (Criteria) this;
        }

        public Criteria andTouchFinishTimeBetween(Date value1, Date value2) {
            addCriterion("touch_finish_time between", value1, value2, "touchFinishTime");
            return (Criteria) this;
        }

        public Criteria andTouchFinishTimeNotBetween(Date value1, Date value2) {
            addCriterion("touch_finish_time not between", value1, value2, "touchFinishTime");
            return (Criteria) this;
        }

        public Criteria andCallSeatMarkCnttIsNull() {
            addCriterion("call_seat_mark_cntt is null");
            return (Criteria) this;
        }

        public Criteria andCallSeatMarkCnttIsNotNull() {
            addCriterion("call_seat_mark_cntt is not null");
            return (Criteria) this;
        }

        public Criteria andCallSeatMarkCnttEqualTo(String value) {
            addCriterion("call_seat_mark_cntt =", value, "callSeatMarkCntt");
            return (Criteria) this;
        }

        public Criteria andCallSeatMarkCnttNotEqualTo(String value) {
            addCriterion("call_seat_mark_cntt <>", value, "callSeatMarkCntt");
            return (Criteria) this;
        }

        public Criteria andCallSeatMarkCnttGreaterThan(String value) {
            addCriterion("call_seat_mark_cntt >", value, "callSeatMarkCntt");
            return (Criteria) this;
        }

        public Criteria andCallSeatMarkCnttGreaterThanOrEqualTo(String value) {
            addCriterion("call_seat_mark_cntt >=", value, "callSeatMarkCntt");
            return (Criteria) this;
        }

        public Criteria andCallSeatMarkCnttLessThan(String value) {
            addCriterion("call_seat_mark_cntt <", value, "callSeatMarkCntt");
            return (Criteria) this;
        }

        public Criteria andCallSeatMarkCnttLessThanOrEqualTo(String value) {
            addCriterion("call_seat_mark_cntt <=", value, "callSeatMarkCntt");
            return (Criteria) this;
        }

        public Criteria andCallSeatMarkCnttLike(String value) {
            addCriterion("call_seat_mark_cntt like", value, "callSeatMarkCntt");
            return (Criteria) this;
        }

        public Criteria andCallSeatMarkCnttNotLike(String value) {
            addCriterion("call_seat_mark_cntt not like", value, "callSeatMarkCntt");
            return (Criteria) this;
        }

        public Criteria andCallSeatMarkCnttIn(List<String> values) {
            addCriterion("call_seat_mark_cntt in", values, "callSeatMarkCntt");
            return (Criteria) this;
        }

        public Criteria andCallSeatMarkCnttNotIn(List<String> values) {
            addCriterion("call_seat_mark_cntt not in", values, "callSeatMarkCntt");
            return (Criteria) this;
        }

        public Criteria andCallSeatMarkCnttBetween(String value1, String value2) {
            addCriterion("call_seat_mark_cntt between", value1, value2, "callSeatMarkCntt");
            return (Criteria) this;
        }

        public Criteria andCallSeatMarkCnttNotBetween(String value1, String value2) {
            addCriterion("call_seat_mark_cntt not between", value1, value2, "callSeatMarkCntt");
            return (Criteria) this;
        }

        public Criteria andCallMarkCnttIsNull() {
            addCriterion("call_mark_cntt is null");
            return (Criteria) this;
        }

        public Criteria andCallMarkCnttIsNotNull() {
            addCriterion("call_mark_cntt is not null");
            return (Criteria) this;
        }

        public Criteria andCallMarkCnttEqualTo(String value) {
            addCriterion("call_mark_cntt =", value, "callMarkCntt");
            return (Criteria) this;
        }

        public Criteria andCallMarkCnttNotEqualTo(String value) {
            addCriterion("call_mark_cntt <>", value, "callMarkCntt");
            return (Criteria) this;
        }

        public Criteria andCallMarkCnttGreaterThan(String value) {
            addCriterion("call_mark_cntt >", value, "callMarkCntt");
            return (Criteria) this;
        }

        public Criteria andCallMarkCnttGreaterThanOrEqualTo(String value) {
            addCriterion("call_mark_cntt >=", value, "callMarkCntt");
            return (Criteria) this;
        }

        public Criteria andCallMarkCnttLessThan(String value) {
            addCriterion("call_mark_cntt <", value, "callMarkCntt");
            return (Criteria) this;
        }

        public Criteria andCallMarkCnttLessThanOrEqualTo(String value) {
            addCriterion("call_mark_cntt <=", value, "callMarkCntt");
            return (Criteria) this;
        }

        public Criteria andCallMarkCnttLike(String value) {
            addCriterion("call_mark_cntt like", value, "callMarkCntt");
            return (Criteria) this;
        }

        public Criteria andCallMarkCnttNotLike(String value) {
            addCriterion("call_mark_cntt not like", value, "callMarkCntt");
            return (Criteria) this;
        }

        public Criteria andCallMarkCnttIn(List<String> values) {
            addCriterion("call_mark_cntt in", values, "callMarkCntt");
            return (Criteria) this;
        }

        public Criteria andCallMarkCnttNotIn(List<String> values) {
            addCriterion("call_mark_cntt not in", values, "callMarkCntt");
            return (Criteria) this;
        }

        public Criteria andCallMarkCnttBetween(String value1, String value2) {
            addCriterion("call_mark_cntt between", value1, value2, "callMarkCntt");
            return (Criteria) this;
        }

        public Criteria andCallMarkCnttNotBetween(String value1, String value2) {
            addCriterion("call_mark_cntt not between", value1, value2, "callMarkCntt");
            return (Criteria) this;
        }

        public Criteria andOpAgentIdIsNull() {
            addCriterion("op_agent_id is null");
            return (Criteria) this;
        }

        public Criteria andOpAgentIdIsNotNull() {
            addCriterion("op_agent_id is not null");
            return (Criteria) this;
        }

        public Criteria andOpAgentIdEqualTo(String value) {
            addCriterion("op_agent_id =", value, "opAgentId");
            return (Criteria) this;
        }

        public Criteria andOpAgentIdNotEqualTo(String value) {
            addCriterion("op_agent_id <>", value, "opAgentId");
            return (Criteria) this;
        }

        public Criteria andOpAgentIdGreaterThan(String value) {
            addCriterion("op_agent_id >", value, "opAgentId");
            return (Criteria) this;
        }

        public Criteria andOpAgentIdGreaterThanOrEqualTo(String value) {
            addCriterion("op_agent_id >=", value, "opAgentId");
            return (Criteria) this;
        }

        public Criteria andOpAgentIdLessThan(String value) {
            addCriterion("op_agent_id <", value, "opAgentId");
            return (Criteria) this;
        }

        public Criteria andOpAgentIdLessThanOrEqualTo(String value) {
            addCriterion("op_agent_id <=", value, "opAgentId");
            return (Criteria) this;
        }

        public Criteria andOpAgentIdLike(String value) {
            addCriterion("op_agent_id like", value, "opAgentId");
            return (Criteria) this;
        }

        public Criteria andOpAgentIdNotLike(String value) {
            addCriterion("op_agent_id not like", value, "opAgentId");
            return (Criteria) this;
        }

        public Criteria andOpAgentIdIn(List<String> values) {
            addCriterion("op_agent_id in", values, "opAgentId");
            return (Criteria) this;
        }

        public Criteria andOpAgentIdNotIn(List<String> values) {
            addCriterion("op_agent_id not in", values, "opAgentId");
            return (Criteria) this;
        }

        public Criteria andOpAgentIdBetween(String value1, String value2) {
            addCriterion("op_agent_id between", value1, value2, "opAgentId");
            return (Criteria) this;
        }

        public Criteria andOpAgentIdNotBetween(String value1, String value2) {
            addCriterion("op_agent_id not between", value1, value2, "opAgentId");
            return (Criteria) this;
        }

        public Criteria andAgentDnIsNull() {
            addCriterion("agent_dn is null");
            return (Criteria) this;
        }

        public Criteria andAgentDnIsNotNull() {
            addCriterion("agent_dn is not null");
            return (Criteria) this;
        }

        public Criteria andAgentDnEqualTo(String value) {
            addCriterion("agent_dn =", value, "agentDn");
            return (Criteria) this;
        }

        public Criteria andAgentDnNotEqualTo(String value) {
            addCriterion("agent_dn <>", value, "agentDn");
            return (Criteria) this;
        }

        public Criteria andAgentDnGreaterThan(String value) {
            addCriterion("agent_dn >", value, "agentDn");
            return (Criteria) this;
        }

        public Criteria andAgentDnGreaterThanOrEqualTo(String value) {
            addCriterion("agent_dn >=", value, "agentDn");
            return (Criteria) this;
        }

        public Criteria andAgentDnLessThan(String value) {
            addCriterion("agent_dn <", value, "agentDn");
            return (Criteria) this;
        }

        public Criteria andAgentDnLessThanOrEqualTo(String value) {
            addCriterion("agent_dn <=", value, "agentDn");
            return (Criteria) this;
        }

        public Criteria andAgentDnLike(String value) {
            addCriterion("agent_dn like", value, "agentDn");
            return (Criteria) this;
        }

        public Criteria andAgentDnNotLike(String value) {
            addCriterion("agent_dn not like", value, "agentDn");
            return (Criteria) this;
        }

        public Criteria andAgentDnIn(List<String> values) {
            addCriterion("agent_dn in", values, "agentDn");
            return (Criteria) this;
        }

        public Criteria andAgentDnNotIn(List<String> values) {
            addCriterion("agent_dn not in", values, "agentDn");
            return (Criteria) this;
        }

        public Criteria andAgentDnBetween(String value1, String value2) {
            addCriterion("agent_dn between", value1, value2, "agentDn");
            return (Criteria) this;
        }

        public Criteria andAgentDnNotBetween(String value1, String value2) {
            addCriterion("agent_dn not between", value1, value2, "agentDn");
            return (Criteria) this;
        }

        public Criteria andServiceDirectIsNull() {
            addCriterion("service_direct is null");
            return (Criteria) this;
        }

        public Criteria andServiceDirectIsNotNull() {
            addCriterion("service_direct is not null");
            return (Criteria) this;
        }

        public Criteria andServiceDirectEqualTo(String value) {
            addCriterion("service_direct =", value, "serviceDirect");
            return (Criteria) this;
        }

        public Criteria andServiceDirectNotEqualTo(String value) {
            addCriterion("service_direct <>", value, "serviceDirect");
            return (Criteria) this;
        }

        public Criteria andServiceDirectGreaterThan(String value) {
            addCriterion("service_direct >", value, "serviceDirect");
            return (Criteria) this;
        }

        public Criteria andServiceDirectGreaterThanOrEqualTo(String value) {
            addCriterion("service_direct >=", value, "serviceDirect");
            return (Criteria) this;
        }

        public Criteria andServiceDirectLessThan(String value) {
            addCriterion("service_direct <", value, "serviceDirect");
            return (Criteria) this;
        }

        public Criteria andServiceDirectLessThanOrEqualTo(String value) {
            addCriterion("service_direct <=", value, "serviceDirect");
            return (Criteria) this;
        }

        public Criteria andServiceDirectLike(String value) {
            addCriterion("service_direct like", value, "serviceDirect");
            return (Criteria) this;
        }

        public Criteria andServiceDirectNotLike(String value) {
            addCriterion("service_direct not like", value, "serviceDirect");
            return (Criteria) this;
        }

        public Criteria andServiceDirectIn(List<String> values) {
            addCriterion("service_direct in", values, "serviceDirect");
            return (Criteria) this;
        }

        public Criteria andServiceDirectNotIn(List<String> values) {
            addCriterion("service_direct not in", values, "serviceDirect");
            return (Criteria) this;
        }

        public Criteria andServiceDirectBetween(String value1, String value2) {
            addCriterion("service_direct between", value1, value2, "serviceDirect");
            return (Criteria) this;
        }

        public Criteria andServiceDirectNotBetween(String value1, String value2) {
            addCriterion("service_direct not between", value1, value2, "serviceDirect");
            return (Criteria) this;
        }

        public Criteria andCallingNumIsNull() {
            addCriterion("calling_num is null");
            return (Criteria) this;
        }

        public Criteria andCallingNumIsNotNull() {
            addCriterion("calling_num is not null");
            return (Criteria) this;
        }

        public Criteria andCallingNumEqualTo(String value) {
            addCriterion("calling_num =", value, "callingNum");
            return (Criteria) this;
        }

        public Criteria andCallingNumNotEqualTo(String value) {
            addCriterion("calling_num <>", value, "callingNum");
            return (Criteria) this;
        }

        public Criteria andCallingNumGreaterThan(String value) {
            addCriterion("calling_num >", value, "callingNum");
            return (Criteria) this;
        }

        public Criteria andCallingNumGreaterThanOrEqualTo(String value) {
            addCriterion("calling_num >=", value, "callingNum");
            return (Criteria) this;
        }

        public Criteria andCallingNumLessThan(String value) {
            addCriterion("calling_num <", value, "callingNum");
            return (Criteria) this;
        }

        public Criteria andCallingNumLessThanOrEqualTo(String value) {
            addCriterion("calling_num <=", value, "callingNum");
            return (Criteria) this;
        }

        public Criteria andCallingNumLike(String value) {
            addCriterion("calling_num like", value, "callingNum");
            return (Criteria) this;
        }

        public Criteria andCallingNumNotLike(String value) {
            addCriterion("calling_num not like", value, "callingNum");
            return (Criteria) this;
        }

        public Criteria andCallingNumIn(List<String> values) {
            addCriterion("calling_num in", values, "callingNum");
            return (Criteria) this;
        }

        public Criteria andCallingNumNotIn(List<String> values) {
            addCriterion("calling_num not in", values, "callingNum");
            return (Criteria) this;
        }

        public Criteria andCallingNumBetween(String value1, String value2) {
            addCriterion("calling_num between", value1, value2, "callingNum");
            return (Criteria) this;
        }

        public Criteria andCallingNumNotBetween(String value1, String value2) {
            addCriterion("calling_num not between", value1, value2, "callingNum");
            return (Criteria) this;
        }

        public Criteria andCalledNumIsNull() {
            addCriterion("called_num is null");
            return (Criteria) this;
        }

        public Criteria andCalledNumIsNotNull() {
            addCriterion("called_num is not null");
            return (Criteria) this;
        }

        public Criteria andCalledNumEqualTo(String value) {
            addCriterion("called_num =", value, "calledNum");
            return (Criteria) this;
        }

        public Criteria andCalledNumNotEqualTo(String value) {
            addCriterion("called_num <>", value, "calledNum");
            return (Criteria) this;
        }

        public Criteria andCalledNumGreaterThan(String value) {
            addCriterion("called_num >", value, "calledNum");
            return (Criteria) this;
        }

        public Criteria andCalledNumGreaterThanOrEqualTo(String value) {
            addCriterion("called_num >=", value, "calledNum");
            return (Criteria) this;
        }

        public Criteria andCalledNumLessThan(String value) {
            addCriterion("called_num <", value, "calledNum");
            return (Criteria) this;
        }

        public Criteria andCalledNumLessThanOrEqualTo(String value) {
            addCriterion("called_num <=", value, "calledNum");
            return (Criteria) this;
        }

        public Criteria andCalledNumLike(String value) {
            addCriterion("called_num like", value, "calledNum");
            return (Criteria) this;
        }

        public Criteria andCalledNumNotLike(String value) {
            addCriterion("called_num not like", value, "calledNum");
            return (Criteria) this;
        }

        public Criteria andCalledNumIn(List<String> values) {
            addCriterion("called_num in", values, "calledNum");
            return (Criteria) this;
        }

        public Criteria andCalledNumNotIn(List<String> values) {
            addCriterion("called_num not in", values, "calledNum");
            return (Criteria) this;
        }

        public Criteria andCalledNumBetween(String value1, String value2) {
            addCriterion("called_num between", value1, value2, "calledNum");
            return (Criteria) this;
        }

        public Criteria andCalledNumNotBetween(String value1, String value2) {
            addCriterion("called_num not between", value1, value2, "calledNum");
            return (Criteria) this;
        }

        public Criteria andCalledCustNumIsNull() {
            addCriterion("called_cust_num is null");
            return (Criteria) this;
        }

        public Criteria andCalledCustNumIsNotNull() {
            addCriterion("called_cust_num is not null");
            return (Criteria) this;
        }

        public Criteria andCalledCustNumEqualTo(String value) {
            addCriterion("called_cust_num =", value, "calledCustNum");
            return (Criteria) this;
        }

        public Criteria andCalledCustNumNotEqualTo(String value) {
            addCriterion("called_cust_num <>", value, "calledCustNum");
            return (Criteria) this;
        }

        public Criteria andCalledCustNumGreaterThan(String value) {
            addCriterion("called_cust_num >", value, "calledCustNum");
            return (Criteria) this;
        }

        public Criteria andCalledCustNumGreaterThanOrEqualTo(String value) {
            addCriterion("called_cust_num >=", value, "calledCustNum");
            return (Criteria) this;
        }

        public Criteria andCalledCustNumLessThan(String value) {
            addCriterion("called_cust_num <", value, "calledCustNum");
            return (Criteria) this;
        }

        public Criteria andCalledCustNumLessThanOrEqualTo(String value) {
            addCriterion("called_cust_num <=", value, "calledCustNum");
            return (Criteria) this;
        }

        public Criteria andCalledCustNumLike(String value) {
            addCriterion("called_cust_num like", value, "calledCustNum");
            return (Criteria) this;
        }

        public Criteria andCalledCustNumNotLike(String value) {
            addCriterion("called_cust_num not like", value, "calledCustNum");
            return (Criteria) this;
        }

        public Criteria andCalledCustNumIn(List<String> values) {
            addCriterion("called_cust_num in", values, "calledCustNum");
            return (Criteria) this;
        }

        public Criteria andCalledCustNumNotIn(List<String> values) {
            addCriterion("called_cust_num not in", values, "calledCustNum");
            return (Criteria) this;
        }

        public Criteria andCalledCustNumBetween(String value1, String value2) {
            addCriterion("called_cust_num between", value1, value2, "calledCustNum");
            return (Criteria) this;
        }

        public Criteria andCalledCustNumNotBetween(String value1, String value2) {
            addCriterion("called_cust_num not between", value1, value2, "calledCustNum");
            return (Criteria) this;
        }

        public Criteria andCalledCustNameIsNull() {
            addCriterion("called_cust_name is null");
            return (Criteria) this;
        }

        public Criteria andCalledCustNameIsNotNull() {
            addCriterion("called_cust_name is not null");
            return (Criteria) this;
        }

        public Criteria andCalledCustNameEqualTo(String value) {
            addCriterion("called_cust_name =", value, "calledCustName");
            return (Criteria) this;
        }

        public Criteria andCalledCustNameNotEqualTo(String value) {
            addCriterion("called_cust_name <>", value, "calledCustName");
            return (Criteria) this;
        }

        public Criteria andCalledCustNameGreaterThan(String value) {
            addCriterion("called_cust_name >", value, "calledCustName");
            return (Criteria) this;
        }

        public Criteria andCalledCustNameGreaterThanOrEqualTo(String value) {
            addCriterion("called_cust_name >=", value, "calledCustName");
            return (Criteria) this;
        }

        public Criteria andCalledCustNameLessThan(String value) {
            addCriterion("called_cust_name <", value, "calledCustName");
            return (Criteria) this;
        }

        public Criteria andCalledCustNameLessThanOrEqualTo(String value) {
            addCriterion("called_cust_name <=", value, "calledCustName");
            return (Criteria) this;
        }

        public Criteria andCalledCustNameLike(String value) {
            addCriterion("called_cust_name like", value, "calledCustName");
            return (Criteria) this;
        }

        public Criteria andCalledCustNameNotLike(String value) {
            addCriterion("called_cust_name not like", value, "calledCustName");
            return (Criteria) this;
        }

        public Criteria andCalledCustNameIn(List<String> values) {
            addCriterion("called_cust_name in", values, "calledCustName");
            return (Criteria) this;
        }

        public Criteria andCalledCustNameNotIn(List<String> values) {
            addCriterion("called_cust_name not in", values, "calledCustName");
            return (Criteria) this;
        }

        public Criteria andCalledCustNameBetween(String value1, String value2) {
            addCriterion("called_cust_name between", value1, value2, "calledCustName");
            return (Criteria) this;
        }

        public Criteria andCalledCustNameNotBetween(String value1, String value2) {
            addCriterion("called_cust_name not between", value1, value2, "calledCustName");
            return (Criteria) this;
        }

        public Criteria andOrigCallingNumIsNull() {
            addCriterion("orig_calling_num is null");
            return (Criteria) this;
        }

        public Criteria andOrigCallingNumIsNotNull() {
            addCriterion("orig_calling_num is not null");
            return (Criteria) this;
        }

        public Criteria andOrigCallingNumEqualTo(String value) {
            addCriterion("orig_calling_num =", value, "origCallingNum");
            return (Criteria) this;
        }

        public Criteria andOrigCallingNumNotEqualTo(String value) {
            addCriterion("orig_calling_num <>", value, "origCallingNum");
            return (Criteria) this;
        }

        public Criteria andOrigCallingNumGreaterThan(String value) {
            addCriterion("orig_calling_num >", value, "origCallingNum");
            return (Criteria) this;
        }

        public Criteria andOrigCallingNumGreaterThanOrEqualTo(String value) {
            addCriterion("orig_calling_num >=", value, "origCallingNum");
            return (Criteria) this;
        }

        public Criteria andOrigCallingNumLessThan(String value) {
            addCriterion("orig_calling_num <", value, "origCallingNum");
            return (Criteria) this;
        }

        public Criteria andOrigCallingNumLessThanOrEqualTo(String value) {
            addCriterion("orig_calling_num <=", value, "origCallingNum");
            return (Criteria) this;
        }

        public Criteria andOrigCallingNumLike(String value) {
            addCriterion("orig_calling_num like", value, "origCallingNum");
            return (Criteria) this;
        }

        public Criteria andOrigCallingNumNotLike(String value) {
            addCriterion("orig_calling_num not like", value, "origCallingNum");
            return (Criteria) this;
        }

        public Criteria andOrigCallingNumIn(List<String> values) {
            addCriterion("orig_calling_num in", values, "origCallingNum");
            return (Criteria) this;
        }

        public Criteria andOrigCallingNumNotIn(List<String> values) {
            addCriterion("orig_calling_num not in", values, "origCallingNum");
            return (Criteria) this;
        }

        public Criteria andOrigCallingNumBetween(String value1, String value2) {
            addCriterion("orig_calling_num between", value1, value2, "origCallingNum");
            return (Criteria) this;
        }

        public Criteria andOrigCallingNumNotBetween(String value1, String value2) {
            addCriterion("orig_calling_num not between", value1, value2, "origCallingNum");
            return (Criteria) this;
        }

        public Criteria andOrigCalledNumIsNull() {
            addCriterion("orig_called_num is null");
            return (Criteria) this;
        }

        public Criteria andOrigCalledNumIsNotNull() {
            addCriterion("orig_called_num is not null");
            return (Criteria) this;
        }

        public Criteria andOrigCalledNumEqualTo(String value) {
            addCriterion("orig_called_num =", value, "origCalledNum");
            return (Criteria) this;
        }

        public Criteria andOrigCalledNumNotEqualTo(String value) {
            addCriterion("orig_called_num <>", value, "origCalledNum");
            return (Criteria) this;
        }

        public Criteria andOrigCalledNumGreaterThan(String value) {
            addCriterion("orig_called_num >", value, "origCalledNum");
            return (Criteria) this;
        }

        public Criteria andOrigCalledNumGreaterThanOrEqualTo(String value) {
            addCriterion("orig_called_num >=", value, "origCalledNum");
            return (Criteria) this;
        }

        public Criteria andOrigCalledNumLessThan(String value) {
            addCriterion("orig_called_num <", value, "origCalledNum");
            return (Criteria) this;
        }

        public Criteria andOrigCalledNumLessThanOrEqualTo(String value) {
            addCriterion("orig_called_num <=", value, "origCalledNum");
            return (Criteria) this;
        }

        public Criteria andOrigCalledNumLike(String value) {
            addCriterion("orig_called_num like", value, "origCalledNum");
            return (Criteria) this;
        }

        public Criteria andOrigCalledNumNotLike(String value) {
            addCriterion("orig_called_num not like", value, "origCalledNum");
            return (Criteria) this;
        }

        public Criteria andOrigCalledNumIn(List<String> values) {
            addCriterion("orig_called_num in", values, "origCalledNum");
            return (Criteria) this;
        }

        public Criteria andOrigCalledNumNotIn(List<String> values) {
            addCriterion("orig_called_num not in", values, "origCalledNum");
            return (Criteria) this;
        }

        public Criteria andOrigCalledNumBetween(String value1, String value2) {
            addCriterion("orig_called_num between", value1, value2, "origCalledNum");
            return (Criteria) this;
        }

        public Criteria andOrigCalledNumNotBetween(String value1, String value2) {
            addCriterion("orig_called_num not between", value1, value2, "origCalledNum");
            return (Criteria) this;
        }

        public Criteria andLnupTmlenSecCntIsNull() {
            addCriterion("lnup_tmlen_sec_cnt is null");
            return (Criteria) this;
        }

        public Criteria andLnupTmlenSecCntIsNotNull() {
            addCriterion("lnup_tmlen_sec_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andLnupTmlenSecCntEqualTo(BigDecimal value) {
            addCriterion("lnup_tmlen_sec_cnt =", value, "lnupTmlenSecCnt");
            return (Criteria) this;
        }

        public Criteria andLnupTmlenSecCntNotEqualTo(BigDecimal value) {
            addCriterion("lnup_tmlen_sec_cnt <>", value, "lnupTmlenSecCnt");
            return (Criteria) this;
        }

        public Criteria andLnupTmlenSecCntGreaterThan(BigDecimal value) {
            addCriterion("lnup_tmlen_sec_cnt >", value, "lnupTmlenSecCnt");
            return (Criteria) this;
        }

        public Criteria andLnupTmlenSecCntGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("lnup_tmlen_sec_cnt >=", value, "lnupTmlenSecCnt");
            return (Criteria) this;
        }

        public Criteria andLnupTmlenSecCntLessThan(BigDecimal value) {
            addCriterion("lnup_tmlen_sec_cnt <", value, "lnupTmlenSecCnt");
            return (Criteria) this;
        }

        public Criteria andLnupTmlenSecCntLessThanOrEqualTo(BigDecimal value) {
            addCriterion("lnup_tmlen_sec_cnt <=", value, "lnupTmlenSecCnt");
            return (Criteria) this;
        }

        public Criteria andLnupTmlenSecCntIn(List<BigDecimal> values) {
            addCriterion("lnup_tmlen_sec_cnt in", values, "lnupTmlenSecCnt");
            return (Criteria) this;
        }

        public Criteria andLnupTmlenSecCntNotIn(List<BigDecimal> values) {
            addCriterion("lnup_tmlen_sec_cnt not in", values, "lnupTmlenSecCnt");
            return (Criteria) this;
        }

        public Criteria andLnupTmlenSecCntBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lnup_tmlen_sec_cnt between", value1, value2, "lnupTmlenSecCnt");
            return (Criteria) this;
        }

        public Criteria andLnupTmlenSecCntNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lnup_tmlen_sec_cnt not between", value1, value2, "lnupTmlenSecCnt");
            return (Criteria) this;
        }

        public Criteria andRingTmlenSecCntIsNull() {
            addCriterion("ring_tmlen_sec_cnt is null");
            return (Criteria) this;
        }

        public Criteria andRingTmlenSecCntIsNotNull() {
            addCriterion("ring_tmlen_sec_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andRingTmlenSecCntEqualTo(BigDecimal value) {
            addCriterion("ring_tmlen_sec_cnt =", value, "ringTmlenSecCnt");
            return (Criteria) this;
        }

        public Criteria andRingTmlenSecCntNotEqualTo(BigDecimal value) {
            addCriterion("ring_tmlen_sec_cnt <>", value, "ringTmlenSecCnt");
            return (Criteria) this;
        }

        public Criteria andRingTmlenSecCntGreaterThan(BigDecimal value) {
            addCriterion("ring_tmlen_sec_cnt >", value, "ringTmlenSecCnt");
            return (Criteria) this;
        }

        public Criteria andRingTmlenSecCntGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ring_tmlen_sec_cnt >=", value, "ringTmlenSecCnt");
            return (Criteria) this;
        }

        public Criteria andRingTmlenSecCntLessThan(BigDecimal value) {
            addCriterion("ring_tmlen_sec_cnt <", value, "ringTmlenSecCnt");
            return (Criteria) this;
        }

        public Criteria andRingTmlenSecCntLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ring_tmlen_sec_cnt <=", value, "ringTmlenSecCnt");
            return (Criteria) this;
        }

        public Criteria andRingTmlenSecCntIn(List<BigDecimal> values) {
            addCriterion("ring_tmlen_sec_cnt in", values, "ringTmlenSecCnt");
            return (Criteria) this;
        }

        public Criteria andRingTmlenSecCntNotIn(List<BigDecimal> values) {
            addCriterion("ring_tmlen_sec_cnt not in", values, "ringTmlenSecCnt");
            return (Criteria) this;
        }

        public Criteria andRingTmlenSecCntBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ring_tmlen_sec_cnt between", value1, value2, "ringTmlenSecCnt");
            return (Criteria) this;
        }

        public Criteria andRingTmlenSecCntNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ring_tmlen_sec_cnt not between", value1, value2, "ringTmlenSecCnt");
            return (Criteria) this;
        }

        public Criteria andCnvstTmlenSecCntIsNull() {
            addCriterion("cnvst_tmlen_sec_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCnvstTmlenSecCntIsNotNull() {
            addCriterion("cnvst_tmlen_sec_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCnvstTmlenSecCntEqualTo(BigDecimal value) {
            addCriterion("cnvst_tmlen_sec_cnt =", value, "cnvstTmlenSecCnt");
            return (Criteria) this;
        }

        public Criteria andCnvstTmlenSecCntNotEqualTo(BigDecimal value) {
            addCriterion("cnvst_tmlen_sec_cnt <>", value, "cnvstTmlenSecCnt");
            return (Criteria) this;
        }

        public Criteria andCnvstTmlenSecCntGreaterThan(BigDecimal value) {
            addCriterion("cnvst_tmlen_sec_cnt >", value, "cnvstTmlenSecCnt");
            return (Criteria) this;
        }

        public Criteria andCnvstTmlenSecCntGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cnvst_tmlen_sec_cnt >=", value, "cnvstTmlenSecCnt");
            return (Criteria) this;
        }

        public Criteria andCnvstTmlenSecCntLessThan(BigDecimal value) {
            addCriterion("cnvst_tmlen_sec_cnt <", value, "cnvstTmlenSecCnt");
            return (Criteria) this;
        }

        public Criteria andCnvstTmlenSecCntLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cnvst_tmlen_sec_cnt <=", value, "cnvstTmlenSecCnt");
            return (Criteria) this;
        }

        public Criteria andCnvstTmlenSecCntIn(List<BigDecimal> values) {
            addCriterion("cnvst_tmlen_sec_cnt in", values, "cnvstTmlenSecCnt");
            return (Criteria) this;
        }

        public Criteria andCnvstTmlenSecCntNotIn(List<BigDecimal> values) {
            addCriterion("cnvst_tmlen_sec_cnt not in", values, "cnvstTmlenSecCnt");
            return (Criteria) this;
        }

        public Criteria andCnvstTmlenSecCntBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cnvst_tmlen_sec_cnt between", value1, value2, "cnvstTmlenSecCnt");
            return (Criteria) this;
        }

        public Criteria andCnvstTmlenSecCntNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cnvst_tmlen_sec_cnt not between", value1, value2, "cnvstTmlenSecCnt");
            return (Criteria) this;
        }

        public Criteria andOnhookTypeCdIsNull() {
            addCriterion("onhook_type_cd is null");
            return (Criteria) this;
        }

        public Criteria andOnhookTypeCdIsNotNull() {
            addCriterion("onhook_type_cd is not null");
            return (Criteria) this;
        }

        public Criteria andOnhookTypeCdEqualTo(String value) {
            addCriterion("onhook_type_cd =", value, "onhookTypeCd");
            return (Criteria) this;
        }

        public Criteria andOnhookTypeCdNotEqualTo(String value) {
            addCriterion("onhook_type_cd <>", value, "onhookTypeCd");
            return (Criteria) this;
        }

        public Criteria andOnhookTypeCdGreaterThan(String value) {
            addCriterion("onhook_type_cd >", value, "onhookTypeCd");
            return (Criteria) this;
        }

        public Criteria andOnhookTypeCdGreaterThanOrEqualTo(String value) {
            addCriterion("onhook_type_cd >=", value, "onhookTypeCd");
            return (Criteria) this;
        }

        public Criteria andOnhookTypeCdLessThan(String value) {
            addCriterion("onhook_type_cd <", value, "onhookTypeCd");
            return (Criteria) this;
        }

        public Criteria andOnhookTypeCdLessThanOrEqualTo(String value) {
            addCriterion("onhook_type_cd <=", value, "onhookTypeCd");
            return (Criteria) this;
        }

        public Criteria andOnhookTypeCdLike(String value) {
            addCriterion("onhook_type_cd like", value, "onhookTypeCd");
            return (Criteria) this;
        }

        public Criteria andOnhookTypeCdNotLike(String value) {
            addCriterion("onhook_type_cd not like", value, "onhookTypeCd");
            return (Criteria) this;
        }

        public Criteria andOnhookTypeCdIn(List<String> values) {
            addCriterion("onhook_type_cd in", values, "onhookTypeCd");
            return (Criteria) this;
        }

        public Criteria andOnhookTypeCdNotIn(List<String> values) {
            addCriterion("onhook_type_cd not in", values, "onhookTypeCd");
            return (Criteria) this;
        }

        public Criteria andOnhookTypeCdBetween(String value1, String value2) {
            addCriterion("onhook_type_cd between", value1, value2, "onhookTypeCd");
            return (Criteria) this;
        }

        public Criteria andOnhookTypeCdNotBetween(String value1, String value2) {
            addCriterion("onhook_type_cd not between", value1, value2, "onhookTypeCd");
            return (Criteria) this;
        }

        public Criteria andCallTraceCnttIsNull() {
            addCriterion("call_trace_cntt is null");
            return (Criteria) this;
        }

        public Criteria andCallTraceCnttIsNotNull() {
            addCriterion("call_trace_cntt is not null");
            return (Criteria) this;
        }

        public Criteria andCallTraceCnttEqualTo(String value) {
            addCriterion("call_trace_cntt =", value, "callTraceCntt");
            return (Criteria) this;
        }

        public Criteria andCallTraceCnttNotEqualTo(String value) {
            addCriterion("call_trace_cntt <>", value, "callTraceCntt");
            return (Criteria) this;
        }

        public Criteria andCallTraceCnttGreaterThan(String value) {
            addCriterion("call_trace_cntt >", value, "callTraceCntt");
            return (Criteria) this;
        }

        public Criteria andCallTraceCnttGreaterThanOrEqualTo(String value) {
            addCriterion("call_trace_cntt >=", value, "callTraceCntt");
            return (Criteria) this;
        }

        public Criteria andCallTraceCnttLessThan(String value) {
            addCriterion("call_trace_cntt <", value, "callTraceCntt");
            return (Criteria) this;
        }

        public Criteria andCallTraceCnttLessThanOrEqualTo(String value) {
            addCriterion("call_trace_cntt <=", value, "callTraceCntt");
            return (Criteria) this;
        }

        public Criteria andCallTraceCnttLike(String value) {
            addCriterion("call_trace_cntt like", value, "callTraceCntt");
            return (Criteria) this;
        }

        public Criteria andCallTraceCnttNotLike(String value) {
            addCriterion("call_trace_cntt not like", value, "callTraceCntt");
            return (Criteria) this;
        }

        public Criteria andCallTraceCnttIn(List<String> values) {
            addCriterion("call_trace_cntt in", values, "callTraceCntt");
            return (Criteria) this;
        }

        public Criteria andCallTraceCnttNotIn(List<String> values) {
            addCriterion("call_trace_cntt not in", values, "callTraceCntt");
            return (Criteria) this;
        }

        public Criteria andCallTraceCnttBetween(String value1, String value2) {
            addCriterion("call_trace_cntt between", value1, value2, "callTraceCntt");
            return (Criteria) this;
        }

        public Criteria andCallTraceCnttNotBetween(String value1, String value2) {
            addCriterion("call_trace_cntt not between", value1, value2, "callTraceCntt");
            return (Criteria) this;
        }

        public Criteria andIvrKeyValueIsNull() {
            addCriterion("ivr_key_value is null");
            return (Criteria) this;
        }

        public Criteria andIvrKeyValueIsNotNull() {
            addCriterion("ivr_key_value is not null");
            return (Criteria) this;
        }

        public Criteria andIvrKeyValueEqualTo(String value) {
            addCriterion("ivr_key_value =", value, "ivrKeyValue");
            return (Criteria) this;
        }

        public Criteria andIvrKeyValueNotEqualTo(String value) {
            addCriterion("ivr_key_value <>", value, "ivrKeyValue");
            return (Criteria) this;
        }

        public Criteria andIvrKeyValueGreaterThan(String value) {
            addCriterion("ivr_key_value >", value, "ivrKeyValue");
            return (Criteria) this;
        }

        public Criteria andIvrKeyValueGreaterThanOrEqualTo(String value) {
            addCriterion("ivr_key_value >=", value, "ivrKeyValue");
            return (Criteria) this;
        }

        public Criteria andIvrKeyValueLessThan(String value) {
            addCriterion("ivr_key_value <", value, "ivrKeyValue");
            return (Criteria) this;
        }

        public Criteria andIvrKeyValueLessThanOrEqualTo(String value) {
            addCriterion("ivr_key_value <=", value, "ivrKeyValue");
            return (Criteria) this;
        }

        public Criteria andIvrKeyValueLike(String value) {
            addCriterion("ivr_key_value like", value, "ivrKeyValue");
            return (Criteria) this;
        }

        public Criteria andIvrKeyValueNotLike(String value) {
            addCriterion("ivr_key_value not like", value, "ivrKeyValue");
            return (Criteria) this;
        }

        public Criteria andIvrKeyValueIn(List<String> values) {
            addCriterion("ivr_key_value in", values, "ivrKeyValue");
            return (Criteria) this;
        }

        public Criteria andIvrKeyValueNotIn(List<String> values) {
            addCriterion("ivr_key_value not in", values, "ivrKeyValue");
            return (Criteria) this;
        }

        public Criteria andIvrKeyValueBetween(String value1, String value2) {
            addCriterion("ivr_key_value between", value1, value2, "ivrKeyValue");
            return (Criteria) this;
        }

        public Criteria andIvrKeyValueNotBetween(String value1, String value2) {
            addCriterion("ivr_key_value not between", value1, value2, "ivrKeyValue");
            return (Criteria) this;
        }

        public Criteria andRcdCrtTimeIsNull() {
            addCriterion("rcd_crt_time is null");
            return (Criteria) this;
        }

        public Criteria andRcdCrtTimeIsNotNull() {
            addCriterion("rcd_crt_time is not null");
            return (Criteria) this;
        }

        public Criteria andRcdCrtTimeEqualTo(Date value) {
            addCriterion("rcd_crt_time =", value, "rcdCrtTime");
            return (Criteria) this;
        }

        public Criteria andRcdCrtTimeNotEqualTo(Date value) {
            addCriterion("rcd_crt_time <>", value, "rcdCrtTime");
            return (Criteria) this;
        }

        public Criteria andRcdCrtTimeGreaterThan(Date value) {
            addCriterion("rcd_crt_time >", value, "rcdCrtTime");
            return (Criteria) this;
        }

        public Criteria andRcdCrtTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("rcd_crt_time >=", value, "rcdCrtTime");
            return (Criteria) this;
        }

        public Criteria andRcdCrtTimeLessThan(Date value) {
            addCriterion("rcd_crt_time <", value, "rcdCrtTime");
            return (Criteria) this;
        }

        public Criteria andRcdCrtTimeLessThanOrEqualTo(Date value) {
            addCriterion("rcd_crt_time <=", value, "rcdCrtTime");
            return (Criteria) this;
        }

        public Criteria andRcdCrtTimeIn(List<Date> values) {
            addCriterion("rcd_crt_time in", values, "rcdCrtTime");
            return (Criteria) this;
        }

        public Criteria andRcdCrtTimeNotIn(List<Date> values) {
            addCriterion("rcd_crt_time not in", values, "rcdCrtTime");
            return (Criteria) this;
        }

        public Criteria andRcdCrtTimeBetween(Date value1, Date value2) {
            addCriterion("rcd_crt_time between", value1, value2, "rcdCrtTime");
            return (Criteria) this;
        }

        public Criteria andRcdCrtTimeNotBetween(Date value1, Date value2) {
            addCriterion("rcd_crt_time not between", value1, value2, "rcdCrtTime");
            return (Criteria) this;
        }

        public Criteria andRcdFileNmIsNull() {
            addCriterion("rcd_file_nm is null");
            return (Criteria) this;
        }

        public Criteria andRcdFileNmIsNotNull() {
            addCriterion("rcd_file_nm is not null");
            return (Criteria) this;
        }

        public Criteria andRcdFileNmEqualTo(String value) {
            addCriterion("rcd_file_nm =", value, "rcdFileNm");
            return (Criteria) this;
        }

        public Criteria andRcdFileNmNotEqualTo(String value) {
            addCriterion("rcd_file_nm <>", value, "rcdFileNm");
            return (Criteria) this;
        }

        public Criteria andRcdFileNmGreaterThan(String value) {
            addCriterion("rcd_file_nm >", value, "rcdFileNm");
            return (Criteria) this;
        }

        public Criteria andRcdFileNmGreaterThanOrEqualTo(String value) {
            addCriterion("rcd_file_nm >=", value, "rcdFileNm");
            return (Criteria) this;
        }

        public Criteria andRcdFileNmLessThan(String value) {
            addCriterion("rcd_file_nm <", value, "rcdFileNm");
            return (Criteria) this;
        }

        public Criteria andRcdFileNmLessThanOrEqualTo(String value) {
            addCriterion("rcd_file_nm <=", value, "rcdFileNm");
            return (Criteria) this;
        }

        public Criteria andRcdFileNmLike(String value) {
            addCriterion("rcd_file_nm like", value, "rcdFileNm");
            return (Criteria) this;
        }

        public Criteria andRcdFileNmNotLike(String value) {
            addCriterion("rcd_file_nm not like", value, "rcdFileNm");
            return (Criteria) this;
        }

        public Criteria andRcdFileNmIn(List<String> values) {
            addCriterion("rcd_file_nm in", values, "rcdFileNm");
            return (Criteria) this;
        }

        public Criteria andRcdFileNmNotIn(List<String> values) {
            addCriterion("rcd_file_nm not in", values, "rcdFileNm");
            return (Criteria) this;
        }

        public Criteria andRcdFileNmBetween(String value1, String value2) {
            addCriterion("rcd_file_nm between", value1, value2, "rcdFileNm");
            return (Criteria) this;
        }

        public Criteria andRcdFileNmNotBetween(String value1, String value2) {
            addCriterion("rcd_file_nm not between", value1, value2, "rcdFileNm");
            return (Criteria) this;
        }

        public Criteria andRcdFileSavePathIsNull() {
            addCriterion("rcd_file_save_path is null");
            return (Criteria) this;
        }

        public Criteria andRcdFileSavePathIsNotNull() {
            addCriterion("rcd_file_save_path is not null");
            return (Criteria) this;
        }

        public Criteria andRcdFileSavePathEqualTo(String value) {
            addCriterion("rcd_file_save_path =", value, "rcdFileSavePath");
            return (Criteria) this;
        }

        public Criteria andRcdFileSavePathNotEqualTo(String value) {
            addCriterion("rcd_file_save_path <>", value, "rcdFileSavePath");
            return (Criteria) this;
        }

        public Criteria andRcdFileSavePathGreaterThan(String value) {
            addCriterion("rcd_file_save_path >", value, "rcdFileSavePath");
            return (Criteria) this;
        }

        public Criteria andRcdFileSavePathGreaterThanOrEqualTo(String value) {
            addCriterion("rcd_file_save_path >=", value, "rcdFileSavePath");
            return (Criteria) this;
        }

        public Criteria andRcdFileSavePathLessThan(String value) {
            addCriterion("rcd_file_save_path <", value, "rcdFileSavePath");
            return (Criteria) this;
        }

        public Criteria andRcdFileSavePathLessThanOrEqualTo(String value) {
            addCriterion("rcd_file_save_path <=", value, "rcdFileSavePath");
            return (Criteria) this;
        }

        public Criteria andRcdFileSavePathLike(String value) {
            addCriterion("rcd_file_save_path like", value, "rcdFileSavePath");
            return (Criteria) this;
        }

        public Criteria andRcdFileSavePathNotLike(String value) {
            addCriterion("rcd_file_save_path not like", value, "rcdFileSavePath");
            return (Criteria) this;
        }

        public Criteria andRcdFileSavePathIn(List<String> values) {
            addCriterion("rcd_file_save_path in", values, "rcdFileSavePath");
            return (Criteria) this;
        }

        public Criteria andRcdFileSavePathNotIn(List<String> values) {
            addCriterion("rcd_file_save_path not in", values, "rcdFileSavePath");
            return (Criteria) this;
        }

        public Criteria andRcdFileSavePathBetween(String value1, String value2) {
            addCriterion("rcd_file_save_path between", value1, value2, "rcdFileSavePath");
            return (Criteria) this;
        }

        public Criteria andRcdFileSavePathNotBetween(String value1, String value2) {
            addCriterion("rcd_file_save_path not between", value1, value2, "rcdFileSavePath");
            return (Criteria) this;
        }

        public Criteria andRcdFileSvrUrlPathIsNull() {
            addCriterion("rcd_file_svr_url_path is null");
            return (Criteria) this;
        }

        public Criteria andRcdFileSvrUrlPathIsNotNull() {
            addCriterion("rcd_file_svr_url_path is not null");
            return (Criteria) this;
        }

        public Criteria andRcdFileSvrUrlPathEqualTo(String value) {
            addCriterion("rcd_file_svr_url_path =", value, "rcdFileSvrUrlPath");
            return (Criteria) this;
        }

        public Criteria andRcdFileSvrUrlPathNotEqualTo(String value) {
            addCriterion("rcd_file_svr_url_path <>", value, "rcdFileSvrUrlPath");
            return (Criteria) this;
        }

        public Criteria andRcdFileSvrUrlPathGreaterThan(String value) {
            addCriterion("rcd_file_svr_url_path >", value, "rcdFileSvrUrlPath");
            return (Criteria) this;
        }

        public Criteria andRcdFileSvrUrlPathGreaterThanOrEqualTo(String value) {
            addCriterion("rcd_file_svr_url_path >=", value, "rcdFileSvrUrlPath");
            return (Criteria) this;
        }

        public Criteria andRcdFileSvrUrlPathLessThan(String value) {
            addCriterion("rcd_file_svr_url_path <", value, "rcdFileSvrUrlPath");
            return (Criteria) this;
        }

        public Criteria andRcdFileSvrUrlPathLessThanOrEqualTo(String value) {
            addCriterion("rcd_file_svr_url_path <=", value, "rcdFileSvrUrlPath");
            return (Criteria) this;
        }

        public Criteria andRcdFileSvrUrlPathLike(String value) {
            addCriterion("rcd_file_svr_url_path like", value, "rcdFileSvrUrlPath");
            return (Criteria) this;
        }

        public Criteria andRcdFileSvrUrlPathNotLike(String value) {
            addCriterion("rcd_file_svr_url_path not like", value, "rcdFileSvrUrlPath");
            return (Criteria) this;
        }

        public Criteria andRcdFileSvrUrlPathIn(List<String> values) {
            addCriterion("rcd_file_svr_url_path in", values, "rcdFileSvrUrlPath");
            return (Criteria) this;
        }

        public Criteria andRcdFileSvrUrlPathNotIn(List<String> values) {
            addCriterion("rcd_file_svr_url_path not in", values, "rcdFileSvrUrlPath");
            return (Criteria) this;
        }

        public Criteria andRcdFileSvrUrlPathBetween(String value1, String value2) {
            addCriterion("rcd_file_svr_url_path between", value1, value2, "rcdFileSvrUrlPath");
            return (Criteria) this;
        }

        public Criteria andRcdFileSvrUrlPathNotBetween(String value1, String value2) {
            addCriterion("rcd_file_svr_url_path not between", value1, value2, "rcdFileSvrUrlPath");
            return (Criteria) this;
        }

        public Criteria andRcdBgnTimeIsNull() {
            addCriterion("rcd_bgn_time is null");
            return (Criteria) this;
        }

        public Criteria andRcdBgnTimeIsNotNull() {
            addCriterion("rcd_bgn_time is not null");
            return (Criteria) this;
        }

        public Criteria andRcdBgnTimeEqualTo(Date value) {
            addCriterion("rcd_bgn_time =", value, "rcdBgnTime");
            return (Criteria) this;
        }

        public Criteria andRcdBgnTimeNotEqualTo(Date value) {
            addCriterion("rcd_bgn_time <>", value, "rcdBgnTime");
            return (Criteria) this;
        }

        public Criteria andRcdBgnTimeGreaterThan(Date value) {
            addCriterion("rcd_bgn_time >", value, "rcdBgnTime");
            return (Criteria) this;
        }

        public Criteria andRcdBgnTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("rcd_bgn_time >=", value, "rcdBgnTime");
            return (Criteria) this;
        }

        public Criteria andRcdBgnTimeLessThan(Date value) {
            addCriterion("rcd_bgn_time <", value, "rcdBgnTime");
            return (Criteria) this;
        }

        public Criteria andRcdBgnTimeLessThanOrEqualTo(Date value) {
            addCriterion("rcd_bgn_time <=", value, "rcdBgnTime");
            return (Criteria) this;
        }

        public Criteria andRcdBgnTimeIn(List<Date> values) {
            addCriterion("rcd_bgn_time in", values, "rcdBgnTime");
            return (Criteria) this;
        }

        public Criteria andRcdBgnTimeNotIn(List<Date> values) {
            addCriterion("rcd_bgn_time not in", values, "rcdBgnTime");
            return (Criteria) this;
        }

        public Criteria andRcdBgnTimeBetween(Date value1, Date value2) {
            addCriterion("rcd_bgn_time between", value1, value2, "rcdBgnTime");
            return (Criteria) this;
        }

        public Criteria andRcdBgnTimeNotBetween(Date value1, Date value2) {
            addCriterion("rcd_bgn_time not between", value1, value2, "rcdBgnTime");
            return (Criteria) this;
        }

        public Criteria andRcdFinishTimeIsNull() {
            addCriterion("rcd_finish_time is null");
            return (Criteria) this;
        }

        public Criteria andRcdFinishTimeIsNotNull() {
            addCriterion("rcd_finish_time is not null");
            return (Criteria) this;
        }

        public Criteria andRcdFinishTimeEqualTo(Date value) {
            addCriterion("rcd_finish_time =", value, "rcdFinishTime");
            return (Criteria) this;
        }

        public Criteria andRcdFinishTimeNotEqualTo(Date value) {
            addCriterion("rcd_finish_time <>", value, "rcdFinishTime");
            return (Criteria) this;
        }

        public Criteria andRcdFinishTimeGreaterThan(Date value) {
            addCriterion("rcd_finish_time >", value, "rcdFinishTime");
            return (Criteria) this;
        }

        public Criteria andRcdFinishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("rcd_finish_time >=", value, "rcdFinishTime");
            return (Criteria) this;
        }

        public Criteria andRcdFinishTimeLessThan(Date value) {
            addCriterion("rcd_finish_time <", value, "rcdFinishTime");
            return (Criteria) this;
        }

        public Criteria andRcdFinishTimeLessThanOrEqualTo(Date value) {
            addCriterion("rcd_finish_time <=", value, "rcdFinishTime");
            return (Criteria) this;
        }

        public Criteria andRcdFinishTimeIn(List<Date> values) {
            addCriterion("rcd_finish_time in", values, "rcdFinishTime");
            return (Criteria) this;
        }

        public Criteria andRcdFinishTimeNotIn(List<Date> values) {
            addCriterion("rcd_finish_time not in", values, "rcdFinishTime");
            return (Criteria) this;
        }

        public Criteria andRcdFinishTimeBetween(Date value1, Date value2) {
            addCriterion("rcd_finish_time between", value1, value2, "rcdFinishTime");
            return (Criteria) this;
        }

        public Criteria andRcdFinishTimeNotBetween(Date value1, Date value2) {
            addCriterion("rcd_finish_time not between", value1, value2, "rcdFinishTime");
            return (Criteria) this;
        }

        public Criteria andRcdTmlenSecCntIsNull() {
            addCriterion("rcd_tmlen_sec_cnt is null");
            return (Criteria) this;
        }

        public Criteria andRcdTmlenSecCntIsNotNull() {
            addCriterion("rcd_tmlen_sec_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andRcdTmlenSecCntEqualTo(BigDecimal value) {
            addCriterion("rcd_tmlen_sec_cnt =", value, "rcdTmlenSecCnt");
            return (Criteria) this;
        }

        public Criteria andRcdTmlenSecCntNotEqualTo(BigDecimal value) {
            addCriterion("rcd_tmlen_sec_cnt <>", value, "rcdTmlenSecCnt");
            return (Criteria) this;
        }

        public Criteria andRcdTmlenSecCntGreaterThan(BigDecimal value) {
            addCriterion("rcd_tmlen_sec_cnt >", value, "rcdTmlenSecCnt");
            return (Criteria) this;
        }

        public Criteria andRcdTmlenSecCntGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rcd_tmlen_sec_cnt >=", value, "rcdTmlenSecCnt");
            return (Criteria) this;
        }

        public Criteria andRcdTmlenSecCntLessThan(BigDecimal value) {
            addCriterion("rcd_tmlen_sec_cnt <", value, "rcdTmlenSecCnt");
            return (Criteria) this;
        }

        public Criteria andRcdTmlenSecCntLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rcd_tmlen_sec_cnt <=", value, "rcdTmlenSecCnt");
            return (Criteria) this;
        }

        public Criteria andRcdTmlenSecCntIn(List<BigDecimal> values) {
            addCriterion("rcd_tmlen_sec_cnt in", values, "rcdTmlenSecCnt");
            return (Criteria) this;
        }

        public Criteria andRcdTmlenSecCntNotIn(List<BigDecimal> values) {
            addCriterion("rcd_tmlen_sec_cnt not in", values, "rcdTmlenSecCnt");
            return (Criteria) this;
        }

        public Criteria andRcdTmlenSecCntBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rcd_tmlen_sec_cnt between", value1, value2, "rcdTmlenSecCnt");
            return (Criteria) this;
        }

        public Criteria andRcdTmlenSecCntNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rcd_tmlen_sec_cnt not between", value1, value2, "rcdTmlenSecCnt");
            return (Criteria) this;
        }

        public Criteria andMsServerIsNull() {
            addCriterion("ms_server is null");
            return (Criteria) this;
        }

        public Criteria andMsServerIsNotNull() {
            addCriterion("ms_server is not null");
            return (Criteria) this;
        }

        public Criteria andMsServerEqualTo(String value) {
            addCriterion("ms_server =", value, "msServer");
            return (Criteria) this;
        }

        public Criteria andMsServerNotEqualTo(String value) {
            addCriterion("ms_server <>", value, "msServer");
            return (Criteria) this;
        }

        public Criteria andMsServerGreaterThan(String value) {
            addCriterion("ms_server >", value, "msServer");
            return (Criteria) this;
        }

        public Criteria andMsServerGreaterThanOrEqualTo(String value) {
            addCriterion("ms_server >=", value, "msServer");
            return (Criteria) this;
        }

        public Criteria andMsServerLessThan(String value) {
            addCriterion("ms_server <", value, "msServer");
            return (Criteria) this;
        }

        public Criteria andMsServerLessThanOrEqualTo(String value) {
            addCriterion("ms_server <=", value, "msServer");
            return (Criteria) this;
        }

        public Criteria andMsServerLike(String value) {
            addCriterion("ms_server like", value, "msServer");
            return (Criteria) this;
        }

        public Criteria andMsServerNotLike(String value) {
            addCriterion("ms_server not like", value, "msServer");
            return (Criteria) this;
        }

        public Criteria andMsServerIn(List<String> values) {
            addCriterion("ms_server in", values, "msServer");
            return (Criteria) this;
        }

        public Criteria andMsServerNotIn(List<String> values) {
            addCriterion("ms_server not in", values, "msServer");
            return (Criteria) this;
        }

        public Criteria andMsServerBetween(String value1, String value2) {
            addCriterion("ms_server between", value1, value2, "msServer");
            return (Criteria) this;
        }

        public Criteria andMsServerNotBetween(String value1, String value2) {
            addCriterion("ms_server not between", value1, value2, "msServer");
            return (Criteria) this;
        }

        public Criteria andConnectStateIsNull() {
            addCriterion("connect_state is null");
            return (Criteria) this;
        }

        public Criteria andConnectStateIsNotNull() {
            addCriterion("connect_state is not null");
            return (Criteria) this;
        }

        public Criteria andConnectStateEqualTo(String value) {
            addCriterion("connect_state =", value, "connectState");
            return (Criteria) this;
        }

        public Criteria andConnectStateNotEqualTo(String value) {
            addCriterion("connect_state <>", value, "connectState");
            return (Criteria) this;
        }

        public Criteria andConnectStateGreaterThan(String value) {
            addCriterion("connect_state >", value, "connectState");
            return (Criteria) this;
        }

        public Criteria andConnectStateGreaterThanOrEqualTo(String value) {
            addCriterion("connect_state >=", value, "connectState");
            return (Criteria) this;
        }

        public Criteria andConnectStateLessThan(String value) {
            addCriterion("connect_state <", value, "connectState");
            return (Criteria) this;
        }

        public Criteria andConnectStateLessThanOrEqualTo(String value) {
            addCriterion("connect_state <=", value, "connectState");
            return (Criteria) this;
        }

        public Criteria andConnectStateLike(String value) {
            addCriterion("connect_state like", value, "connectState");
            return (Criteria) this;
        }

        public Criteria andConnectStateNotLike(String value) {
            addCriterion("connect_state not like", value, "connectState");
            return (Criteria) this;
        }

        public Criteria andConnectStateIn(List<String> values) {
            addCriterion("connect_state in", values, "connectState");
            return (Criteria) this;
        }

        public Criteria andConnectStateNotIn(List<String> values) {
            addCriterion("connect_state not in", values, "connectState");
            return (Criteria) this;
        }

        public Criteria andConnectStateBetween(String value1, String value2) {
            addCriterion("connect_state between", value1, value2, "connectState");
            return (Criteria) this;
        }

        public Criteria andConnectStateNotBetween(String value1, String value2) {
            addCriterion("connect_state not between", value1, value2, "connectState");
            return (Criteria) this;
        }

        public Criteria andErOrgCallingNumIdIsNull() {
            addCriterion("er_org_calling_num_id is null");
            return (Criteria) this;
        }

        public Criteria andErOrgCallingNumIdIsNotNull() {
            addCriterion("er_org_calling_num_id is not null");
            return (Criteria) this;
        }

        public Criteria andErOrgCallingNumIdEqualTo(Long value) {
            addCriterion("er_org_calling_num_id =", value, "erOrgCallingNumId");
            return (Criteria) this;
        }

        public Criteria andErOrgCallingNumIdNotEqualTo(Long value) {
            addCriterion("er_org_calling_num_id <>", value, "erOrgCallingNumId");
            return (Criteria) this;
        }

        public Criteria andErOrgCallingNumIdGreaterThan(Long value) {
            addCriterion("er_org_calling_num_id >", value, "erOrgCallingNumId");
            return (Criteria) this;
        }

        public Criteria andErOrgCallingNumIdGreaterThanOrEqualTo(Long value) {
            addCriterion("er_org_calling_num_id >=", value, "erOrgCallingNumId");
            return (Criteria) this;
        }

        public Criteria andErOrgCallingNumIdLessThan(Long value) {
            addCriterion("er_org_calling_num_id <", value, "erOrgCallingNumId");
            return (Criteria) this;
        }

        public Criteria andErOrgCallingNumIdLessThanOrEqualTo(Long value) {
            addCriterion("er_org_calling_num_id <=", value, "erOrgCallingNumId");
            return (Criteria) this;
        }

        public Criteria andErOrgCallingNumIdIn(List<Long> values) {
            addCriterion("er_org_calling_num_id in", values, "erOrgCallingNumId");
            return (Criteria) this;
        }

        public Criteria andErOrgCallingNumIdNotIn(List<Long> values) {
            addCriterion("er_org_calling_num_id not in", values, "erOrgCallingNumId");
            return (Criteria) this;
        }

        public Criteria andErOrgCallingNumIdBetween(Long value1, Long value2) {
            addCriterion("er_org_calling_num_id between", value1, value2, "erOrgCallingNumId");
            return (Criteria) this;
        }

        public Criteria andErOrgCallingNumIdNotBetween(Long value1, Long value2) {
            addCriterion("er_org_calling_num_id not between", value1, value2, "erOrgCallingNumId");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumberIsNull() {
            addCriterion("telephone_number is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumberIsNotNull() {
            addCriterion("telephone_number is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumberEqualTo(String value) {
            addCriterion("telephone_number =", value, "telephoneNumber");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumberNotEqualTo(String value) {
            addCriterion("telephone_number <>", value, "telephoneNumber");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumberGreaterThan(String value) {
            addCriterion("telephone_number >", value, "telephoneNumber");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("telephone_number >=", value, "telephoneNumber");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumberLessThan(String value) {
            addCriterion("telephone_number <", value, "telephoneNumber");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumberLessThanOrEqualTo(String value) {
            addCriterion("telephone_number <=", value, "telephoneNumber");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumberLike(String value) {
            addCriterion("telephone_number like", value, "telephoneNumber");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumberNotLike(String value) {
            addCriterion("telephone_number not like", value, "telephoneNumber");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumberIn(List<String> values) {
            addCriterion("telephone_number in", values, "telephoneNumber");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumberNotIn(List<String> values) {
            addCriterion("telephone_number not in", values, "telephoneNumber");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumberBetween(String value1, String value2) {
            addCriterion("telephone_number between", value1, value2, "telephoneNumber");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumberNotBetween(String value1, String value2) {
            addCriterion("telephone_number not between", value1, value2, "telephoneNumber");
            return (Criteria) this;
        }

        public Criteria andTaskCallingNumIsNull() {
            addCriterion("task_calling_num is null");
            return (Criteria) this;
        }

        public Criteria andTaskCallingNumIsNotNull() {
            addCriterion("task_calling_num is not null");
            return (Criteria) this;
        }

        public Criteria andTaskCallingNumEqualTo(String value) {
            addCriterion("task_calling_num =", value, "taskCallingNum");
            return (Criteria) this;
        }

        public Criteria andTaskCallingNumNotEqualTo(String value) {
            addCriterion("task_calling_num <>", value, "taskCallingNum");
            return (Criteria) this;
        }

        public Criteria andTaskCallingNumGreaterThan(String value) {
            addCriterion("task_calling_num >", value, "taskCallingNum");
            return (Criteria) this;
        }

        public Criteria andTaskCallingNumGreaterThanOrEqualTo(String value) {
            addCriterion("task_calling_num >=", value, "taskCallingNum");
            return (Criteria) this;
        }

        public Criteria andTaskCallingNumLessThan(String value) {
            addCriterion("task_calling_num <", value, "taskCallingNum");
            return (Criteria) this;
        }

        public Criteria andTaskCallingNumLessThanOrEqualTo(String value) {
            addCriterion("task_calling_num <=", value, "taskCallingNum");
            return (Criteria) this;
        }

        public Criteria andTaskCallingNumLike(String value) {
            addCriterion("task_calling_num like", value, "taskCallingNum");
            return (Criteria) this;
        }

        public Criteria andTaskCallingNumNotLike(String value) {
            addCriterion("task_calling_num not like", value, "taskCallingNum");
            return (Criteria) this;
        }

        public Criteria andTaskCallingNumIn(List<String> values) {
            addCriterion("task_calling_num in", values, "taskCallingNum");
            return (Criteria) this;
        }

        public Criteria andTaskCallingNumNotIn(List<String> values) {
            addCriterion("task_calling_num not in", values, "taskCallingNum");
            return (Criteria) this;
        }

        public Criteria andTaskCallingNumBetween(String value1, String value2) {
            addCriterion("task_calling_num between", value1, value2, "taskCallingNum");
            return (Criteria) this;
        }

        public Criteria andTaskCallingNumNotBetween(String value1, String value2) {
            addCriterion("task_calling_num not between", value1, value2, "taskCallingNum");
            return (Criteria) this;
        }

        public Criteria andDisconnectTypeIsNull() {
            addCriterion("disconnect_type is null");
            return (Criteria) this;
        }

        public Criteria andDisconnectTypeIsNotNull() {
            addCriterion("disconnect_type is not null");
            return (Criteria) this;
        }

        public Criteria andDisconnectTypeEqualTo(Byte value) {
            addCriterion("disconnect_type =", value, "disconnectType");
            return (Criteria) this;
        }

        public Criteria andDisconnectTypeNotEqualTo(Byte value) {
            addCriterion("disconnect_type <>", value, "disconnectType");
            return (Criteria) this;
        }

        public Criteria andDisconnectTypeGreaterThan(Byte value) {
            addCriterion("disconnect_type >", value, "disconnectType");
            return (Criteria) this;
        }

        public Criteria andDisconnectTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("disconnect_type >=", value, "disconnectType");
            return (Criteria) this;
        }

        public Criteria andDisconnectTypeLessThan(Byte value) {
            addCriterion("disconnect_type <", value, "disconnectType");
            return (Criteria) this;
        }

        public Criteria andDisconnectTypeLessThanOrEqualTo(Byte value) {
            addCriterion("disconnect_type <=", value, "disconnectType");
            return (Criteria) this;
        }

        public Criteria andDisconnectTypeIn(List<Byte> values) {
            addCriterion("disconnect_type in", values, "disconnectType");
            return (Criteria) this;
        }

        public Criteria andDisconnectTypeNotIn(List<Byte> values) {
            addCriterion("disconnect_type not in", values, "disconnectType");
            return (Criteria) this;
        }

        public Criteria andDisconnectTypeBetween(Byte value1, Byte value2) {
            addCriterion("disconnect_type between", value1, value2, "disconnectType");
            return (Criteria) this;
        }

        public Criteria andDisconnectTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("disconnect_type not between", value1, value2, "disconnectType");
            return (Criteria) this;
        }

        public Criteria andRingTimeIsNull() {
            addCriterion("ring_time is null");
            return (Criteria) this;
        }

        public Criteria andRingTimeIsNotNull() {
            addCriterion("ring_time is not null");
            return (Criteria) this;
        }

        public Criteria andRingTimeEqualTo(Date value) {
            addCriterion("ring_time =", value, "ringTime");
            return (Criteria) this;
        }

        public Criteria andRingTimeNotEqualTo(Date value) {
            addCriterion("ring_time <>", value, "ringTime");
            return (Criteria) this;
        }

        public Criteria andRingTimeGreaterThan(Date value) {
            addCriterion("ring_time >", value, "ringTime");
            return (Criteria) this;
        }

        public Criteria andRingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ring_time >=", value, "ringTime");
            return (Criteria) this;
        }

        public Criteria andRingTimeLessThan(Date value) {
            addCriterion("ring_time <", value, "ringTime");
            return (Criteria) this;
        }

        public Criteria andRingTimeLessThanOrEqualTo(Date value) {
            addCriterion("ring_time <=", value, "ringTime");
            return (Criteria) this;
        }

        public Criteria andRingTimeIn(List<Date> values) {
            addCriterion("ring_time in", values, "ringTime");
            return (Criteria) this;
        }

        public Criteria andRingTimeNotIn(List<Date> values) {
            addCriterion("ring_time not in", values, "ringTime");
            return (Criteria) this;
        }

        public Criteria andRingTimeBetween(Date value1, Date value2) {
            addCriterion("ring_time between", value1, value2, "ringTime");
            return (Criteria) this;
        }

        public Criteria andRingTimeNotBetween(Date value1, Date value2) {
            addCriterion("ring_time not between", value1, value2, "ringTime");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNull() {
            addCriterion("area_code is null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNotNull() {
            addCriterion("area_code is not null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeEqualTo(String value) {
            addCriterion("area_code =", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotEqualTo(String value) {
            addCriterion("area_code <>", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThan(String value) {
            addCriterion("area_code >", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("area_code >=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThan(String value) {
            addCriterion("area_code <", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("area_code <=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLike(String value) {
            addCriterion("area_code like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotLike(String value) {
            addCriterion("area_code not like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIn(List<String> values) {
            addCriterion("area_code in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotIn(List<String> values) {
            addCriterion("area_code not in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeBetween(String value1, String value2) {
            addCriterion("area_code between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotBetween(String value1, String value2) {
            addCriterion("area_code not between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAutoTaskIdIsNull() {
            addCriterion("auto_task_id is null");
            return (Criteria) this;
        }

        public Criteria andAutoTaskIdIsNotNull() {
            addCriterion("auto_task_id is not null");
            return (Criteria) this;
        }

        public Criteria andAutoTaskIdEqualTo(String value) {
            addCriterion("auto_task_id =", value, "autoTaskId");
            return (Criteria) this;
        }

        public Criteria andAutoTaskIdNotEqualTo(String value) {
            addCriterion("auto_task_id <>", value, "autoTaskId");
            return (Criteria) this;
        }

        public Criteria andAutoTaskIdGreaterThan(String value) {
            addCriterion("auto_task_id >", value, "autoTaskId");
            return (Criteria) this;
        }

        public Criteria andAutoTaskIdGreaterThanOrEqualTo(String value) {
            addCriterion("auto_task_id >=", value, "autoTaskId");
            return (Criteria) this;
        }

        public Criteria andAutoTaskIdLessThan(String value) {
            addCriterion("auto_task_id <", value, "autoTaskId");
            return (Criteria) this;
        }

        public Criteria andAutoTaskIdLessThanOrEqualTo(String value) {
            addCriterion("auto_task_id <=", value, "autoTaskId");
            return (Criteria) this;
        }

        public Criteria andAutoTaskIdLike(String value) {
            addCriterion("auto_task_id like", value, "autoTaskId");
            return (Criteria) this;
        }

        public Criteria andAutoTaskIdNotLike(String value) {
            addCriterion("auto_task_id not like", value, "autoTaskId");
            return (Criteria) this;
        }

        public Criteria andAutoTaskIdIn(List<String> values) {
            addCriterion("auto_task_id in", values, "autoTaskId");
            return (Criteria) this;
        }

        public Criteria andAutoTaskIdNotIn(List<String> values) {
            addCriterion("auto_task_id not in", values, "autoTaskId");
            return (Criteria) this;
        }

        public Criteria andAutoTaskIdBetween(String value1, String value2) {
            addCriterion("auto_task_id between", value1, value2, "autoTaskId");
            return (Criteria) this;
        }

        public Criteria andAutoTaskIdNotBetween(String value1, String value2) {
            addCriterion("auto_task_id not between", value1, value2, "autoTaskId");
            return (Criteria) this;
        }

        public Criteria andUserAlertTimeIsNull() {
            addCriterion("user_alert_time is null");
            return (Criteria) this;
        }

        public Criteria andUserAlertTimeIsNotNull() {
            addCriterion("user_alert_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserAlertTimeEqualTo(Short value) {
            addCriterion("user_alert_time =", value, "userAlertTime");
            return (Criteria) this;
        }

        public Criteria andUserAlertTimeNotEqualTo(Short value) {
            addCriterion("user_alert_time <>", value, "userAlertTime");
            return (Criteria) this;
        }

        public Criteria andUserAlertTimeGreaterThan(Short value) {
            addCriterion("user_alert_time >", value, "userAlertTime");
            return (Criteria) this;
        }

        public Criteria andUserAlertTimeGreaterThanOrEqualTo(Short value) {
            addCriterion("user_alert_time >=", value, "userAlertTime");
            return (Criteria) this;
        }

        public Criteria andUserAlertTimeLessThan(Short value) {
            addCriterion("user_alert_time <", value, "userAlertTime");
            return (Criteria) this;
        }

        public Criteria andUserAlertTimeLessThanOrEqualTo(Short value) {
            addCriterion("user_alert_time <=", value, "userAlertTime");
            return (Criteria) this;
        }

        public Criteria andUserAlertTimeIn(List<Short> values) {
            addCriterion("user_alert_time in", values, "userAlertTime");
            return (Criteria) this;
        }

        public Criteria andUserAlertTimeNotIn(List<Short> values) {
            addCriterion("user_alert_time not in", values, "userAlertTime");
            return (Criteria) this;
        }

        public Criteria andUserAlertTimeBetween(Short value1, Short value2) {
            addCriterion("user_alert_time between", value1, value2, "userAlertTime");
            return (Criteria) this;
        }

        public Criteria andUserAlertTimeNotBetween(Short value1, Short value2) {
            addCriterion("user_alert_time not between", value1, value2, "userAlertTime");
            return (Criteria) this;
        }

        public Criteria andAgentAlertTimeIsNull() {
            addCriterion("agent_alert_time is null");
            return (Criteria) this;
        }

        public Criteria andAgentAlertTimeIsNotNull() {
            addCriterion("agent_alert_time is not null");
            return (Criteria) this;
        }

        public Criteria andAgentAlertTimeEqualTo(Short value) {
            addCriterion("agent_alert_time =", value, "agentAlertTime");
            return (Criteria) this;
        }

        public Criteria andAgentAlertTimeNotEqualTo(Short value) {
            addCriterion("agent_alert_time <>", value, "agentAlertTime");
            return (Criteria) this;
        }

        public Criteria andAgentAlertTimeGreaterThan(Short value) {
            addCriterion("agent_alert_time >", value, "agentAlertTime");
            return (Criteria) this;
        }

        public Criteria andAgentAlertTimeGreaterThanOrEqualTo(Short value) {
            addCriterion("agent_alert_time >=", value, "agentAlertTime");
            return (Criteria) this;
        }

        public Criteria andAgentAlertTimeLessThan(Short value) {
            addCriterion("agent_alert_time <", value, "agentAlertTime");
            return (Criteria) this;
        }

        public Criteria andAgentAlertTimeLessThanOrEqualTo(Short value) {
            addCriterion("agent_alert_time <=", value, "agentAlertTime");
            return (Criteria) this;
        }

        public Criteria andAgentAlertTimeIn(List<Short> values) {
            addCriterion("agent_alert_time in", values, "agentAlertTime");
            return (Criteria) this;
        }

        public Criteria andAgentAlertTimeNotIn(List<Short> values) {
            addCriterion("agent_alert_time not in", values, "agentAlertTime");
            return (Criteria) this;
        }

        public Criteria andAgentAlertTimeBetween(Short value1, Short value2) {
            addCriterion("agent_alert_time between", value1, value2, "agentAlertTime");
            return (Criteria) this;
        }

        public Criteria andAgentAlertTimeNotBetween(Short value1, Short value2) {
            addCriterion("agent_alert_time not between", value1, value2, "agentAlertTime");
            return (Criteria) this;
        }

        public Criteria andQualityExtractStateIsNull() {
            addCriterion("quality_extract_state is null");
            return (Criteria) this;
        }

        public Criteria andQualityExtractStateIsNotNull() {
            addCriterion("quality_extract_state is not null");
            return (Criteria) this;
        }

        public Criteria andQualityExtractStateEqualTo(String value) {
            addCriterion("quality_extract_state =", value, "qualityExtractState");
            return (Criteria) this;
        }

        public Criteria andQualityExtractStateNotEqualTo(String value) {
            addCriterion("quality_extract_state <>", value, "qualityExtractState");
            return (Criteria) this;
        }

        public Criteria andQualityExtractStateGreaterThan(String value) {
            addCriterion("quality_extract_state >", value, "qualityExtractState");
            return (Criteria) this;
        }

        public Criteria andQualityExtractStateGreaterThanOrEqualTo(String value) {
            addCriterion("quality_extract_state >=", value, "qualityExtractState");
            return (Criteria) this;
        }

        public Criteria andQualityExtractStateLessThan(String value) {
            addCriterion("quality_extract_state <", value, "qualityExtractState");
            return (Criteria) this;
        }

        public Criteria andQualityExtractStateLessThanOrEqualTo(String value) {
            addCriterion("quality_extract_state <=", value, "qualityExtractState");
            return (Criteria) this;
        }

        public Criteria andQualityExtractStateLike(String value) {
            addCriterion("quality_extract_state like", value, "qualityExtractState");
            return (Criteria) this;
        }

        public Criteria andQualityExtractStateNotLike(String value) {
            addCriterion("quality_extract_state not like", value, "qualityExtractState");
            return (Criteria) this;
        }

        public Criteria andQualityExtractStateIn(List<String> values) {
            addCriterion("quality_extract_state in", values, "qualityExtractState");
            return (Criteria) this;
        }

        public Criteria andQualityExtractStateNotIn(List<String> values) {
            addCriterion("quality_extract_state not in", values, "qualityExtractState");
            return (Criteria) this;
        }

        public Criteria andQualityExtractStateBetween(String value1, String value2) {
            addCriterion("quality_extract_state between", value1, value2, "qualityExtractState");
            return (Criteria) this;
        }

        public Criteria andQualityExtractStateNotBetween(String value1, String value2) {
            addCriterion("quality_extract_state not between", value1, value2, "qualityExtractState");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Integer value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Integer value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Integer value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Integer value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Integer value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Integer> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Integer> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Integer value1, Integer value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andErOrgNameIsNull() {
            addCriterion("er_org_name is null");
            return (Criteria) this;
        }

        public Criteria andErOrgNameIsNotNull() {
            addCriterion("er_org_name is not null");
            return (Criteria) this;
        }

        public Criteria andErOrgNameEqualTo(String value) {
            addCriterion("er_org_name =", value, "erOrgName");
            return (Criteria) this;
        }

        public Criteria andErOrgNameNotEqualTo(String value) {
            addCriterion("er_org_name <>", value, "erOrgName");
            return (Criteria) this;
        }

        public Criteria andErOrgNameGreaterThan(String value) {
            addCriterion("er_org_name >", value, "erOrgName");
            return (Criteria) this;
        }

        public Criteria andErOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("er_org_name >=", value, "erOrgName");
            return (Criteria) this;
        }

        public Criteria andErOrgNameLessThan(String value) {
            addCriterion("er_org_name <", value, "erOrgName");
            return (Criteria) this;
        }

        public Criteria andErOrgNameLessThanOrEqualTo(String value) {
            addCriterion("er_org_name <=", value, "erOrgName");
            return (Criteria) this;
        }

        public Criteria andErOrgNameLike(String value) {
            addCriterion("er_org_name like", value, "erOrgName");
            return (Criteria) this;
        }

        public Criteria andErOrgNameNotLike(String value) {
            addCriterion("er_org_name not like", value, "erOrgName");
            return (Criteria) this;
        }

        public Criteria andErOrgNameIn(List<String> values) {
            addCriterion("er_org_name in", values, "erOrgName");
            return (Criteria) this;
        }

        public Criteria andErOrgNameNotIn(List<String> values) {
            addCriterion("er_org_name not in", values, "erOrgName");
            return (Criteria) this;
        }

        public Criteria andErOrgNameBetween(String value1, String value2) {
            addCriterion("er_org_name between", value1, value2, "erOrgName");
            return (Criteria) this;
        }

        public Criteria andErOrgNameNotBetween(String value1, String value2) {
            addCriterion("er_org_name not between", value1, value2, "erOrgName");
            return (Criteria) this;
        }

        public Criteria andErOrgCodeIsNull() {
            addCriterion("er_org_code is null");
            return (Criteria) this;
        }

        public Criteria andErOrgCodeIsNotNull() {
            addCriterion("er_org_code is not null");
            return (Criteria) this;
        }

        public Criteria andErOrgCodeEqualTo(String value) {
            addCriterion("er_org_code =", value, "erOrgCode");
            return (Criteria) this;
        }

        public Criteria andErOrgCodeNotEqualTo(String value) {
            addCriterion("er_org_code <>", value, "erOrgCode");
            return (Criteria) this;
        }

        public Criteria andErOrgCodeGreaterThan(String value) {
            addCriterion("er_org_code >", value, "erOrgCode");
            return (Criteria) this;
        }

        public Criteria andErOrgCodeGreaterThanOrEqualTo(String value) {
            addCriterion("er_org_code >=", value, "erOrgCode");
            return (Criteria) this;
        }

        public Criteria andErOrgCodeLessThan(String value) {
            addCriterion("er_org_code <", value, "erOrgCode");
            return (Criteria) this;
        }

        public Criteria andErOrgCodeLessThanOrEqualTo(String value) {
            addCriterion("er_org_code <=", value, "erOrgCode");
            return (Criteria) this;
        }

        public Criteria andErOrgCodeLike(String value) {
            addCriterion("er_org_code like", value, "erOrgCode");
            return (Criteria) this;
        }

        public Criteria andErOrgCodeNotLike(String value) {
            addCriterion("er_org_code not like", value, "erOrgCode");
            return (Criteria) this;
        }

        public Criteria andErOrgCodeIn(List<String> values) {
            addCriterion("er_org_code in", values, "erOrgCode");
            return (Criteria) this;
        }

        public Criteria andErOrgCodeNotIn(List<String> values) {
            addCriterion("er_org_code not in", values, "erOrgCode");
            return (Criteria) this;
        }

        public Criteria andErOrgCodeBetween(String value1, String value2) {
            addCriterion("er_org_code between", value1, value2, "erOrgCode");
            return (Criteria) this;
        }

        public Criteria andErOrgCodeNotBetween(String value1, String value2) {
            addCriterion("er_org_code not between", value1, value2, "erOrgCode");
            return (Criteria) this;
        }

        public Criteria andSpOrgNameIsNull() {
            addCriterion("sp_org_name is null");
            return (Criteria) this;
        }

        public Criteria andSpOrgNameIsNotNull() {
            addCriterion("sp_org_name is not null");
            return (Criteria) this;
        }

        public Criteria andSpOrgNameEqualTo(String value) {
            addCriterion("sp_org_name =", value, "spOrgName");
            return (Criteria) this;
        }

        public Criteria andSpOrgNameNotEqualTo(String value) {
            addCriterion("sp_org_name <>", value, "spOrgName");
            return (Criteria) this;
        }

        public Criteria andSpOrgNameGreaterThan(String value) {
            addCriterion("sp_org_name >", value, "spOrgName");
            return (Criteria) this;
        }

        public Criteria andSpOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("sp_org_name >=", value, "spOrgName");
            return (Criteria) this;
        }

        public Criteria andSpOrgNameLessThan(String value) {
            addCriterion("sp_org_name <", value, "spOrgName");
            return (Criteria) this;
        }

        public Criteria andSpOrgNameLessThanOrEqualTo(String value) {
            addCriterion("sp_org_name <=", value, "spOrgName");
            return (Criteria) this;
        }

        public Criteria andSpOrgNameLike(String value) {
            addCriterion("sp_org_name like", value, "spOrgName");
            return (Criteria) this;
        }

        public Criteria andSpOrgNameNotLike(String value) {
            addCriterion("sp_org_name not like", value, "spOrgName");
            return (Criteria) this;
        }

        public Criteria andSpOrgNameIn(List<String> values) {
            addCriterion("sp_org_name in", values, "spOrgName");
            return (Criteria) this;
        }

        public Criteria andSpOrgNameNotIn(List<String> values) {
            addCriterion("sp_org_name not in", values, "spOrgName");
            return (Criteria) this;
        }

        public Criteria andSpOrgNameBetween(String value1, String value2) {
            addCriterion("sp_org_name between", value1, value2, "spOrgName");
            return (Criteria) this;
        }

        public Criteria andSpOrgNameNotBetween(String value1, String value2) {
            addCriterion("sp_org_name not between", value1, value2, "spOrgName");
            return (Criteria) this;
        }

        public Criteria andSpOrgCodeIsNull() {
            addCriterion("sp_org_code is null");
            return (Criteria) this;
        }

        public Criteria andSpOrgCodeIsNotNull() {
            addCriterion("sp_org_code is not null");
            return (Criteria) this;
        }

        public Criteria andSpOrgCodeEqualTo(String value) {
            addCriterion("sp_org_code =", value, "spOrgCode");
            return (Criteria) this;
        }

        public Criteria andSpOrgCodeNotEqualTo(String value) {
            addCriterion("sp_org_code <>", value, "spOrgCode");
            return (Criteria) this;
        }

        public Criteria andSpOrgCodeGreaterThan(String value) {
            addCriterion("sp_org_code >", value, "spOrgCode");
            return (Criteria) this;
        }

        public Criteria andSpOrgCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sp_org_code >=", value, "spOrgCode");
            return (Criteria) this;
        }

        public Criteria andSpOrgCodeLessThan(String value) {
            addCriterion("sp_org_code <", value, "spOrgCode");
            return (Criteria) this;
        }

        public Criteria andSpOrgCodeLessThanOrEqualTo(String value) {
            addCriterion("sp_org_code <=", value, "spOrgCode");
            return (Criteria) this;
        }

        public Criteria andSpOrgCodeLike(String value) {
            addCriterion("sp_org_code like", value, "spOrgCode");
            return (Criteria) this;
        }

        public Criteria andSpOrgCodeNotLike(String value) {
            addCriterion("sp_org_code not like", value, "spOrgCode");
            return (Criteria) this;
        }

        public Criteria andSpOrgCodeIn(List<String> values) {
            addCriterion("sp_org_code in", values, "spOrgCode");
            return (Criteria) this;
        }

        public Criteria andSpOrgCodeNotIn(List<String> values) {
            addCriterion("sp_org_code not in", values, "spOrgCode");
            return (Criteria) this;
        }

        public Criteria andSpOrgCodeBetween(String value1, String value2) {
            addCriterion("sp_org_code between", value1, value2, "spOrgCode");
            return (Criteria) this;
        }

        public Criteria andSpOrgCodeNotBetween(String value1, String value2) {
            addCriterion("sp_org_code not between", value1, value2, "spOrgCode");
            return (Criteria) this;
        }

        public Criteria andSeatRealNameIsNull() {
            addCriterion("seat_real_name is null");
            return (Criteria) this;
        }

        public Criteria andSeatRealNameIsNotNull() {
            addCriterion("seat_real_name is not null");
            return (Criteria) this;
        }

        public Criteria andSeatRealNameEqualTo(String value) {
            addCriterion("seat_real_name =", value, "seatRealName");
            return (Criteria) this;
        }

        public Criteria andSeatRealNameNotEqualTo(String value) {
            addCriterion("seat_real_name <>", value, "seatRealName");
            return (Criteria) this;
        }

        public Criteria andSeatRealNameGreaterThan(String value) {
            addCriterion("seat_real_name >", value, "seatRealName");
            return (Criteria) this;
        }

        public Criteria andSeatRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("seat_real_name >=", value, "seatRealName");
            return (Criteria) this;
        }

        public Criteria andSeatRealNameLessThan(String value) {
            addCriterion("seat_real_name <", value, "seatRealName");
            return (Criteria) this;
        }

        public Criteria andSeatRealNameLessThanOrEqualTo(String value) {
            addCriterion("seat_real_name <=", value, "seatRealName");
            return (Criteria) this;
        }

        public Criteria andSeatRealNameLike(String value) {
            addCriterion("seat_real_name like", value, "seatRealName");
            return (Criteria) this;
        }

        public Criteria andSeatRealNameNotLike(String value) {
            addCriterion("seat_real_name not like", value, "seatRealName");
            return (Criteria) this;
        }

        public Criteria andSeatRealNameIn(List<String> values) {
            addCriterion("seat_real_name in", values, "seatRealName");
            return (Criteria) this;
        }

        public Criteria andSeatRealNameNotIn(List<String> values) {
            addCriterion("seat_real_name not in", values, "seatRealName");
            return (Criteria) this;
        }

        public Criteria andSeatRealNameBetween(String value1, String value2) {
            addCriterion("seat_real_name between", value1, value2, "seatRealName");
            return (Criteria) this;
        }

        public Criteria andSeatRealNameNotBetween(String value1, String value2) {
            addCriterion("seat_real_name not between", value1, value2, "seatRealName");
            return (Criteria) this;
        }

        public Criteria andSeatCodeIsNull() {
            addCriterion("seat_code is null");
            return (Criteria) this;
        }

        public Criteria andSeatCodeIsNotNull() {
            addCriterion("seat_code is not null");
            return (Criteria) this;
        }

        public Criteria andSeatCodeEqualTo(String value) {
            addCriterion("seat_code =", value, "seatCode");
            return (Criteria) this;
        }

        public Criteria andSeatCodeNotEqualTo(String value) {
            addCriterion("seat_code <>", value, "seatCode");
            return (Criteria) this;
        }

        public Criteria andSeatCodeGreaterThan(String value) {
            addCriterion("seat_code >", value, "seatCode");
            return (Criteria) this;
        }

        public Criteria andSeatCodeGreaterThanOrEqualTo(String value) {
            addCriterion("seat_code >=", value, "seatCode");
            return (Criteria) this;
        }

        public Criteria andSeatCodeLessThan(String value) {
            addCriterion("seat_code <", value, "seatCode");
            return (Criteria) this;
        }

        public Criteria andSeatCodeLessThanOrEqualTo(String value) {
            addCriterion("seat_code <=", value, "seatCode");
            return (Criteria) this;
        }

        public Criteria andSeatCodeLike(String value) {
            addCriterion("seat_code like", value, "seatCode");
            return (Criteria) this;
        }

        public Criteria andSeatCodeNotLike(String value) {
            addCriterion("seat_code not like", value, "seatCode");
            return (Criteria) this;
        }

        public Criteria andSeatCodeIn(List<String> values) {
            addCriterion("seat_code in", values, "seatCode");
            return (Criteria) this;
        }

        public Criteria andSeatCodeNotIn(List<String> values) {
            addCriterion("seat_code not in", values, "seatCode");
            return (Criteria) this;
        }

        public Criteria andSeatCodeBetween(String value1, String value2) {
            addCriterion("seat_code between", value1, value2, "seatCode");
            return (Criteria) this;
        }

        public Criteria andSeatCodeNotBetween(String value1, String value2) {
            addCriterion("seat_code not between", value1, value2, "seatCode");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNull() {
            addCriterion("task_name is null");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNotNull() {
            addCriterion("task_name is not null");
            return (Criteria) this;
        }

        public Criteria andTaskNameEqualTo(String value) {
            addCriterion("task_name =", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotEqualTo(String value) {
            addCriterion("task_name <>", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThan(String value) {
            addCriterion("task_name >", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThanOrEqualTo(String value) {
            addCriterion("task_name >=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThan(String value) {
            addCriterion("task_name <", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThanOrEqualTo(String value) {
            addCriterion("task_name <=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLike(String value) {
            addCriterion("task_name like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotLike(String value) {
            addCriterion("task_name not like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameIn(List<String> values) {
            addCriterion("task_name in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotIn(List<String> values) {
            addCriterion("task_name not in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameBetween(String value1, String value2) {
            addCriterion("task_name between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotBetween(String value1, String value2) {
            addCriterion("task_name not between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskCodeIsNull() {
            addCriterion("task_code is null");
            return (Criteria) this;
        }

        public Criteria andTaskCodeIsNotNull() {
            addCriterion("task_code is not null");
            return (Criteria) this;
        }

        public Criteria andTaskCodeEqualTo(String value) {
            addCriterion("task_code =", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeNotEqualTo(String value) {
            addCriterion("task_code <>", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeGreaterThan(String value) {
            addCriterion("task_code >", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeGreaterThanOrEqualTo(String value) {
            addCriterion("task_code >=", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeLessThan(String value) {
            addCriterion("task_code <", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeLessThanOrEqualTo(String value) {
            addCriterion("task_code <=", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeLike(String value) {
            addCriterion("task_code like", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeNotLike(String value) {
            addCriterion("task_code not like", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeIn(List<String> values) {
            addCriterion("task_code in", values, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeNotIn(List<String> values) {
            addCriterion("task_code not in", values, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeBetween(String value1, String value2) {
            addCriterion("task_code between", value1, value2, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeNotBetween(String value1, String value2) {
            addCriterion("task_code not between", value1, value2, "taskCode");
            return (Criteria) this;
        }
    }

    /**
     * t_ct_touch
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * t_ct_touch 2018-10-31
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}