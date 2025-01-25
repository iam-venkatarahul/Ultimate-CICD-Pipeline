# Ultimate CICD Pipeline #
![cicd pipeline](https://github.com/user-attachments/assets/6154ba83-b94b-4771-95e5-ed06c8ba8084)

This Jenkins pipeline can be summarized into the following jobs:

1. **Trigger Build:** A webhook triggers Jenkins upon changes to the source code repository.

2. **Build and Compile:** Jenkins runs Maven to build and compile the application.

3. **Code Quality Analysis using SonarQube**: Maven invokes SonarQube to check code quality, If code quality fails, the pipeline exits with a report.

4. **Run Tests:** If SonarQube passes, tests are executed, If tests fail, the pipeline exits with a report.

5. **Build & Publish Docker Image:** If tests succeed, a new Docker image is built and pushed to DockerHub.

6. **Image Updater:** The new image version is updated in the Kubernetes manifests repository using a shell script.

7. **Continuous Deployment:** Argo CD pulls the updated manifests and deploys the application to the Kubernetes cluster.
