(defproject org.cyverse/common-cfg "2.8.4-SNAPSHOT"
  :description "DE services code for managing configurations."
  :url "https://github.com/cyverse-de/common-cfg"
  :license {:name "BSD"}
  :deploy-repositories [["releases" :clojars]
                        ["snapshots" :clojars]]
  :plugins [[jonase/eastwood "1.4.3"]
            [lein-ancient "0.7.0"]
            [test2junit "1.4.4"]]
  :dependencies [[org.clojure/clojure "1.11.3"]
                 [org.clojure/tools.logging "1.3.0"]
                 [bouncer "1.0.1" :exclusions [org.clojure/clojurescript]]
                 [medley "1.4.0"]
                 [me.raynes/fs "1.4.6"]
                 [uri "1.1.0"]])
