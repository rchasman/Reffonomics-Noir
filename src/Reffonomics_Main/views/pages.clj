(ns Reffonomics-Main.views.pages
  (:require [Reffonomics-Main.views.common :as template])
  (:use [noir.core]
        [hiccup.core]))

(defpage "/hello/:user" {:keys [user]}
         (template/layout
           [:p (str "Hello " user "!")]))
