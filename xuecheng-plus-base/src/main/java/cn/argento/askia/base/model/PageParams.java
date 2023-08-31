package cn.argento.askia.base.model;

import lombok.*;

/**
 * 分页查询参数！！
 */
@AllArgsConstructor
@Setter
@Getter
@ToString
@Data
@EqualsAndHashCode
public class PageParams {

    private Long pageNo;
    private Long pageSize;

    public PageParams(){
        this.pageNo = 1L;
        this.pageSize = 10L;
    }

}
