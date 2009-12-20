(defproject "a:b:c"
    :name "Polyglot Test"
    :description "Maven 3 Clojure based Polyglot test"
    :properties {"test" "test"}
    :dependencies [["org.clojure:clojure:1.1.0-alpha-SNAPSHOT"]
                   ["org.clojure:clojure-contrib"]]
    :plugins [["org.apache.maven.plugins:maven-compiler-plugin" {:configuration {"source" "1.5" "target" "1.5"}}]
              ["com.theoryinpractise:clojure-maven-plugin:1.2-SNAPSHOT" {:configuration {"testScript" "src/test/clojure/test.clj"}
                                                                         :executions [{:id "compile"
                                                                                       :phase "compile"
                                                                                       :goals ["compile"]}
                                                                                      {:id "test"
                                                                                       :phase "test"
                                                                                       :goals ["test"]}]}]])
