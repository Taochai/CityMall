package com.citymall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author Eric chai
 * @email qinshuichaitao@gmail.com
 * @date 2020-07-22 01:04:53
 */
@Data
@TableName("QRTZ_TRIGGERS")
public class QrtzTriggersEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String schedName;
	/**
	 * 
	 */
	private String triggerName;
	/**
	 * 
	 */
	private String triggerGroup;
	/**
	 * 
	 */
	private String jobName;
	/**
	 * 
	 */
	private String jobGroup;
	/**
	 * 
	 */
	private String description;
	/**
	 * 
	 */
	private Long nextFireTime;
	/**
	 * 
	 */
	private Long prevFireTime;
	/**
	 * 
	 */
	private Integer priority;
	/**
	 * 
	 */
	private String triggerState;
	/**
	 * 
	 */
	private String triggerType;
	/**
	 * 
	 */
	private Long startTime;
	/**
	 * 
	 */
	private Long endTime;
	/**
	 * 
	 */
	private String calendarName;
	/**
	 * 
	 */
	private Integer misfireInstr;
	/**
	 * 
	 */
	private Blob jobData;

}
