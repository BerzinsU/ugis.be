(ns ugis_be.core
  (:require [reagent.core :as reagent]
            [re-frame.core :as rf]
            [ugis_be.components :as c]))

;; -------------------------
;; Views

(defn home-page []
      [:div {:style {:display        "flex"
                     :flex-direction "column"
                     :align-items    "center"}}
       [:img {:style {:margin-bottom 25
                      :max-width     "100%"
                      :width         "auto"
                      :height        "auto"}
              :src   "https://media2.giphy.com/media/Nx0rz3jtxtEre/giphy.gif"}]
       [c/h1 "My name is Uģis"]
       [:section {:style {:align-self "flex-start"}}
        [c/h2 "Current endevours:"]
        [:ul {:style {:margin-bottom 25
                      :padding-left  20}}
         [:li "Making this page.... (now on ClojureScript)"]]]
       [:section {:style {:align-self "flex-start"}}
        [c/h2 "Where to contact:"]
        [:ul {:style {:margin-bottom 25
                      :padding-left  20}}
         [:li
          [:a {:href "mailto:berzinsu@gmail.com"}
           "berzinsu@gmail.com"]]]]
       [c/h3
        "More coming soon..."]])

;; -------------------------
;; Initialize app

(defn render
  []
  (reagent/render [home-page]
                  (js/document.getElementById "app")))

(defn ^:dev/after-load clear-cache-and-render!
  []
  ;; The `:dev/after-load` metadata causes this function to be called
  ;; after shadow-cljs hot-reloads code. We force a UI update by clearing
  ;; the Reframe subscription cache.
  (rf/clear-subscription-cache!)
  (render))

(defn run
  []
  (render))                         ;; mount the application's ui into '<div id="app" />'
