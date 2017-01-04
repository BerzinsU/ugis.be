(ns ugis.be.prod
  (:require [ugis.be.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
