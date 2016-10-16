;(defproject demo "0.1.0-SNAPSHOT"
;  :description "FIXME: write description"
;  :url "http://example.com/FIXME"
;  :license {:name "Eclipse Public License"
;            :url "http://www.eclipse.org/legal/epl-v10.html"}
;  :dependencies [[org.clojure/clojure "1.8.0"]]
;  :main ^:skip-aot demo.core
;  :target-path "target/%s"
;  :profiles {:uberjar {:aot :all}})

; project.clj

(defproject demo "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :min-lein-version "2.5.3"

  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.229"]
                 [reagent "0.6.0"]]

  :plugins [[lein-cljsbuild "1.1.4"]]


  :clean-targets ^{:protect false} ["resources"]

  :cljsbuild {
              :builds [{:id "server"
                        :source-paths ["src-server"]
                        :compiler {
                                   :main demo.server
                                   :output-to "resources/public/js/server-side/server.js"
                                   :output-dir "resources/public/js/server-side"
                                   :target :nodejs
                                   :optimizations :none
                                   :source-map true}}]})