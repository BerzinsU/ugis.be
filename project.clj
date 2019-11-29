(defproject ugis-be "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/clojurescript "1.10.520"
                  :exclusions [com.google.javascript/closure-compiler-unshaded
                               org.clojure/google-closure-library]]
                 [thheller/shadow-cljs "2.8.69"]
                 [reagent "0.9.0-rc2"]
                 [re-frame "0.11.0-rc2"]]

  :plugins [[day8/lein-git-inject "0.0.2"]
            [lein-shadow "0.1.6"]]

  :middleware [leiningen.git-inject/middleware]

  :min-lein-version "2.5.0"

  :clean-targets ^{:protect false}
  [:target-path
   "shadow-cljs.edn"
   "package.json"
   "package-lock.json"
   "docs/js"]

  :resource-paths ["docs"]

  :shadow-cljs {:nrepl  {:port 8777}
                :builds {:client
                         {:target       :browser
                          :output-dir   "docs/js"
                          :devtools     {:http-root "docs"
                                         :http-port 8280}
                          :modules      {:client {:init-fn ugis_be.core/run}}}}}
                         ;:release
                         ;{:target       :browser
                         ; :source-paths ["src" "env/prod/cljs"]
                         ; :compiler
                         ;               {:output-to     "docs/js/app.js"
                         ;                :output-dir    "docs/js/release"
                         ;                :asset-path    "js/out"
                         ;                :optimizations :advanced
                         ;                :pretty-print  false}}}}

  :aliases {"release"  ["do" "clean" ["cljsbuild" "once" "release"]]
            "dev-auto" ["shadow" "watch" "client"]})
