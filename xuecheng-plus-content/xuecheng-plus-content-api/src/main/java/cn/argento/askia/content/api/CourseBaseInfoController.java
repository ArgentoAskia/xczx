package cn.argento.askia.content.api;


import cn.argento.askia.base.model.PageParams;
import cn.argento.askia.base.model.PageResult;
import cn.argento.askia.content.dto.QueryCourseParamsDTO;
import cn.argento.askia.content.po.CourseBase;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class CourseBaseInfoController {

    @PostMapping("/course/list")
    public PageResult<CourseBase> list(PageParams pageParams,
                                       @RequestBody(required = false) QueryCourseParamsDTO queryCourseParamsDTO){

        // TODO: 2023/8/31 分页查询课程基本信息
        log.info("pageParams: pageNo={}, pageSize={}", pageParams.getPageNo(), pageParams.getPageSize());
        if (queryCourseParamsDTO != null){
            log.info("queryCourseParams: auditStatu={}, courseName={}, publishStatus={}",
                    queryCourseParamsDTO.getAuditStatus(), queryCourseParamsDTO.getCourseName(), queryCourseParamsDTO.getAuditStatus());
        }
        return null;
    }
}
