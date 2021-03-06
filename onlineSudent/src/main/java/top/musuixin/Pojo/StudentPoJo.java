package top.musuixin.Pojo;
/**
 * @author musuixin
 * @date 2019-04-20 21:00
 */

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Data
@Component
public class StudentPoJo{
    private int studentId;
    private String studentName;
    @JSONField(serialize=false)
    private String studentPwd;
    private String studentAge;
    private String studentSex;
    private String studentOc;
}
