FROM clojure
COPY ./docker/profiles.clj /root/.lein/profiles.clj
WORKDIR /usr/src/common-cfg

COPY project.clj /usr/src/common-cfg/
RUN lein deps

COPY . /usr/src/common-cfg
CMD ["lein", "test"]
