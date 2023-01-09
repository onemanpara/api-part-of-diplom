package in.reqres.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListOfUsersModel {

    private Integer page, per_page, total, total_pages;
    private List<UserData> data;

}
