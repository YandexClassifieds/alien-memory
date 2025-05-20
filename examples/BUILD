load("//tools:defaults.bzl", "scala_binary")

scala_binary(
    name = "bounded_sequence",
    srcs = glob([
        "src/main/scala/**/BoundedSequenceExample.scala",
    ]),
    main_class = "example.BoundedSequenceExample",
    visibility = ["//visibility:private"],
    deps = [
        "//vs/vs/lib/alien/memory",
    ],
)

scala_binary(
    name = "multiple",
    srcs = glob([
        "src/main/scala/**/MultipleExample.scala",
    ]),
    main_class = "example.MultipleExample",
    visibility = ["//visibility:private"],
    deps = [
        "//vs/vs/lib/alien/memory",
    ],
)

scala_binary(
    name = "plain",
    srcs = glob([
        "src/main/scala/**/PlainExample.scala",
    ]),
    main_class = "example.PlainExample",
    visibility = ["//visibility:private"],
    deps = [
        "//vs/vs/lib/alien/memory",
    ],
)
