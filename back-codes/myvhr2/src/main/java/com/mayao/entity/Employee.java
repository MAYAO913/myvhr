package com.mayao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author ${author}
 * @since 2021-11-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Employee extends Model<Employee> {

    private static final long serialVersionUID=1L;

    /**
     * 员工编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 员工姓名
     */
    private String name;

    /**
     * 性别
     */
    private String gender;

    /**
     * 出生日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    private LocalDate birthday;

    /**
     * 身份证号
     */
    @TableField("idCard")
    private String idCard;

    /**
     * 婚姻状况
     */
    private String wedlock;

    /**
     * 民族
     */
    @TableField("nationId")
    private Integer nationId;

    /**
     * 籍贯
     */
    @TableField("nativePlace")
    private String nativePlace;

    /**
     * 政治面貌
     */
    @TableField("politicId")
    private Integer politicId;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 电话号码
     */
    private String phone;

    /**
     * 联系地址
     */
    private String address;

    /**
     * 所属部门
     */
    @TableField("departmentId")
    private Integer departmentId;

    /**
     * 职称ID
     */
    @TableField("jobLevelId")
    private Integer jobLevelId;

    /**
     * 职位ID
     */
    @TableField("posId")
    private Integer posId;

    /**
     * 聘用形式
     */
    @TableField("engageForm")
    private String engageForm;

    /**
     * 最高学历
     */
    @TableField("tiptopDegree")
    private String tiptopDegree;

    /**
     * 所属专业
     */
    private String specialty;

    /**
     * 毕业院校
     */
    private String school;

    /**
     * 入职日期
     */
    @TableField("beginDate")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    private LocalDate beginDate;

    /**
     * 在职状态
     */
    @TableField("workState")
    private String workState;

    /**
     * 工号
     */
    @TableField("workID")
    private String workID;

    /**
     * 合同期限
     */
    @TableField("contractTerm")
    private Double contractTerm;

    /**
     * 转正日期
     */
    @TableField("conversionTime")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    private LocalDate conversionTime;

    /**
     * 离职日期
     */
    @TableField("notWorkDate")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    private LocalDate notWorkDate;

    /**
     * 合同起始日期
     */
    @TableField("beginContract")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    private LocalDate beginContract;

    /**
     * 合同终止日期
     */
    @TableField("endContract")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    private LocalDate endContract;

    /**
     * 工龄
     */
    @TableField("workAge")
    private Integer workAge;

    @TableField(exist = false)
    private Department department;

    @TableField(exist = false)
    private Joblevel joblevel;

    @TableField(exist = false)
    private Position position;

    @TableField(exist = false)
    private Nation nation;

    @TableField(exist = false)
    private Politicsstatus politicsstatus;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
