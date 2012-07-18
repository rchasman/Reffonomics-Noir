(ns Reffonomics-Main.views.pages
  (:require [Reffonomics-Main.views.common :as template]
            [Reffonomics-Main.views.text :as text])
  (:use [noir.core]
        [hiccup.core]
        [hiccup.page]
        [hiccup.element]))

(defpage "/" []
  (render "/home"))

(defpage "/home" []
  (template/home
    [:div.row-fluid
      [:div.span12
        [:div.hero-unit
          [:h1 "Welcome to Reffonomics.com"]
          [:h2 "by Steven Reff and Dick Brunell"]
        ]]]
  ))

(defpage "/basic" []
  (template/basic
    [:div.row-fluid
      [:div.span3
        (template/side-navbar)]
      [:div.span9
        [:div.hero-unit
          [:h1 "Basic Concepts"]]]]
  ))

(defpage "/micro" []
  (template/micro
    [:div.row-fluid
      [:div.span3
        (template/side-navbar)]
      [:div.span9
        [:div.hero-unit
          [:h1 "Micro Economics"]]]]
  ))

(defpage "/macro" []
  (template/macro
    [:div.row-fluid
      [:div.span3
        (template/side-navbar)]
      [:div.span9
        [:div.hero-unit
          [:h1 "Macro Economics"]]]]
  ))

(defpage "/resources" []
  (template/resources
    [:div.row-fluid
      [:div.span3
        (template/side-navbar)]
      [:div.span9
        [:div.hero-unit
          [:h1 "Resources"]]]]
  ))

(defpage "/about" []
  (template/about
    [:div.row-fluid
      [:div.span3
        (template/side-navbar)]
      [:div.span9
        [:div.hero-unit
          [:div#about]]]]))

(defpage "/about/main" []
    (html5
          [:h1 "About the Authors"]
          [:br]
          [:div.row-fluid
            [:ul.thumbnails
              [:li.span4
                [:div.thumbnail
                  [:a {:href "#Reff" :onClick "getAbout('reff')"}
                    (image {:class "about-img"} "/img/reff.jpg")
                    [:h5 "Steven Reff"]]
                  [:p "Dr. Reff teaches at the Unversity of Arizona."]]]
              [:li.span4
                [:div.thumbnail
                  [:a {:href "#Brown" :onClick "getAbout('brown')"}
                    (image {:class "about-img"} "/img/brown.jpg")
                    [:h5 "Thomas R. Brown"]]
                  [:p "Mr. Brown started a foundation."]]]
              [:li.span4
                [:div.thumbnail
                  [:a {:href "#Brunell" :onClick "getAbout('brunell')"}
                    (image {:class "about-img"} "/img/brunell.jpg")
                    [:h5 "Dick Brunell"]]
                  [:p "Dick Brunell is a man of the people for the people."]]]]]))
(defpartial about-back-button []
    [:a {:href "#"}
      [:button.pull-left {:onClick "getAbout('main')"} "Back"]])

(defpage "/about/reff" []
  (html5
    [:h1 "Steven Reff"]
    (about-back-button)
    [:br]
    [:p (text/about-reff)]
    (about-back-button)))

(defpage "/about/brunell" []
  (html5
    [:h1 "Dick Brunell"]
    (about-back-button)
    [:br]
    [:p (text/about-brunell)]
    (about-back-button)))

(defpage "/about/brown" []
  (html5
    [:h1 "Thomas R. Brown"]
    (about-back-button)
    [:br]
    [:p (text/about-brunell)]
    (about-back-button)))

(defpage "/tests" []
  (template/tests
    [:div.row-fluid
      [:div.span3
        (template/side-navbar)]
      [:div.span9
        [:div.hero-unit
          [:h1#tests "Test Center"]]]]))
