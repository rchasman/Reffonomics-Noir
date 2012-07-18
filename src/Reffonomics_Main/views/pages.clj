(ns Reffonomics-Main.views.pages
  (:require [Reffonomics-Main.views.common :as template]
            [Reffonomics-Main.views.text :as text]
            [Reffonomics-Main.views.nav :as nav])
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

(defpartial flash-link [filename text]
  [:a {:href (str "/viewer/" filename)}
    [:button.btn.btn-primary (str text " &nbsp") [:i.icon-film.icon-white]]])

(defpage "/basic" []
  (template/basic
    [:div.row-fluid
      [:div.span3
        (nav/side-navbar)]
      [:div.span9
        [:div.hero-unit
          [:h1 "Basic Concepts"]
          [:div.accordion
            [:div.accordion-group
              [:div.accordion-heading
                [:a.accordion-toggle
                  {:data-toggle "collapse" :href "#1"}
                    [:h2 "Introduction to Economics Unit"]]
                [:div#1.accordion-body.collapse.in
                  [:div.accordion-inner
                    [:div.row-fluid
                      [:div.span6
                        [:h4 "1st Edition 2002"]
                          [:br]
                          (flash-link "whatiseconomics1" "What is Economics?")
                          [:br][:br]
                          [:a {:href "/viewer/oppotunitycost"}
                            [:button.btn.btn-primary "Opportunity Cost &nbsp"[:i.icon-film.icon-white]]]
                          [:br][:br]
                          [:a {:href "/viewer/resources"}
                            [:button.btn.btn-primary "Resources &nbsp"[:i.icon-film.icon-white]]]
                          [:br][:br]
                          [:a {:href "/viewer/fallacyofcompositionlesson"}
                            [:button.btn.btn-primary "Fallacies (Post Hoc and Composition) &nbsp"[:i.icon-film.icon-white]]]
                      ]
                      [:div.span6
                        [:h4 "2nd Edition 2004-2009"]
                          [:br]
                          [:a {:href "/viewer/whatiseconomics1"}
                            [:button.btn.btn-primary "What is Economics? &nbsp"[:i.icon-film.icon-white]]]
                          [:br][:br]
                          [:a {:href "/viewer/whatiseconomics1"}
                            [:button.btn.btn-primary "What is Economics? &nbsp"[:i.icon-film.icon-white]]]
                          [:br][:br]
                          [:a {:href "/viewer/whatiseconomics1"}
                            [:button.btn.btn-primary "What is Economics? &nbsp"[:i.icon-film.icon-white]]]
                      ]]
                    [:div.row-fluid
                      [:br]
                      [:a {:href "/viewer/whatiseconomics1"}
                        [:button.btn.btn-primary "What is Economics? &nbsp"[:i.icon-film.icon-white]]]
]]]]]
            [:div.accordion-group
              [:div.accordion-heading
                [:a.accordion-toggle
                  {:data-toggle "collapse" :href "#2"}
                    [:h2 "Production-Possibilities Curve/Frontier Unit"]]
                [:div#2.accordion-body.collapse
                  [:div.accordion-inner "TEST" ]]]]
            [:div.accordion-group
              [:div.accordion-heading
                [:a.accordion-toggle
                  {:data-toggle "collapse" :href "#3"}
                    [:h2 "Circular Flow Unit"]]
                [:div#3.accordion-body.collapse
                  [:div.accordion-inner "TEST" ]]]]
            [:div.accordion-group
              [:div.accordion-heading
                [:a.accordion-toggle
                  {:data-toggle "collapse" :href "#4"}
                     [:h2 "Supply and Demand Unit"]]
                [:div#4.accordion-body.collapse
                  [:div.accordion-inner "TEST" ]]]]
            [:div.accordion-group
              [:div.accordion-heading
                [:a.accordion-toggle
                  {:data-toggle "collapse" :href "#5"}
                     [:h2 "Price Ceiling and Price Floor"]]
                [:div#5.accordion-body.collapse
                  [:div.accordion-inner "TEST" ]]]]

]]]]
  ))

(defpage "/micro" []
  (template/micro
    [:div.row-fluid
      [:div.span3
        (nav/side-navbar)]
      [:div.span9
        [:div.hero-unit
          [:h1 "Micro Economics"]]]]
  ))

(defpage "/macro" []
  (template/macro
    [:div.row-fluid
      [:div.span3
        (nav/side-navbar)]
      [:div.span9
        [:div.hero-unit
          [:h1 "Macro Economics"]]]]
  ))

(defpage "/resources" []
  (template/resources
    [:div.row-fluid
      [:div.span3
        (nav/side-navbar)]
      [:div.span9
        [:div.hero-unit
          [:h1 "Resources"]]]]
  ))

(defpage "/about" []
  (template/about
    [:div.row-fluid
      [:div.span3
        (nav/side-navbar)]
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
        (nav/side-navbar)]
      [:div.span9
        [:div.hero-unit
          [:h1#tests "Test Center"]]]]))

(defpage "/viewer/:swf" {:keys [swf]}
  (template/viewer
    [:div.row-fluid
      [:div.span12
        [:div.hero-unit
          [:object
            [:param {:name swf :value (str "/res/" swf ".swf")}
              [:embed {:src (str "/res/" swf ".swf") :width "1100px" :height "650px"}]]]]]]))
