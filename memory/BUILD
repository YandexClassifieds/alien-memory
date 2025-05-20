load("//tools:defaults.bzl", "scala_library", "zio_test")

scala_library(
    name = "memory",
    srcs = glob([
        "src/main/scala/**/*.scala",
        "v21/main/scala/**/*.scala",
    ]),
    macro = True,
    visibility = ["//vs:__subpackages__"],
    deps = [
        "@maven//:org_rudogma_supertagged_2_13",
    ],
)

scala_library(
    name = "memory_v22",
    srcs = glob([
        "src/main/scala/**/*.scala",
        "v22/main/scala/**/*.scala",
    ]),
    macro = True,
    visibility = ["//vs:__subpackages__"],
    deps = [
        "@maven//:org_rudogma_supertagged_2_13",
    ],
)

zio_test(
    name = "test",
    srcs = glob([
        "src/test/scala/**/*.scala",
    ]),
    visibility = ["//visibility:private"],
    deps = [
        ":memory",
    ],
)
