(defproject org.cyverse/common-cfg "2.8.3-SNAPSHOT"
  :description "DE services code for managing configurations."
  :url "https://github.com/cyverse-de/common-cfg"
  :license {:name "BSD"}
  :deploy-repositories [["releases" :clojars]
                        ["snapshots" :clojars]]
  :plugins [[test2junit "1.2.2"]]
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/tools.logging "0.3.1"]
                 [bouncer "0.3.2" :exclusions [org.clojure/clojurescript]]
                 [medley "0.5.5"]
                 [me.raynes/fs "1.4.6"]
                 [uri "1.1.0"]])
