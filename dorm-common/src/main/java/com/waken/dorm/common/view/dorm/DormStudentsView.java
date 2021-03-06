package com.waken.dorm.common.view.dorm;

import com.waken.dorm.common.view.user.UserRoleRelView;
import io.swagger.annotations.ApiModel;

import java.util.List;

/**
 * @ClassName DormStudentsView
 * @Description DormStudentsView
 * @Author zhaoRong
 * @Date 2019/3/31 14:19
 **/
@ApiModel(value = "DormStudentsView", description = "（只能查询与宿舍存在关联的班级的学生）与宿舍已经存在关联的学生，没有关联的学生的视图")
public class DormStudentsView {
    private List<DormStudentRelView> addedList;//与宿舍已经存在关联的学生

    private List<DormStudentRelView> toBeAddList;//没有关联的学生

    public List<DormStudentRelView> getAddedList() {
        return addedList;
    }

    public void setAddedList(List<DormStudentRelView> addedList) {
        this.addedList = addedList;
    }

    public List<DormStudentRelView> getToBeAddList() {
        return toBeAddList;
    }

    public void setToBeAddList(List<DormStudentRelView> toBeAddList) {
        this.toBeAddList = toBeAddList;
    }
}
