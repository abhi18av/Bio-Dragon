(defproject bio-dragon "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [

          

                [org.clojure/clojure "1.9.0"]

  ;; String manipulation
                 [funcool/cuerdas "2.0.5"]

  ;; Shell library
                 [me.raynes/conch "0.8.0"]

  ;; Datomic free and pro
                 [com.datomic/datomic-free "0.9.5703"]
                 [com.datomic/datomic-pro "0.9.5703"]

  ;; Rules engine
                 [com.cerner/clara-rules "0.18.0"]

  ;; zcaudate
                 [zcaudate/spirit "0.9.0"]
                 [zcaudate/hara "2.8.6"]
                 [zcaudate/lucid "1.4.6"]

  ;; Hash sums
                 [pandect "0.6.1"]

  ;; Core.async
                 [org.clojure/core.async "0.4.474"]

  ;; Onyx platform
                 [org.onyxplatform/onyx "0.13.0"]
                 [org.onyxplatform/onyx-sql "0.13.0.1"]
                 [org.onyxplatform/onyx-datomic "0.13.0.0"]

  ;; Neo4j graph database
                 [gorillalabs/neo4j-clj "1.1.0"]

  ;; SQL
                 [walkable "1.0.0-SNAPSHOT"]
                 [honeysql "0.9.3"]
                 [nilenso/honeysql-postgres "0.2.4"]
                 [org.clojure/java.jdbc "0.7.7"]


  ;; This is for traversing the nested clojure data structure
                 [com.rpl/specter "1.0.3"]

  ;; Utility for traversing CLJ(S) data structures
                 [medley "1.0.0"]


  ;; JSON
                 [cheshire "5.8.0"]

  ;; XML trees
                 [org.clojure/data.xml "0.2.0-alpha5"]
                 [org.clojure/data.zip "0.1.2"]

  ;; CSV
                 [org.clojure/data.csv "0.1.4"]

  ;; For TOML
                 [toml "0.1.2"]

  ;; For YAML
                 [io.forward/yaml "1.0.7"]

  ;; Data Serialization
                 [com.cognitect/transit-clj "0.8.300"]
                 [com.taoensso/nippy "2.14.0"]
  ;; Shell library
                 [me.raynes/conch "0.8.0"]


  ;; DeepLearning4j

                 [hswick/jutsu.ai "0.1.5"]
                 [org.nd4j/nd4j-native-platform "1.0.0-beta"]

  ;; Faker libraries
                 [com.github.javafaker/javafaker "0.12"]
                 [talltale "0.2.11"]



  ])
