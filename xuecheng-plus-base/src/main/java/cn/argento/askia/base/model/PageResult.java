package cn.argento.askia.base.model;

import lombok.*;

import java.io.Serializable;
import java.util.List;

/**
 * 分页结果模型
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class PageResult<T> implements Serializable {


    private static final long serialVersionUID = -907927771789294942L;
    // 该页的数据
    private List<T> items;

    // 总数据量
    private Long counts;

    // 页码
    private Long page;

    // 一页的数量
    private Long pageSize;


}
