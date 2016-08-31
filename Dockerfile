FROM clojure
COPY . /usr/src/common-cfg
COPY ./docker/profiles.clj /root/.lein/profiles.clj
WORKDIR /usr/src/common-cfg
RUN lein deps
CMD ["lein", "test"]
