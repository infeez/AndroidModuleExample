FROM agoda/docker-emulator-android-28

ENV MARATHON_VER "0.5.1"
ENV PATH="${PATH}:/opt/marathon-${MARATHON_VER}/bin"

RUN apt-get update && \
    yes | apt-get install unzip && \
    yes | apt-get install openjdk-8-jdk && \
    apt-get -yq autoremove && \
    apt-get clean && \
    apt-get autoclean && \
    rm -rf /var/lib/apt/lists/* /tmp/* /var/tmp/*

RUN mkdir -p /opt/marathon && \
    curl -sL "https://github.com/Malinskiy/marathon/releases/download/${MARATHON_VER}/marathon-${MARATHON_VER}.zip" -o /opt/marathon.zip && \
    unzip /opt/marathon.zip -d /opt && \
    rm /opt/marathon.zip

COPY entrypoint.sh /opt/entrypoint.sh

RUN mkdir -p /opt/test/apks && \
    chmod +x /opt/entrypoint.sh

COPY Marathonfile.yml /Marathonfile
COPY app/build/outputs/apk/debug/app-debug.apk /opt/test/apk/app-debug.apk
COPY app/build/outputs/apk/androidTest/debug/app-debug-androidTest.apk /opt/test/apk/app-debug-androidTest.apk

ENTRYPOINT ["/opt/entrypoint.sh"]