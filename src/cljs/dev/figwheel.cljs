(ns dev.figwheel
  (:require [figwheel.client :as fw :include-macros true]))

(enable-console-print!)

(fw/watch-and-reload :websocket-url "ws://localhost:3449/figwheel-ws"
                     :jsload-callback (fn [] ))
