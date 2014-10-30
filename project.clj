(defproject om-tut "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2371"]
                 [org.clojure/core.async "0.1.267.0-0d7780-alpha"]
                 [om "0.8.0-alpha1"]]

  :plugins [[lein-cljsbuild "1.0.3"]
            [lein-ancient "0.5.5"]]

  :source-paths ["src"]

  :cljsbuild {
    :builds [{:id "om-tut"
              :source-paths ["src"]
              :compiler {
                :output-to "om_tut.js"
                :output-dir "out"
                :optimizations :none
                :source-map true}}]})
