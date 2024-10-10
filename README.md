# SOS
https://lnkd.in/d44HGvdZ

https://www.linkedin.com/jobs/view/3991516201/?eBP=CwEAAAGSZ53-cuZAkLZBIISVKWMBKUfhpCcP8683_yYT0TaaXmxlz-G-H4_eJDUUDqpNW9YxzvR89WBYFGz996yG0bM25D8j-gW8ffmV_uSg3_cIR08E53YE4PEHmMn9sQU6JOADcWzu0mBYGQ5f_z_uH_38O1kSV_YJGGls3eCWajYY2RGDlHQ7Z7VCbuMX1GJZWTusa8EtdvzUwpRObvVdvCO-6VDsU9IiuLCODmFmaB0UdgwQZGGbTKpq9A2xbXOYLY8vlPJ28W5YM71CnvkPwhaLIMlxS8L6KWzRQiH_M91dvTcfR_7Bgs5EoS-4M3k_khVmXgQem9LcGLsRO3nmh1EeHRooHFNpud4vlb3TpR2W0kJsv_FxmqPkG8wDTlb9wddvY3ITQ5JlLbZQCbEyy0cs5ZuZ_xVNLGZJfCGbgHHAMJ3UyX0bHx107Kc3ZsPE-gDIN1mWaEl400a2pP3h&refId=uuxAQY0299Fqhw50mkvJqA%3D%3D&trackingId=lrUpbufsm%2Bai8JbGndKYsA%3D%3D&trk=flagship3_search_srp_jobs&lipi=urn%3Ali%3Apage%3Ad_flagship3_search_srp_jobs%3BG%2Bjom%2BnsTuemfsZd5PQyIw%3D%3D&lici=lrUpbufsm%2Bai8JbGndKYsA%3D%3D







http://localhost:8080/nearby-hospitals?lat=12.91938&lon=77.55633



SID
AC59a861a0e0f18378476ce10b5c5faad7

AUTH_TOKEN
b3a4ab856e7fc06b0633ec4b4d613b7f

+13083651164



<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
		 xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		 xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>3.3.3</version>
		<relativePath/> <!-- lookup parent from repository -->
	</parent>
	<groupId>com.Twilio</groupId>
	<artifactId>Twilio</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<name>Twilio</name>
	<description>Demo project for Spring Boot</description>

	<properties>
		<java.version>21</java.version>
	</properties>

	<dependencyManagement>
		<dependencies>
			<dependency>
				<groupId>org.springframework.cloud</groupId>
				<artifactId>spring-cloud-dependencies</artifactId>
				<version>2022.0.6</version> <!-- Use a valid version -->
				<type>pom</type>
				<scope>import</scope>
			</dependency>
		</dependencies>
	</dependencyManagement>

	<dependencies>
		<dependency>
			<groupId>com.twilio.sdk</groupId>
			<artifactId>twilio</artifactId>
			<version>8.31.1</version>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-mongodb</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-openfeign</artifactId>
		</dependency>
		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>

	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
				<configuration>
					<excludes>
						<exclude>
							<groupId>org.projectlombok</groupId>
							<artifactId>lombok</artifactId>
						</exclude>
					</excludes>
				</configuration>
			</plugin>
		</plugins>
	</build>
</project>











<properties>
    <java.version>21</java.version>
</properties>

<dependencyManagement>
    <dependencies>
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-dependencies</artifactId>
            <version>2023.0.0</version> <!-- Updated to a compatible version -->
            <type>pom</type>
            <scope>import</scope>
        </dependency>
    </dependencies>
</dependencyManagement>

<dependencies>
    <dependency>
        <groupId>com.twilio.sdk</groupId>
        <artifactId>twilio</artifactId>
        <version>8.31.1</version>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-mongodb</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-openfeign</artifactId>
    </dependency>
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <optional>true</optional>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
</dependencies>

<build>
    <plugins>
        <plugin>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-maven-plugin</artifactId>
            <configuration>
                <excludes>
                    <exclude>
                        <groupId>org.projectlombok</groupId>
                        <artifactId>lombok</artifactId>
                    </exclude>
                </excludes>
            </configuration>
        </plugin>
    </plugins>
</build>

