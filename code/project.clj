(defproject baking-code "0.1.0-SNAPSHOT"
  :description "Code Related to Recipe Parsing for Bakes"
  :url "http://github.com/blad/bakes"
  :dependencies [[org.clojure/clojure "1.10.1"]]
  :main ^:skip-aot baking-code.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
