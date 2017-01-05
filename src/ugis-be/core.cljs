(ns ugis-be.core
  (:require [reagent.core :as reagent]
            [ugis-be.components :as c]))

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
              :src   "https://media.giphy.com/media/3ornk57KwDXf81rjWM/giphy.gif"}]
       [c/h1 "My name is Uģis"]
       [:section {:style {:align-self "flex-start"}}
        [c/h2 "Current endevours:"]
        [:ul {:style {:margin-bottom 25
                      :padding-left  20}}
         [:li "Making this page.... (now on ClojureScript)"]
         [:li "Working together with some cool people "]
         [:li "Co-organizing \"FrontEnd Meetup Riga\""]
         [:li "Learning to fly drone"]
         [:li "Planning on making 2017 awesome"]]]
       [:section {:style {:align-self "flex-start"}}
        [c/h2 "Where to contact:"]
        [:ul {:style {:margin-bottom 25
                      :padding-left  20}}
         [:li
          [:a {:href "mailto:berzinsu@gmail.com"}
           "berzinsu@gmail.com"]]]]
       [c/h3
        "More comming soon... (tomorow)"]])

;; -------------------------
;; Initialize app

(defn mount-root []
      (reagent/render [home-page] (.getElementById js/document "app")))

(defn init! []
      (mount-root))
