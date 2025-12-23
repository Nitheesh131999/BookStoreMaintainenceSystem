package com.nitheeshkumar.Programms.bookmaintainance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookStoreMaintainanceSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookStoreMaintainanceSystemApplication.class, args);
	}

}



O/P :- 


  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

[32m :: Spring Boot :: [39m              [2m (v3.5.8)[0;39m

[2m2025-12-04T09:54:33.171+05:30[0;39m [32m INFO[0;39m [35m14548[0;39m [2m--- [BookStoreMaintainanceSystem] [           main] [0;39m[36mb.BookStoreMaintainanceSystemApplication[0;39m [2m:[0;39m Starting BookStoreMaintainanceSystemApplication using Java 21.0.7 with PID 14548 (C:\Users\Hi\Documents\workspace-spring-tools-for-eclipse-4.31.0.RELEASE\springfullcourse\BookStoreMaintainanceSystem\target\classes started by DELL in C:\Users\Hi\Documents\workspace-spring-tools-for-eclipse-4.31.0.RELEASE\springfullcourse\BookStoreMaintainanceSystem)
[2m2025-12-04T09:54:33.176+05:30[0;39m [32m INFO[0;39m [35m14548[0;39m [2m--- [BookStoreMaintainanceSystem] [           main] [0;39m[36mb.BookStoreMaintainanceSystemApplication[0;39m [2m:[0;39m No active profile set, falling back to 1 default profile: "default"
[2m2025-12-04T09:54:34.257+05:30[0;39m [32m INFO[0;39m [35m14548[0;39m [2m--- [BookStoreMaintainanceSystem] [           main] [0;39m[36m.s.d.r.c.RepositoryConfigurationDelegate[0;39m [2m:[0;39m Bootstrapping Spring Data JPA repositories in DEFAULT mode.
[2m2025-12-04T09:54:34.343+05:30[0;39m [32m INFO[0;39m [35m14548[0;39m [2m--- [BookStoreMaintainanceSystem] [           main] [0;39m[36m.s.d.r.c.RepositoryConfigurationDelegate[0;39m [2m:[0;39m Finished Spring Data repository scanning in 70 ms. Found 1 JPA repository interface.
[2m2025-12-04T09:54:34.970+05:30[0;39m [32m INFO[0;39m [35m14548[0;39m [2m--- [BookStoreMaintainanceSystem] [           main] [0;39m[36mo.s.b.w.embedded.tomcat.TomcatWebServer [0;39m [2m:[0;39m Tomcat initialized with port 8080 (http)
[2m2025-12-04T09:54:34.996+05:30[0;39m [32m INFO[0;39m [35m14548[0;39m [2m--- [BookStoreMaintainanceSystem] [           main] [0;39m[36mo.apache.catalina.core.StandardService  [0;39m [2m:[0;39m Starting service [Tomcat]
[2m2025-12-04T09:54:34.997+05:30[0;39m [32m INFO[0;39m [35m14548[0;39m [2m--- [BookStoreMaintainanceSystem] [           main] [0;39m[36mo.apache.catalina.core.StandardEngine   [0;39m [2m:[0;39m Starting Servlet engine: [Apache Tomcat/10.1.49]
[2m2025-12-04T09:54:35.096+05:30[0;39m [32m INFO[0;39m [35m14548[0;39m [2m--- [BookStoreMaintainanceSystem] [           main] [0;39m[36mo.a.c.c.C.[Tomcat].[localhost].[/]      [0;39m [2m:[0;39m Initializing Spring embedded WebApplicationContext
[2m2025-12-04T09:54:35.097+05:30[0;39m [32m INFO[0;39m [35m14548[0;39m [2m--- [BookStoreMaintainanceSystem] [           main] [0;39m[36mw.s.c.ServletWebServerApplicationContext[0;39m [2m:[0;39m Root WebApplicationContext: initialization completed in 1815 ms
[2m2025-12-04T09:54:35.339+05:30[0;39m [32m INFO[0;39m [35m14548[0;39m [2m--- [BookStoreMaintainanceSystem] [           main] [0;39m[36mo.hibernate.jpa.internal.util.LogHelper [0;39m [2m:[0;39m HHH000204: Processing PersistenceUnitInfo [name: default]
[2m2025-12-04T09:54:35.428+05:30[0;39m [32m INFO[0;39m [35m14548[0;39m [2m--- [BookStoreMaintainanceSystem] [           main] [0;39m[36morg.hibernate.Version                   [0;39m [2m:[0;39m HHH000412: Hibernate ORM core version 6.6.36.Final
[2m2025-12-04T09:54:35.509+05:30[0;39m [32m INFO[0;39m [35m14548[0;39m [2m--- [BookStoreMaintainanceSystem] [           main] [0;39m[36mo.h.c.internal.RegionFactoryInitiator   [0;39m [2m:[0;39m HHH000026: Second-level cache disabled
[2m2025-12-04T09:54:36.056+05:30[0;39m [32m INFO[0;39m [35m14548[0;39m [2m--- [BookStoreMaintainanceSystem] [           main] [0;39m[36mo.s.o.j.p.SpringPersistenceUnitInfo     [0;39m [2m:[0;39m No LoadTimeWeaver setup: ignoring JPA class transformer
[2m2025-12-04T09:54:36.114+05:30[0;39m [32m INFO[0;39m [35m14548[0;39m [2m--- [BookStoreMaintainanceSystem] [           main] [0;39m[36mcom.zaxxer.hikari.HikariDataSource      [0;39m [2m:[0;39m HikariPool-1 - Starting...
[2m2025-12-04T09:54:36.724+05:30[0;39m [32m INFO[0;39m [35m14548[0;39m [2m--- [BookStoreMaintainanceSystem] [           main] [0;39m[36mcom.zaxxer.hikari.pool.HikariPool       [0;39m [2m:[0;39m HikariPool-1 - Added connection com.mysql.cj.jdbc.ConnectionImpl@175ac243
[2m2025-12-04T09:54:36.727+05:30[0;39m [32m INFO[0;39m [35m14548[0;39m [2m--- [BookStoreMaintainanceSystem] [           main] [0;39m[36mcom.zaxxer.hikari.HikariDataSource      [0;39m [2m:[0;39m HikariPool-1 - Start completed.
[2m2025-12-04T09:54:36.822+05:30[0;39m [33m WARN[0;39m [35m14548[0;39m [2m--- [BookStoreMaintainanceSystem] [           main] [0;39m[36morg.hibernate.orm.deprecation           [0;39m [2m:[0;39m HHH90000025: MySQL8Dialect does not need to be specified explicitly using 'hibernate.dialect' (remove the property setting and it will be selected by default)
[2m2025-12-04T09:54:36.824+05:30[0;39m [33m WARN[0;39m [35m14548[0;39m [2m--- [BookStoreMaintainanceSystem] [           main] [0;39m[36morg.hibernate.orm.deprecation           [0;39m [2m:[0;39m HHH90000026: MySQL8Dialect has been deprecated; use org.hibernate.dialect.MySQLDialect instead
[2m2025-12-04T09:54:36.856+05:30[0;39m [32m INFO[0;39m [35m14548[0;39m [2m--- [BookStoreMaintainanceSystem] [           main] [0;39m[36morg.hibernate.orm.connections.pooling   [0;39m [2m:[0;39m HHH10001005: Database info:
	Database JDBC URL [Connecting through datasource 'HikariDataSource (HikariPool-1)']
	Database driver: undefined/unknown
	Database version: 8.0
	Autocommit mode: undefined/unknown
	Isolation level: undefined/unknown
	Minimum pool size: undefined/unknown
	Maximum pool size: undefined/unknown
[2m2025-12-04T09:54:38.252+05:30[0;39m [32m INFO[0;39m [35m14548[0;39m [2m--- [BookStoreMaintainanceSystem] [           main] [0;39m[36mo.h.e.t.j.p.i.JtaPlatformInitiator      [0;39m [2m:[0;39m HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
[2m2025-12-04T09:54:38.423+05:30[0;39m [32m INFO[0;39m [35m14548[0;39m [2m--- [BookStoreMaintainanceSystem] [           main] [0;39m[36mj.LocalContainerEntityManagerFactoryBean[0;39m [2m:[0;39m Initialized JPA EntityManagerFactory for persistence unit 'default'
[2m2025-12-04T09:54:38.725+05:30[0;39m [33m WARN[0;39m [35m14548[0;39m [2m--- [BookStoreMaintainanceSystem] [           main] [0;39m[36mJpaBaseConfiguration$JpaWebConfiguration[0;39m [2m:[0;39m spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
[2m2025-12-04T09:54:39.230+05:30[0;39m [32m INFO[0;39m [35m14548[0;39m [2m--- [BookStoreMaintainanceSystem] [           main] [0;39m[36mo.s.b.w.embedded.tomcat.TomcatWebServer [0;39m [2m:[0;39m Tomcat started on port 8080 (http) with context path '/'
[2m2025-12-04T09:54:39.245+05:30[0;39m [32m INFO[0;39m [35m14548[0;39m [2m--- [BookStoreMaintainanceSystem] [           main] [0;39m[36mb.BookStoreMaintainanceSystemApplication[0;39m [2m:[0;39m Started BookStoreMaintainanceSystemApplication in 6.91 seconds (process running for 8.629)
[2m2025-12-04T09:58:26.711+05:30[0;39m [32m INFO[0;39m [35m14548[0;39m [2m--- [BookStoreMaintainanceSystem] [nio-8080-exec-2] [0;39m[36mo.a.c.c.C.[Tomcat].[localhost].[/]      [0;39m [2m:[0;39m Initializing Spring DispatcherServlet 'dispatcherServlet'
[2m2025-12-04T09:58:26.713+05:30[0;39m [32m INFO[0;39m [35m14548[0;39m [2m--- [BookStoreMaintainanceSystem] [nio-8080-exec-2] [0;39m[36mo.s.web.servlet.DispatcherServlet       [0;39m [2m:[0;39m Initializing Servlet 'dispatcherServlet'
[2m2025-12-04T09:58:26.723+05:30[0;39m [32m INFO[0;39m [35m14548[0;39m [2m--- [BookStoreMaintainanceSystem] [nio-8080-exec-2] [0;39m[36mo.s.web.servlet.DispatcherServlet       [0;39m [2m:[0;39m Completed initialization in 10 ms
Hibernate: select b1_0.id,b1_0.author,b1_0.price,b1_0.published_date,b1_0.title from books b1_0
Hibernate: select b1_0.id,b1_0.author,b1_0.price,b1_0.published_date,b1_0.title from books b1_0
Hibernate: select b1_0.id,b1_0.author,b1_0.price,b1_0.published_date,b1_0.title from books b1_0
Hibernate: insert into books (author,price,published_date,title) values (?,?,?,?)
Hibernate: insert into books (author,price,published_date,title) values (?,?,?,?)
[2m2025-12-04T10:18:09.839+05:30[0;39m [33m WARN[0;39m [35m14548[0;39m [2m--- [BookStoreMaintainanceSystem] [nio-8080-exec-8] [0;39m[36m.w.s.m.s.DefaultHandlerExceptionResolver[0;39m [2m:[0;39m Resolved [org.springframework.web.method.annotation.MethodArgumentTypeMismatchException: Method parameter 'id': Failed to convert value of type 'java.lang.String' to required type 'java.lang.Long'; For input string: "{1}"]
[2m2025-12-04T10:18:22.040+05:30[0;39m [33m WARN[0;39m [35m14548[0;39m [2m--- [BookStoreMaintainanceSystem] [nio-8080-exec-1] [0;39m[36m.w.s.m.s.DefaultHandlerExceptionResolver[0;39m [2m:[0;39m Resolved [org.springframework.web.method.annotation.MethodArgumentTypeMismatchException: Method parameter 'id': Failed to convert value of type 'java.lang.String' to required type 'java.lang.Long'; For input string: "{1}"]
Hibernate: select b1_0.id,b1_0.author,b1_0.price,b1_0.published_date,b1_0.title from books b1_0
[2m2025-12-04T10:24:34.912+05:30[0;39m [33m WARN[0;39m [35m14548[0;39m [2m--- [BookStoreMaintainanceSystem] [nio-8080-exec-6] [0;39m[36m.w.s.m.s.DefaultHandlerExceptionResolver[0;39m [2m:[0;39m Resolved [org.springframework.web.method.annotation.MethodArgumentTypeMismatchException: Method parameter 'id': Failed to convert value of type 'java.lang.String' to required type 'java.lang.Long'; For input string: "{2}"]
Hibernate: select b1_0.id,b1_0.author,b1_0.price,b1_0.published_date,b1_0.title from books b1_0 where b1_0.id=?
Hibernate: delete from books where id=?

