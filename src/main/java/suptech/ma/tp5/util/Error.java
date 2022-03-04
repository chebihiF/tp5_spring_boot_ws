package suptech.ma.tp5.util;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class Error implements IError {
    private String type;
    private String value ;
}
