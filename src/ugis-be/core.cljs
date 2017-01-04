(ns ugis-be.core
    (:require [reagent.core :as reagent]))

;; -------------------------
;; Views

(defn home-page []
  [:div
   [:h2 "Under construction, again"]
   [:h3 "Currently migrating to cljs Reagent from plain HTML"]
   [:h4 "Probably overkill :) "]])

;; -------------------------
;; Initialize app

(defn mount-root []
  (reagent/render [home-page] (.getElementById js/document "app")))

(defn init! []
  (mount-root))
