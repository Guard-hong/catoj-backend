package com.hcj.catoj.common;

import java.io.Serializable;
import lombok.Data;

/**
 * 删除请求
 *
 * @author hcj
 * @from 虹猫工作室
 */
@Data
public class DeleteRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}