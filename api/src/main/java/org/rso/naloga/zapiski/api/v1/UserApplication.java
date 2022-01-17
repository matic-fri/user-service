package org.rso.naloga.zapiski.api.v1;


import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.info.License;
import org.eclipse.microprofile.openapi.annotations.servers.Server;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;


@OpenAPIDefinition(info = @Info(title = "User service API", version = "v1",
        contact = @Contact(email = "mi5658@student.uni-lj.si"),
        license = @License(name = "dev"), description = "API for managing users."),
        servers = @Server(url = "http://104.45.79.50/users"))
@ApplicationPath("v1")
public class UserApplication extends Application {

}
