(defproject ragtime/ragtime.sql.files "0.3.1"
  :description "Ragtime adapter that reads migrations from SQL files."
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [org.clojure/java.jdbc "0.2.3"]]
  :profiles
  {:dev {:dependencies [[com.h2database/h2 "1.3.160"]
                        [ragtime/ragtime.sql "0.3.1"]]}})
