(ns Reffonomics-Main.views.nav
  (:require [Reffonomics-Main.views.common :as template]
            [Reffonomics-Main.views.text :as text])
  (:use [noir.core]
        [hiccup.core]
        [hiccup.page]
        [hiccup.element]))

(defpage "/navs" []
  (template/tests
    [:div.row-fluid
      [:div.span3
        (template/side-navbar)]
      [:div.span9
        [:div.hero-unit
          [:h1#tests "Test Center"]]]]))
