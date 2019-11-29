(ns ugis_be.components
  (:require [reagent.core :as reagent]))


(defn h1 [content]
      [:h1 {:style {:font-size     "2em"
                    :font-weight   "bold"
                    :margin-bottom 25}}
       content])

(defn h2 [content]
      [:h2 {:style {:font-size     "1.5em"
                    :font-weight   "bold"
                    :margin-bottom 15}}
       content])

(defn h3 [content]
      [:h3 {:style {:font-size     "1.17em"
                    :font-weight   "bold"
                    :margin-bottom 15}}
       content])