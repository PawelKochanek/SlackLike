package commands;

import com.beust.jcommander.Parameter;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Register extends ChatCommand{

    @Parameter(names = {"--username", "-u"}, required = true)
    private String username;

    @Parameter(names = {"--password", "-p"}, required = true, password = true)
    private String password;
}
