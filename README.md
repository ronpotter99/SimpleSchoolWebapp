# SimpleSchoolWebapp
This is a simple demonstration of a web application using Spring for the backend and Angular for the frontend.

## Instructions for running

### Frontend
1. Navigate to the 'angular-frontend' directory in the terminal
2. Download and install the latest version of NVM (Node Version Manager)
    1. On Windows, this Github repository can be used: https://github.com/coreybutler/nvm-windows/releases
    2. Use the 'nvm-setup.zip' release asset
    3. Running `nvm --version` in the terminal will verify successful installation
        1. The terminal may need re-started before the newly installed package is available
3. Run `nvm install 16.20.0`
4. Run `nvm use 16.20.0`
    1. Verify node and npm versions are correctly installed by running the following (You may need to restart the teriminal):
        1. `node --version`
            1. This should show `v16.20.0`
        2. `npm --version`
            1. This should show `8.19.4`
4. Run `npm install`
    1. This may take a while to download
5. Run `npm start`

The default URL for the frontend is `localhost:4200/`

### Backend
1. Install the Java 17 JDK
2. Navigate to the 'spring-backend' directory in the terminal
3. Run `./gradlew.bat bootRun`
    1. The command may also be `./gradlew bootRun` or `gradlew bootRun`, depending on your system

The default URL for the backend is `localhost:8080/`


#### Built and referenced as a training outreach tool for Kingland Corporation
