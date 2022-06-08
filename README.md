# Shop

###  Simple Shop with Microservices built using https://github.com/sachinsshetty/revive/


![Build](https://github.com/slabstech/shop/actions/workflows/all_branch.yml/badge.svg)
![CodeQL](https://github.com/slabstech/shop/actions/workflows/codeql-analysis.yml/badge.svg)

#### Status

| Docker Image        | Docker Hub Repo                                                                                 | Github Package Registry                                                                           |     Size(Mb)                                       | Status                                                                                                               |
|---------------------|-------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------|
| Server - Dropwizard | [slabstech/shop-server-dropwizard](https://hub.docker.com/r/slabstech/shop-server-dropwizard) | [shop-server-dropwizard](https://github.com/slabstech/shop/pkgs/container/shop-server-dropwizard) |109.2    | ![Dropwizard](https://github.com/slabstech/shop/actions/workflows/push_docker_server_dropwizard.yml/badge.svg) |
| Client - ReactJS    | [slabstech/shop-client-reactjs](https://hub.docker.com/r/slabstech/shop-client-reactjs)       | [shop-client-reactjs](https://github.com/slabstech/shop/pkgs/container/shop-client-reactjs)       |54.13    | ![ReactJS](https://github.com/slabstech/shop/actions/workflows/push_docker_client_reactjs.yml/badge.svg)       |
| DB - PostgreSQL     | [slabstech/shop-db-postgresql](https://hub.docker.com/r/slabstech/shop-db-postgresql)         | [shop-db-postgresql](https://github.com/slabstech/shop/pkgs/container/shop-db-postgresql)         |80.07    | ![PostgreSQL](https://github.com/slabstech/shop/actions/workflows/push_docker_db_postgresql.yml/badge.svg)           |



##### Execution Steps :
| Step                                           | Command                                    | Description                             |
|------------------------------------------------|--------------------------------------------|-----------------------------------------|
| Build Image: Dropwizard + PostgreSQL + ReactJS | ./gradlew createAppDockerImages_dropwizard | To compile code and build docker images |
| Run: Dropwizard + PostgreSQL + ReactJS         | ./gradlew runAppDocker_dropwizard          | To run with docker-compose              |
| Stop: Dropwizard + PostgreSQL + ReactJS        | ./gradlew stopAppDocker_dropwizard         | To Stop Docker Run                      |
| Run : ReactJS Client                           | ./gradlew runReactJSClient                 | Run Client ReactJS                      |
| Run : Dropwizard Server                        | ./gradlew runDropwizardServer      | Run Server Dropwizard                   |

* Access the application at localhost:3000


#### Important Links
* Documents maintained at Wiki - [https://github.com/slabstech/shop/wiki](https://github.com/slabstech/shop/wiki)

| Description       | Document                                                                |
|-------------------|-------------------------------------------------------------------------|
| For Build steps   | [Build](https://github.com/slabstech/shop/wiki/Build)             |
| For Release notes | [Releases](https://github.com/slabstech/shop/wiki/Release)        |
| FAQs              | [FAQ](https://github.com/slabstech/shop/wiki/Project-Demo-Revive) |
| For Sprint Task   | [Sprint](https://github.com/slabstech/shop/wiki/Sprint)           |
| For Sprint Logs   | [Sprint_logs](https://github.com/slabstech/shop/wiki/Sprint-Logs) |
| Project roadmap   | [Roadmap](https://github.com/slabstech/shop/projects/1)           |


#### Tech Stack

| Version | Client  | Server     | Database   | Cloud Deploy | 
|---------|---------|------------|------------|--------------|
| 0.0.1   | ReactJS | DropWizard | PostgreSQL | MS Azure   |


| Tech                 | Version | Status  | Use Case                  | App Version                                                           |
|----------------------|---------|---------|---------------------------|-----------------------------------------------------------------------|
| Java                 | 17      | Done    | Programming Language      | [v0.0.1](https://github.com/slabstech/shop/releases/tag/v0.0.1) |
| JUnit                | 4       | Done    | Unit/Integration Test     | [v0.0.1](https://github.com/slabstech/shop/releases/tag/v0.0.1) |
| git + Github Actions | 2.34.1  | Done    | Version Control, CI/CD    | [v0.0.1](https://github.com/slabstech/shop/releases/tag/v0.0.1) |
| Docker               | 20      | Done    | Micro services deployment | [v0.0.1](https://github.com/slabstech/shop/releases/tag/v0.0.1) |
| Custom JRE           | 17      | Done    | Reduce Server Size        | [v0.0.1](https://github.com/slabstech/shop/releases/tag/v0.0.1) |
| NodeJs               | 16      | Done    | Client Framework          | [v0.0.1](https://github.com/slabstech/shop/releases/tag/v0.0.1) |
| Nginx                | 1.22    | Done    | Client Server             | [v0.0.1](https://github.com/slabstech/shop/releases/tag/v0.0.1) |
| Kubernetes           | --      | --      | Container Orchestration   | --                                                                    |
| OAuth / Okta         | --      | --      | Authentication            | --                                                                    |
| Apache Kafka         | --      | --      | Message Queue             | --                                                                    |
| Microsoft Azure      | --      | --      | Cloud Deployment          | --                                                                    |


* Outcome
  * [Blog- WIP - How to migrate project from Monolith to Microservice](https://slabstech.github.io/blog/monolith-microservice/)

#### Sponsors


Revive is awaiting Sponsors for creating more templates


#### Currently being develops with 

* IntelliJ Idea Trial Licences
* VMWare WorkstationPlayer 16
* Github
