import unittest
import warnings
import logging
from stix2validator import validate_file, print_results, ValidationOptions
from pathlib import Path


class ResourceFileTest(unittest.TestCase):

    def setUp(self):
        self.validation_options = ValidationOptions(strict=True)
        self.resource_pathlist = Path("../../stix2gson/src/test/resources").glob('**/*.json')
        self.serialized_pathlist = Path("../../stix2gson/out/test/serialized").glob('**/*.json')

    def test_resource_files(self):
        for path in self.resource_pathlist:
            results = validate_file(str(path), self.validation_options)
            with self.subTest(str(path)):
                print_results([results])
                self.assertTrue(results.is_valid)

    def test_serialized_files(self):
        for path in self.serialized_pathlist:
            results = validate_file(str(path), self.validation_options)
            with self.subTest(str(path)):
                print_results([results])
                self.assertTrue(results.is_valid)
